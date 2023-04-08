
package Turisteando.service;


import Turisteando.interfaceService.ItipsService;
import Turisteando.interfaces.ITIPS;
import Turisteando.modelo.tips;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipsService implements ItipsService  {
    @Autowired
    private ITIPS data; 
    
    @Override
    public List<tips> listar() {
      return (List<tips>) data.findAll();
    }

    @Override
    public Optional<tips> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(tips p) {
    
        int res=0;
    tips Tips= data.save(p);
        if (!Tips.equals(null)) {
            res=1;  
        }
    return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}
