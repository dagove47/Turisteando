

package Turisteando;

import org.springframework.security.core.userdetails.User;
import Turisteando.modelo.Usuario;
import Turisteando.service.UsuarioServicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import static org.springframework.security.config.web.server.ServerHttpSecurity.http;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import static org.springframework.security.config.web.server.ServerHttpSecurity.http;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;


@EnableWebSecurity
@Configuration
public class SecurityConfig {
    


    
    @Bean
    protected InMemoryUserDetailsManager configureAuthentication(){
       List <UserDetails> userdetails = new ArrayList<>();
       List <GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("USER"));
        
// Crea un objeto UserDetails para el usuario "pan"
        UserDetails userDetails = new User("pan", "$2a$12$XNmI92PolyOM66pZSzpJ1e0ehj6Csqx/G3HdzUfndnbu1oNDDVb5y", roles);

        // Agrega el objeto UserDetails a la lista de usuarios
        userdetails.add(userDetails);

        // Crea una instancia de InMemoryUserDetailsManager y agrega la lista de usuarios
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(userdetails);

        return userDetailsManager;
  

    }
    
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions()
                .disable();

        http
                .authorizeHttpRequests()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .requestMatchers("/contacto").hasAuthority("USER")
                .requestMatchers("/", "/home").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/home")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/home")
                .permitAll()
                .and()
                .userDetailsService(configureAuthentication());

        return http.build();

    }
                  //.permitAll()
                //.anyRequest().authenticated()
                    //.loginPage("/login").permitAll().defaultSuccessUrl("/reserva", true)
                //.and().logout()
               // .invalidateHttpSession(true)
               // .clearAuthentication(true)
                //.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
              //  .logoutSuccessUrl("/login?logout")
               // .permitAll();
       // http.authenticationProvider(daoauthenticationProvider());

        //DefaultSecurityFilterChain build = http.build();
        //return build;
    
   // nuevo 
    /*
    @Autowired
    private UsuarioServicio usuarioServicio;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider daoauthenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(usuarioServicio);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    
    //public void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.authenticationProvider(daoauthenticationProvider());

   // }
    */
    
           //userdetails.add( new User("pan", "$2a$12$XNmI92PolyOM66pZSzpJ1e0ehj6Csqx/G3HdzUfndnbu1oNDDVb5y", roles));
       
       // return new InMemoryUserDetailsManager();
}
    
    
    
    

