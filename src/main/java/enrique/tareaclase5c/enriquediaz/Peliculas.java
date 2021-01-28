/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tareaclase5c.enriquediaz;

import java.util.Objects;

/**
 *
 * @author Enrique
 */
public class Peliculas {
    private String nombre;
    private Integer duracion;
    private Double nota;
    private String autor;
    private String director;
    private Double precioAlquiler;

    public Peliculas() {
    }

    public Peliculas(String nombre, Integer duracion, Double nota, String autor, String director, Double precioAlquiler) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nota = nota;
        this.autor = autor;
        this.director = director;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", duracion=" + duracion + ", nota=" + nota + ", autor=" + autor + ", director=" + director + ", precioAlquiler=" + precioAlquiler + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.duracion);
        hash = 31 * hash + Objects.hashCode(this.nota);
        hash = 31 * hash + Objects.hashCode(this.autor);
        hash = 31 * hash + Objects.hashCode(this.director);
        hash = 31 * hash + Objects.hashCode(this.precioAlquiler);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.duracion, other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.nota, other.nota)) {
            return false;
        }
        if (!Objects.equals(this.precioAlquiler, other.precioAlquiler)) {
            return false;
        }
        return true;
    }

    
}
