/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando.service;

import Turisteando.interfaceService.IpersonaService;
import Turisteando.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService{
    
    @Autowired
    public IpersonaService personaService;

    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {
       Persona persona = this.personaService.findbyNombre(Email);
       Userprincipal userprincipal = new Userprincipal(persona);
       return userprincipal;
    }
}

