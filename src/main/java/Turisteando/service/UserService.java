
package Turisteando.service;

import Turisteando.interfaceService.IpersonaService;
import Turisteando.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public IpersonaService personaService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Persona persona = this.personaService.findbyNombre(email);
        UserPrincipal userprincipal = new UserPrincipal(persona);
        return userprincipal;
    }
    

}
