
package Turisteando.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Collection;


@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    


    
    public Persona (){
       
        
        
    } 

    public Persona(int id, String name, String telefono) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }  
    
    
}
