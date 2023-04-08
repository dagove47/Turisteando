
package Turisteando.controler;


import Turisteando.interfaceService.IseguroService;
import Turisteando.modelo.seguros;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping 
public class controladorseguros {
    
    @Autowired
    private IseguroService service;
    
    
    @GetMapping("/seguros")
    public String listar(Model model){
       List<seguros>Seguros = service.listar();
       model.addAttribute("Seguros",Seguros );
        return "indexseguros";
        
        
        

    
}
    @GetMapping("/new-seguros")
    public String agregar(Model model) {
        model.addAttribute("Seguros", new seguros());
        
        
        
       return"formseguros"; 
    }
    
    @PostMapping("/save-seguros")
    public String save (@Valid seguros p, Model model){
       
        service.save(p);
        
        return"redirect:/seguros";
        
    }
    @GetMapping("/editar-seguros/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<seguros>Seguros=service.listarid(id);
       model.addAttribute("Seguros", Seguros);
       
       return "formseguros"; 
    }
    @GetMapping("/eliminar-seguros/{id}")
    public String delete(Model model, @PathVariable int id ){
     service.delete(id);
        
        return"redirect:/seguros";
        
    }
     } 