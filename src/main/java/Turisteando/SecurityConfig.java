/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando;

import Turisteando.service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebSecurityConfigurer{
    
    
// nuevo 
    
    @Autowired
     private UsuarioServicio usuarioServicio;
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(usuarioServicio);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
    
    
    
    
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                
                .requestMatchers("/", "/home", "/login", "/signup", 
                        "**/css/**" , "**/images/**" , "**/templates/**").permitAll()
                //.requestMatchers("/reserva").hasAnyRole("ADMIN", "USER")
                
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()//.defaultSuccessUrl("/reserva", true)
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher ("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll();
        
        //http.httpBasic().disable();
        /*
        http
                .cors().and()
                .csrf().disable().authorizeHttpRequests()
                .requestMatchers("/users").hasRole("manager")
                .anyRequest().authenticated()
                .and()
                .formLogin();
        spring.security.user.name=fran
spring.security.user.password=1234
spring.security.user.roles = manager
        
        
      */  
    }



    @Override
    public void init(SecurityBuilder builder) throws Exception {
        
}

    @Override
    public void configure(SecurityBuilder builder) throws Exception {
        
    }
    



  /*  
@Autowired
private UsuarioServicio usuarioServicio;

@Bean
public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

@Bean
public DaoAuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    daoAuthenticationProvider.setUserDetailsService(usuarioServicio);
    return daoAuthenticationProvider;
}

@Override
protected void configure (AuthenticationManagerBuilder daoAuthenticationProvider) throws Exception {
    daoAuthenticationProvider.authenticationProvider(authenticationProvider());
}

@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/login")
                .hasRole("ADMIN")
                .antMatchers("/login")
                .hasAnyRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/reserva", true)
                .and().logout()
                .logoutUrl("/contacto")
                .logoutSuccessUrl("/reserva");
    } */



}
