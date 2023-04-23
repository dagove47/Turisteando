
package Turisteando.interfaces;


import Turisteando.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipersona extends CrudRepository <Persona,Integer >  {
    
    
}
