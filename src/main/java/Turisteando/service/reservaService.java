
package Turisteando.service;


import Turisteando.interfaceService.IreservaService;
import Turisteando.interfaces.Ireserva;
import Turisteando.modelo.reserva;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class reservaService implements IreservaService {
@Autowired
private Ireserva data; 

@Override
public List<reserva> listar() {
  return (List<reserva>) data.findAll();
}

@Override
public Optional<reserva> listarid(int id) {
    return data.findById(id);
}

@Override
public int save(reserva p) {

    int res=0;
    reserva Reserva= data.save(p);
    if (!Reserva.equals(null)) {
        res=1;  
    }
    return res;
}

@Override
public void delete(int id) {
    data.deleteById(id);
}}