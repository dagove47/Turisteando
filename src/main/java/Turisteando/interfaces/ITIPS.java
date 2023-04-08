
package Turisteando.interfaces;


import Turisteando.modelo.tips;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ITIPS extends CrudRepository <tips,Integer > {
    
    
}