
package Turisteando.interfaceService;


import Turisteando.modelo.tours;
import java.util.List;
import java.util.Optional;


public interface ItoursService {
    
     public List <tours>listar();
    public Optional<tours>listarid(int id );
    public int save(tours p);
    public void delete(int id);
    
    
}
