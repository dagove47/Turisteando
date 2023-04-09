
package Turisteando.interfaceService;


import Turisteando.modelo.reserva;
import java.util.List;
import java.util.Optional;

public interface IreservaService {
    
  
     public List <reserva>listar();
    public Optional<reserva>listarid(int id );
    public int save(reserva p);
    public void delete(int id);

 }   

