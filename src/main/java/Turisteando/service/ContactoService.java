
package Turisteando.service;


import Turisteando.interfaceService.IpersonacontactoService;
import Turisteando.interfaces.Icontacto;
import Turisteando.modelo.personacontacto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IpersonacontactoService {

    @Autowired
    private Icontacto data; 
    @Override
    public List<personacontacto> listar() {
      return (List<personacontacto>) data.findAll();
    }

    @Override
    public Optional<personacontacto> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(personacontacto p) {
    
        int res=0;
    personacontacto Personacontacto= data.save(p);
        if (!Personacontacto.equals(null)) {
            res=1;  
        }
    return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}
