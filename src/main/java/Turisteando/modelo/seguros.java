
package Turisteando.modelo;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import jakarta.persistence.Table;

@Entity
@Table(name= "seguros")
public class seguros {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String aseguradora;
private String informacion;
private String tipo_seguro;
private String cobertura;
private String precio;

public seguros(){  
}

    public seguros(int id, String aseguradora, String informacion, String tipo_seguro, String cobertura, String precio) {
        this.id = id;
        this.aseguradora = aseguradora;
        this.informacion = informacion;
        this.tipo_seguro = tipo_seguro;
        this.cobertura = cobertura;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getTipo_seguro() {
        return tipo_seguro;
    }

    public void setTipo_seguro(String tipo_seguro) {
        this.tipo_seguro = tipo_seguro;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }



    
}
