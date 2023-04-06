
package Turisteando.interfaceService;


import Turisteando.modelo.personacontacto;
import java.util.List;
import java.util.Optional;


public interface IpersonacontactoService {
    
    public List <personacontacto>listar();
    public Optional<personacontacto>listarid(int id );
    public int save(personacontacto p);
    public void delete(int id);
    
    
    
}
