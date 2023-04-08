
package Turisteando.service;


import Turisteando.interfaceService.IseguroService;
import Turisteando.interfaces.Iseguros;
import Turisteando.modelo.seguros;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class segurosservice implements IseguroService {

  @Autowired
    private Iseguros data; 
  
  
    @Override
    public List<seguros> listar() {
      return (List<seguros>) data.findAll();
    }

    @Override
    public Optional<seguros> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(seguros p) {
    
        int res=0;
    seguros Seguros= data.save(p);
        if (!Seguros.equals(null)) {
            res=1;  
        }
    return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}