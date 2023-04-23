
package Turisteando.interfaceService;


import Turisteando.modelo.destinos;
import java.util.List;
import java.util.Optional;


public interface IdestinoService {
    public List <destinos>listar();
    public Optional<destinos>listarid(int id );
    public int save(destinos p);
    public void delete(int id);
}
