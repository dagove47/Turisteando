
package Turisteando.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "servicioalcliente")

public class servicioalcliente {
     @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fechadesolictud;
    private String nombresolicitante;
    private String problema;
    private String accionessolicitadas;
    private String comentariosadicionales;

    public servicioalcliente() {
    }

    public servicioalcliente(int id, String fechadesolictud, String nombresolicitante, String problema, String accionessolicitadas, String comentariosadicionales) {
        this.id = id;
        this.fechadesolictud = fechadesolictud;
        this.nombresolicitante = nombresolicitante;
        this.problema = problema;
        this.accionessolicitadas = accionessolicitadas;
        this.comentariosadicionales = comentariosadicionales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechadesolictud() {
        return fechadesolictud;
    }

    public void setFechadesolictud(String fechadesolictud) {
        this.fechadesolictud = fechadesolictud;
    }

    public String getNombresolicitante() {
        return nombresolicitante;
    }

    public void setNombresolicitante(String nombresolicitante) {
        this.nombresolicitante = nombresolicitante;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getAccionessolicitadas() {
        return accionessolicitadas;
    }

    public void setAccionessolicitadas(String accionessolicitadas) {
        this.accionessolicitadas = accionessolicitadas;
    }

    public String getComentariosadicionales() {
        return comentariosadicionales;
    }

    public void setComentariosadicionales(String comentariosadicionales) {
        this.comentariosadicionales = comentariosadicionales;
    }
    
    
    
}
