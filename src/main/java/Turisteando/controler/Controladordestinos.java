
package Turisteando.controler;


import Turisteando.interfaceService.IdestinoService;
import Turisteando.modelo.destinos;
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
public class Controladordestinos {

    @Autowired
    private IdestinoService service;
    
    
    @GetMapping("/destinos")
    public String listar(Model model){
       List<destinos>Destinos = service.listar();
       model.addAttribute("Destinos", Destinos);
        return "indexdestinos";
        
        
        

    
}
    @GetMapping("/new-destinos")
    public String agregar(Model model) {
        model.addAttribute("Destinos", new destinos());
        
        
        
       return"formsdestinos"; 
    }
    
    @PostMapping("/save-destinos")
    public String save (@Valid destinos p, Model model){
       
        service.save(p);
        
        return"redirect:/destinos";
        
    }
    @GetMapping("/editar-destinos/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<destinos> Destinos=service.listarid(id);
       model.addAttribute("Destinos", Destinos);
       
       return "formsdestinos"; 
    }
    @GetMapping("/eliminar-destinos/{id}")
    public String delete(Model model, @PathVariable int id ){
     service.delete(id);
        
        return"redirect:/destinos";
        
    }
     } 
