package cl.movistar.hibernate.dto;
// Generated 13-05-2014 07:57:07 PM by Hibernate Tools 3.6.0



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer codigo;
     private String nombre;
     private String rut;
     private String contrasena;

    public Usuarios() {
    }

    public Usuarios(String nombre, String rut, String contrasena) {
       this.nombre = nombre;
       this.rut = rut;
       this.contrasena = contrasena;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }




}

