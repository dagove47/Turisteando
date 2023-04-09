
package Turisteando.interfaces;


import Turisteando.modelo.destinos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Idestino extends CrudRepository <destinos ,Integer >{
    
}
