
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
@Table(name= "reservas1")
public class reserva {
  @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


private int id;
     private String nombreusuario;
     private String nombredetour;
     private String fechadereserva;
     private String fechadeinicio;
     private String fechadefin;
     private String numeropersonas;
     private String metododepago;
     private String comentarioreserva;

    public reserva() {
    }

    public reserva(int id, String nombreusuario, String nombredetour, String fechadereserva, String fechadeinicio, String fechadefin, String numeropersonas, String metododepago, String comentarioreserva) {
        this.id = id;
        this.nombreusuario = nombreusuario;
        this.nombredetour = nombredetour;
        this.fechadereserva = fechadereserva;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
        this.numeropersonas = numeropersonas;
        this.metododepago = metododepago;
        this.comentarioreserva = comentarioreserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getNombredetour() {
        return nombredetour;
    }

    public void setNombredetour(String nombredetour) {
        this.nombredetour = nombredetour;
    }

    public String getFechadereserva() {
        return fechadereserva;
    }

    public void setFechadereserva(String fechadereserva) {
        this.fechadereserva = fechadereserva;
    }

    public String getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(String fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getFechadefin() {
        return fechadefin;
    }

    public void setFechadefin(String fechadefin) {
        this.fechadefin = fechadefin;
    }

    public String getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(String numeropersonas) {
        this.numeropersonas = numeropersonas;
    }

    public String getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(String metododepago) {
        this.metododepago = metododepago;
    }

    public String getComentarioreserva() {
        return comentarioreserva;
    }

    public void setComentarioreserva(String comentarioreserva) {
        this.comentarioreserva = comentarioreserva;
    }

     
    
    
    
}
