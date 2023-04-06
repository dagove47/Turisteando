
package Turisteando.interfaces;


import Turisteando.modelo.personacontacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface Icontacto extends CrudRepository <personacontacto,Integer > {
    
    
}
