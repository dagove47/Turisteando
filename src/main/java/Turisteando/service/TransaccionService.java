
package Turisteando.service;


import Turisteando.dao.TransaccionDao;
import Turisteando.modelo.Transaccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    
    
 @Service
public class TransaccionService {

    @Autowired
    private TransaccionDao transaccionDao;

    public void guardarTransaccion(Transaccion transaccion) {
        transaccionDao.guardarTransaccion(transaccion);
    }

    public List<Transaccion> obtenerTransacciones() {
        return transaccionDao.obtenerTransacciones();
    }
}
    

