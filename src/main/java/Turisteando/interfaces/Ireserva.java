
package Turisteando.interfaces;


import Turisteando.modelo.reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ireserva extends CrudRepository <reserva,Integer > {
    
}
