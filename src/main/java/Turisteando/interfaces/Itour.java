
package Turisteando.interfaces;


import Turisteando.modelo.tours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itour extends CrudRepository <tours,Integer >{
    
}
