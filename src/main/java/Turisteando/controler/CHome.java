/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fagueros
 */
@Controller 
@RequestMapping ("/home")
public class CHome {
    
    @GetMapping("/home")
    public String verHome(){
        return "home";
    }
    
    @GetMapping ("/")
    public String verInicio(){
        return "home";
    }
}
