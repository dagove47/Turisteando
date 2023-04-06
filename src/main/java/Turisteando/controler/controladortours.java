
package Turisteando.controler;


import Turisteando.interfaceService.ItoursService;
import Turisteando.modelo.tours;
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
public class controladortours {
    
    @Autowired
    private ItoursService service;
    
    
    @GetMapping("/tours")
    public String listar(Model model){
       List<tours>Tours = service.listar();
       model.addAttribute("Tours",Tours);
        return "indextours";
    
    
    
    
}
  @GetMapping("/new-tours")
    public String agregar(Model model) {
        model.addAttribute("Tours", new tours());
        
        
        
       return"formtours"; 
    }
    
    @PostMapping("/save-tours")
    public String save (@Valid tours p, Model model){
        service.save(p);
        
        return"redirect:/tours";
        
    }
    @GetMapping("/editar-tours/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<tours>Tours=service.listarid(id);
       model.addAttribute("Tours", Tours);
       
       return "formtours"; 
    }
    @GetMapping("/eliminar-tours/{id}")
    public String delete(Model model, @PathVariable int id ){
        service.delete(id);
        
        return"redirect:/tours";
        
    }  
    
}