package cl.movistar.hibernate.dto;
// Generated 13-05-2014 07:57:07 PM by Hibernate Tools 3.6.0



/**
 * AccionSistema generated by hbm2java
 */
public class AccionSistema  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private String tipo;
     private String data;

    public AccionSistema() {
    }

    public AccionSistema(int id, String nombre, String descripcion, String tipo, String data) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.tipo = tipo;
       this.data = data;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }




}


