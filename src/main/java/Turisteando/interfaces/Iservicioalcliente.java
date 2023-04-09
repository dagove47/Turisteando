
package Turisteando.interfaces;


import Turisteando.modelo.servicioalcliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface Iservicioalcliente extends CrudRepository <servicioalcliente ,Integer >{
    
    
    
}
