
package Turisteando.modelo;
/*
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tours")
public class tours {
    
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String nombre_tour;
private String destinos;
private String tipo_de_tour;
private String duracion;
private String incluye;
private String precios;
private String cantidad_de_personas;
private String guiasturisticos;
private String seguridad;

public tours() {  
    
    
}

    public tours(int id, String nombre_tour, String destinos, String tipo_de_tour, String duracion, String incluye, String precios, String cantidad_de_personas, String guiasturisticos, String seguridad) {
        this.id = id;
        this.nombre_tour = nombre_tour;
        this.destinos = destinos;
        this.tipo_de_tour = tipo_de_tour;
        this.duracion = duracion;
        this.incluye = incluye;
        this.precios = precios;
        this.cantidad_de_personas = cantidad_de_personas;
        this.guiasturisticos = guiasturisticos;
        this.seguridad = seguridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(String nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public String getDestinos() {
        return destinos;
    }

    public void setDestinos(String destinos) {
        this.destinos = destinos;
    }

    public String getTipo_de_tour() {
        return tipo_de_tour;
    }

    public void setTipo_de_tour(String tipo_de_tour) {
        this.tipo_de_tour = tipo_de_tour;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIncluye() {
        return incluye;
    }

    public void setIncluye(String incluye) {
        this.incluye = incluye;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public String getCantidad_de_personas() {
        return cantidad_de_personas;
    }

    public void setCantidad_de_personas(String cantidad_de_personas) {
        this.cantidad_de_personas = cantidad_de_personas;
    }

    public String getGuiasturisticos() {
        return guiasturisticos;
    }

    public void setGuiasturisticos(String guiasturisticos) {
        this.guiasturisticos = guiasturisticos;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
    



    


}