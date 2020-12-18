/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author EntornoVM
 */
public class Encuesta extends Cliente {
    
    private Integer nivelAtencion;
    private Integer nivelResolucion;
    private Integer nivelRecomendacion;
    private Integer promedioEncuesta;

    public Integer getPromedioEncuesta() {
        return promedioEncuesta;
    }

    public void setPromedioEncuesta(Integer promedioEncuesta) {
        this.promedioEncuesta = promedioEncuesta;
    }

    public Encuesta(Integer nivelAtencion, Integer nivelResolucion, Integer nivelRecomendacion, String nombre, String apellido, Integer numeroCliente) {
        super(nombre, apellido, numeroCliente);
        this.nivelAtencion = nivelAtencion;
        this.nivelResolucion = nivelResolucion;
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public Integer getNivelAtencion() {
        return nivelAtencion;
    }

    public void setNivelAtencion(Integer nivelAtencion) {
        this.nivelAtencion = nivelAtencion;
    }

    public Integer getNivelResolucion() {
        return nivelResolucion;
    }

    public void setNivelResolucion(Integer nivelResolucion) {
        this.nivelResolucion = nivelResolucion;
    }

    public Integer getNivelRecomendacion() {
        return nivelRecomendacion;
    }

    public void setNivelRecomendacion(Integer nivelRecomendacion) {
        this.nivelRecomendacion = nivelRecomendacion;
    }
    
    public Integer promedioEncuesta(Integer nAtencion,Integer nRecomendacion,Integer nResolucion){
        
        Integer promedio;
        promedio = (Integer) (nAtencion + nRecomendacion + nResolucion)/3;
        return promedio;
        
    }
}
