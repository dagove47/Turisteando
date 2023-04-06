
package Turisteando.controler;


import Turisteando.interfaceService.IpersonacontactoService;
import Turisteando.modelo.personacontacto;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping 
public class Controladorcomentarios {
   
    @Autowired
    private IpersonacontactoService service;
    
    
    @GetMapping("/contacto")
    public String listar(Model model){
       List<personacontacto>PersonaContacto = service.listar();
       model.addAttribute("PersonaContacto",PersonaContacto );
        return "indexcontacto";
        
        
        

    
}
    @GetMapping("/new-contacto")
    public String agregar(Model model) {
        model.addAttribute("Personacontacto", new personacontacto());
        
        
        
       return"formcontacto"; 
    }
    
    @PostMapping("/save-contacto")
    public String save (@Valid personacontacto p, Model model){
        service.save(p);
        
        return"redirect:/contacto";
        
    }
    @GetMapping("/editar-contacto/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<personacontacto>Personacontacto=service.listarid(id);
       model.addAttribute("Personacontacto", Personacontacto);
       
       return "formcontacto"; 
    }
    @GetMapping("/eliminar-contacto/{id}")
    public String delete(Model model, @PathVariable int id ){
        service.delete(id);
        
        return"redirect:/contacto";
        
    }
    
}
