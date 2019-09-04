
package org.skynet.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="estudiantes")
public class Estudiante implements Serializable {

    @Id
    @Column (name="codigoEstudiante")
    private int codigoEstudiante;   
    @Column
    private int carnet;
    @Column         
    private String nombres;
     @Column         
    private String apellidos;
     @Column
    private String grado;
     @Column
     private String seccion;

    public Estudiante() {
    }

    public Estudiante(int codigoEstudiante, int carnet, String nombres, String apellidos, String grado, String seccion) {
        this.codigoEstudiante = codigoEstudiante;
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.seccion = seccion;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
     
     
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoEstudiante;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if (this.codigoEstudiante != other.codigoEstudiante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigoEstudiante=" + codigoEstudiante + ", carnet=" + carnet + ", nombres=" + nombres + ", apellidos=" + apellidos + ", grado=" + grado + ", seccion=" + seccion + '}';
    }

    
    
}
