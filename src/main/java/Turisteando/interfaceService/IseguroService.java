
package Turisteando.interfaceService;


import Turisteando.modelo.seguros;
import java.util.List;
import java.util.Optional;


public interface IseguroService {
     public List <seguros>listar();
    public Optional<seguros>listarid(int id );
    public int save(seguros p);
    public void delete(int id);
    
    
    
}