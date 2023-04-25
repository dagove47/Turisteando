/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turisteando;

/**
 *
 * @author fagueros
 */
public class UsuarioRegistroDTO {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String nacimiento;
    private String email;
    private String password;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(String nombre, String apellido, String telefono, String nacimiento, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.email = email;
        this.password = password;
    }

    public UsuarioRegistroDTO(Long id, String nombre, String apellido, String telefono, String nacimiento, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.email = email;
        this.password = password;
    }
    
    

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }


    
}
