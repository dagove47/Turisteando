
package Turisteando.controler;



import Turisteando.interfaceService.IpersonaService;
import Turisteando.modelo.Persona;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IpersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        
      List<Persona>personas = service.listar();
      model.addAttribute("personas",personas);  
        return "index";
    }
  
 @GetMapping("/new")   
  public String agregar(Model model) {
      model.addAttribute("persona",new Persona());
     return "form"; 
  }

  @PostMapping("/save") 
public String save(@Valid Persona p, Model model) {
    service.save(p);
    return "redirect:/listar"; 
} 
 @GetMapping("/editar/{id}")
public String editar(@PathVariable int id, Model model) {
    Optional<Persona> persona = service.listarid(id);
    model.addAttribute("persona", persona.get());
    return "form";
}   
@GetMapping("/eliminar/{id}")
public String delete (Model model, @PathVariable int id ){
  service.delete(id);
  return "redirect:/listar" ;
    
    
}
    
    
}


