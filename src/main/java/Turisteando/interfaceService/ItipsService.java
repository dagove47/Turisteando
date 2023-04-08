
package Turisteando.interfaceService;


import Turisteando.modelo.tips;
import java.util.List;
import java.util.Optional;

public interface ItipsService {
     public List <tips>listar();
    public Optional<tips>listarid(int id );
    public int save(tips p);
    public void delete(int id);
}
