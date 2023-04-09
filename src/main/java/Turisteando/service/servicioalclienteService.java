
package Turisteando.service;


import Turisteando.interfaceService.IservicioalclienteService;
import Turisteando.interfaces.Iservicioalcliente;
import Turisteando.modelo.servicioalcliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicioalclienteService implements IservicioalclienteService {
@Autowired
    
private Iservicioalcliente data; 
  
  
    @Override
    public List<servicioalcliente> listar() {
      return (List<servicioalcliente>) data.findAll();
    }

    @Override
    public Optional<servicioalcliente> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(servicioalcliente p) {
    
        int res=0;
    servicioalcliente Servicioalcliente= data.save(p);
        if (!Servicioalcliente.equals(null)) {
            res=1;  
        }
    return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}
