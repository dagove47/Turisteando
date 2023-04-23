
package SecurityConfiguration;

import Turisteando.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity

public class SecConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private UserService userservice;
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder bvCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bvCryptPasswordEncoder;
    }
    
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
    
    
    @Bean 
    DaoAuthenticationProvider authprovider(){
        
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
      
        return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler(){
        return new AppAuthenticationSuccessHandler();
    
    }
    
    public SecConfig(UserService userPrincipalDetailsService){
    this.userservice = userPrincipalDetailsService;
    
    }
    
    @Override 
    protected void configure (AuthenticationManagerBuilder auth){
        auth.authenticationProvider(authprovider());
    }
    
    
    @Override
    protected void configure (HttpSecurity http) throws Exception{
        http.authorizeRequests()
                
                .antMatchers("/home" ,"/home.html", "/login")
                .hasRole("ADMIN")
                //se definen las rutas
                .antMatchers("")
                .hasAnyRole("USER" , "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/home.html", true).and().logout()
                .logoutUrl("logout")
                .logoutSuccessUrl("/home");
        
      
       
    }
    
    
    
}
