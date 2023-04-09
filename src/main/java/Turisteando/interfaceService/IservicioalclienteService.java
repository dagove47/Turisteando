
package Turisteando.interfaceService;


import Turisteando.modelo.servicioalcliente;
import java.util.List;
import java.util.Optional;

public interface IservicioalclienteService {
    public List <servicioalcliente>listar();
    public Optional<servicioalcliente>listarid(int id );
    public int save(servicioalcliente p);
    public void delete(int id);
}
