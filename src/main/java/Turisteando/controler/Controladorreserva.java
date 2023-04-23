
package Turisteando.controler;


import Turisteando.interfaceService.IreservaService;
import Turisteando.modelo.Transaccion;
import Turisteando.modelo.reserva;
import Turisteando.service.TransaccionService;
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
public class Controladorreserva {
    
    @Autowired
    private IreservaService service;
    
    @Autowired
    private TransaccionService transaccionService;
    
    @GetMapping("/reserva")
    public String listar(Model model) {
        List<reserva>Reserva = service.listar();
        model.addAttribute("Reserva",Reserva);
        return "indexreserva";
    }
    
    @GetMapping("/new-reserva")
    public String agregar(Model model) {
        model.addAttribute("Reserva", new reserva());
        return "formreserva"; 
    }
    
    @PostMapping("/save-reserva")
    public String save (@Valid reserva p, Model model){
        service.save(p);
        
        // Crear transacción
        Transaccion transaccion = new Transaccion();
        transaccion.setTipo("CREAR");
        transaccion.setDescripcion("Se creó una nueva reserva con ID: " + p.getId());
        transaccionService.guardarTransaccion(transaccion);
        
        return "redirect:/reserva";
    }
    
    @GetMapping("/editar-reserva/{id}")
    public String editar (@PathVariable int id, Model model){
        Optional<reserva>Reserva=service.listarid(id);
        model.addAttribute("Reserva", Reserva);
        // Crear transacción
        Transaccion transaccion = new Transaccion();
        transaccion.setTipo("EDITAR");
        
        transaccionService.guardarTransaccion(transaccion);
        return "formreserva"; 
    }
    
    @PostMapping("/update-reserva")
    public String update(@Valid reserva p, Model model) {
        
        service.save(p);
        
        
        
        return "redirect:/reserva";
    }
    
    @GetMapping("/eliminar-reserva/{id}")
    public String delete(Model model, @PathVariable int id ){
        service.delete(id);
        
        // Crear transacción
        Transaccion transaccion = new Transaccion();
        transaccion.setTipo("ELIMINAR");
        transaccion.setDescripcion("Se eliminó la reserva con ID: " + id);
        transaccionService.guardarTransaccion(transaccion);
        
        return "redirect:/reserva";
    }
}
