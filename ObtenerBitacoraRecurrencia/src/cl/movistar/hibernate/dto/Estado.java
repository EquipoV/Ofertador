package cl.movistar.hibernate.dto;
// Generated 13-05-2014 07:57:07 PM by Hibernate Tools 3.6.0



/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;

    public Estado() {
    }

    public Estado(int id, String nombre, String descripcion) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
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




}


