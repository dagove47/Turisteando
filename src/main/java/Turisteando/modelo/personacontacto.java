
package Turisteando.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "personacontacto")



 public class personacontacto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String producto_interesado;
    private String contacto;
    private String fecha_solicitud;
    private String consulta;
    
    
    public  personacontacto(){  
 }

    public personacontacto(int id, String nombre, String producto_interesado, String contacto, String fecha_solicitud, String consulta) {
        this.id = id;
        this.nombre = nombre;
        this.producto_interesado = producto_interesado;
        this.contacto = contacto;
        this.fecha_solicitud = fecha_solicitud;
        this.consulta = consulta;
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

    public String getProducto_interesado() {
        return producto_interesado;
    }

    public void setProducto_interesado(String producto_interesado) {
        this.producto_interesado = producto_interesado;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    
    
    
    
    
    
}
