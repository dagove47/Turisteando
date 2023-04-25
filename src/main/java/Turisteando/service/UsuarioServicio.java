/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando.service;

import Turisteando.UsuarioRegistroDTO;

import Turisteando.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UsuarioServicio extends UserDetailsService{
    
    public Usuario save(UsuarioRegistroDTO registroDTO);
    
}
