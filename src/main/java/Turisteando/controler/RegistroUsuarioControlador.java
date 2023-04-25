/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando.controler;

import Turisteando.UsuarioRegistroDTO;
import Turisteando.service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class RegistroUsuarioControlador {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    
    @GetMapping
    public String mostrarRegistro(){
        return "signup";
    }
    
    @PostMapping
    public String registrarCuenta(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
        usuarioServicio.save(registroDTO);
        return "redirect:/signup?exito";
    }
    
}

