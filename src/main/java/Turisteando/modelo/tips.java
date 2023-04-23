
package Turisteando.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tips_viajes")
public class tips {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tip;

    public tips() {
    }

    public tips(int id, String nombre, String tip) {
        this.id = id;
        this.nombre = nombre;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    
    
    
}

