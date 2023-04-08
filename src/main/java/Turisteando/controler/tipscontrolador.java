
package Turisteando.controler;

import Turisteando.interfaceService.ItipsService;
import Turisteando.modelo.tips;
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
public class tipscontrolador {

    @Autowired
    private ItipsService service;
    
    
    @GetMapping("/tips")
    public String listar(Model model){
       List<tips>Tips = service.listar();
       model.addAttribute("Tips",Tips );
        return "indextips";
        
        
        

    
}
    @GetMapping("/new-tips")
    public String agregar(Model model) {
        model.addAttribute("Tips", new tips());
        
        
        
       return"formtips"; 
    }
    
    @PostMapping("/save-tips")
    public String save (@Valid tips p, Model model){
        service.save(p);
        
        return"redirect:/tips";
        
    }
    @GetMapping("/editar-tips/{id}")
    public String editar (@PathVariable int id, Model model){
       Optional<tips>Tips=service.listarid(id);
       model.addAttribute("Tips", Tips);
       
       return "formtips"; 
    }
    @GetMapping("/eliminar-tips/{id}")
    public String delete(Model model, @PathVariable int id ){
        service.delete(id);
        
        return"redirect:/tips";
        
    }
    
}
