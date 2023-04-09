
package Turisteando.controler;


import Turisteando.interfaceService.IservicioalclienteService;
import Turisteando.modelo.servicioalcliente;
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
public class Controladorservicioalcliente {
  
    @Autowired
    private IservicioalclienteService service;
    
    
    @GetMapping("/servicioalcliente")
    public String listar(Model model){
       List<servicioalcliente>Servicioalcliente = service.listar();
       model.addAttribute("Servicioalcliente", Servicioalcliente);
        return "indexservicioalcliente";
        
        
        

    
}
    @GetMapping("/new-servicioalcliente")
    public String agregar(Model model) {
        model.addAttribute("Servicioalcliente", new servicioalcliente());
        
        
        
       return"formservicioalcliente"; 
    }
    
    @PostMapping("/save-servicioalcliente")
    public String save (@Valid servicioalcliente p, Model model){
       
        service.save(p);
        
        return"redirect:/servicioalcliente";
        
    }
    @GetMapping("/editar-servicioalcliente/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<servicioalcliente> Servicioalcliente=service.listarid(id);
       model.addAttribute("Servicioalcliente", Servicioalcliente);
       
       return "formservicioalcliente"; 
    }
    @GetMapping("/eliminar-servicioalcliente/{id}")
    public String delete(Model model, @PathVariable int id ){
     service.delete(id);
        
        return"redirect:/servicioalcliente";
        
    }
     } 