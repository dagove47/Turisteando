
package Turisteando.dao;


import Turisteando.modelo.Transaccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@Component
public class TransaccionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void guardarTransaccion(Transaccion transaccion) {
        String sql = "INSERT INTO transacciones (tipo, descripcion) VALUES (?, ?)";
        jdbcTemplate.update(sql, transaccion.getTipo(), transaccion.getDescripcion() );
    }

    public List<Transaccion> obtenerTransacciones() {
        String sql = "SELECT * FROM transacciones";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Transaccion transaccion = new Transaccion();
            transaccion.setId(rs.getLong("id"));
            
            transaccion.setTipo(rs.getString("tipo"));
            transaccion.setDescripcion("descripcion");
            
            return transaccion;
        });
    }
}
    
    

