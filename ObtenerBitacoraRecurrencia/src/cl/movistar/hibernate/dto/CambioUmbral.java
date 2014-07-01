package cl.movistar.hibernate.dto;
// Generated 13-05-2014 07:57:07 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * CambioUmbral generated by hbm2java
 */
public class CambioUmbral  implements java.io.Serializable {


     private Integer id;
     private String idBolsa;
     private String nombre;
     private int unidadAntigua;
     private int unidadNueva;
     private Date fechaModificacion;
     private String descripcion;
     private String tipoProducto;
     private int idTracking;

    public CambioUmbral() {
    }

	
    public CambioUmbral(String idBolsa, String nombre, int unidadAntigua, int unidadNueva, String descripcion, String tipoProducto, int idTracking) {
        this.idBolsa = idBolsa;
        this.nombre = nombre;
        this.unidadAntigua = unidadAntigua;
        this.unidadNueva = unidadNueva;
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
        this.idTracking = idTracking;
    }
    public CambioUmbral(String idBolsa, String nombre, int unidadAntigua, int unidadNueva, Date fechaModificacion, String descripcion, String tipoProducto, int idTracking) {
       this.idBolsa = idBolsa;
       this.nombre = nombre;
       this.unidadAntigua = unidadAntigua;
       this.unidadNueva = unidadNueva;
       this.fechaModificacion = fechaModificacion;
       this.descripcion = descripcion;
       this.tipoProducto = tipoProducto;
       this.idTracking = idTracking;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIdBolsa() {
        return this.idBolsa;
    }
    
    public void setIdBolsa(String idBolsa) {
        this.idBolsa = idBolsa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getUnidadAntigua() {
        return this.unidadAntigua;
    }
    
    public void setUnidadAntigua(int unidadAntigua) {
        this.unidadAntigua = unidadAntigua;
    }
    public int getUnidadNueva() {
        return this.unidadNueva;
    }
    
    public void setUnidadNueva(int unidadNueva) {
        this.unidadNueva = unidadNueva;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipoProducto() {
        return this.tipoProducto;
    }
    
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public int getIdTracking() {
        return this.idTracking;
    }
    
    public void setIdTracking(int idTracking) {
        this.idTracking = idTracking;
    }




}


