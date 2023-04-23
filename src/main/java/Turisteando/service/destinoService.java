
package Turisteando.service;


import Turisteando.interfaceService.IdestinoService;
import Turisteando.interfaces.Idestino;
import Turisteando.modelo.destinos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class destinoService implements IdestinoService {
    
@Autowired
    
private Idestino data; 
  
  
    @Override
    public List<destinos> listar() {
      return (List<destinos>) data.findAll();
    }

    @Override
    public Optional<destinos> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(destinos p) {
    
        int res=0;
    destinos Destinos= data.save(p);
        if (!Destinos.equals(null)) {
            res=1;  
        }
    return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}
