
package Turisteando.interfaceService;


import Turisteando.modelo.Persona;
import java.util.List;
import java.util.Optional;




public interface IpersonaService {
    public List <Persona>listar();
    public Optional<Persona>listarid(int id );
    public int save(Persona p);
    public void delete(int id);
    public Persona findbyNombre(String username);
    
    
    
    
}
