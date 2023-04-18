
package Turisteando.modelo;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "destinos")
public class destinos {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombredestino;
    private String ubicacion;
    private String descripcion;
    private String categoria;
    private String precio;  

    public destinos() {
    }

    public destinos(int id, String nombredestino, String ubicacion, String descripcion, String categoria, String precio) {
        this.id = id;
        this.nombredestino = nombredestino;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombredestino() {
        return nombredestino;
    }

    public void setNombredestino(String nombredestino) {
        this.nombredestino = nombredestino;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
    
}

