
package Turisteando.service;


import Turisteando.interfaceService.ItoursService;
import Turisteando.interfaces.Itour;
import Turisteando.modelo.tours;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class toursService implements ItoursService  {

    
    
    
    @Autowired
    private Itour data;
    
    
    @Override
    public List<tours> listar() {
        return (List<tours>) data.findAll();
        
    }

    @Override
    public Optional<tours> listarid(int id) {
         return data.findById(id);
    }

    @Override
    public int save(tours p) {
           int res=0;
    tours Tours= data.save(p);
        if (!Tours.equals(null)) {
            res=1;  
        }
    return res;
    }
    @Override
    public void delete(int id) {
        
        data.deleteById(id);
    }
    
    
}
