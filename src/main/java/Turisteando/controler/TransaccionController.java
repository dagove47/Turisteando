
package Turisteando.controler;


import Turisteando.modelo.Transaccion;
import Turisteando.service.TransaccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @PostMapping
    public void guardarTransaccion(@RequestBody Transaccion transaccion) {
        transaccionService.guardarTransaccion(transaccion);
    }

    @GetMapping
    public List<Transaccion> obtenerTransacciones() {
        return transaccionService.obtenerTransacciones();
    }
}