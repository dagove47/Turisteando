/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando.service;

import Turisteando.UsuarioRegistroDTO;
import Turisteando.interfaces.UsuarioRepositorio;
import Turisteando.modelo.Rol;
import Turisteando.modelo.Usuario;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio; 
    private BCryptPasswordEncoder passwordEncoder;

    
    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        Usuario persona = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(),
                registroDTO.getTelefono(),
                registroDTO.getNacimiento(),
                registroDTO.getEmail(),
                passwordEncoder.encode(registroDTO.getPassword())
                ,Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(persona);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario persona = usuarioRepositorio.findByEmail(username);
        if (persona == null) {
            throw new UsernameNotFoundException("Usuario o password invalido");
        }
        return new User(persona.getEmail(), persona.getPassword(), mapearAutoridadesRoles(persona.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }
    
}
