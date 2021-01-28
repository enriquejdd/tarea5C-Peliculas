/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tareaclase5c.enriquediaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Enrique
 */
public class ListaPeliculas {
    private ArrayList <Peliculas> pelis;

    public ListaPeliculas() {
        pelis = new ArrayList<>();
    }
    
    public int numPelicula(){
        return pelis.size();
    }
    
    public boolean vacia() {
        return pelis.isEmpty();
    }
    
    public void eliminarPelicula(int numBorrar) {
        // Mirar que la posicion este correcta
        if (numBorrar >= 0 && numBorrar < pelis.size()) {
            pelis.remove(numBorrar);
        }
    }

    public void imprimirLista() {
        pelis.forEach(System.out::println);
    }
    
    public void cambiarPelicula(int num, Peliculas p) {
        // Mirar que la posicion este correcta
        if (num >= 0 && num < pelis.size()) {
            pelis.set(num, p);
        }
    }
    
    public int buscarPeliculas(Peliculas p) {
        return pelis.indexOf(p);
    }
    
    public void ordenarNombre() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        Collections.sort(pelis, criterio);
    }
    
    public void ordenarDuracion() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getDuracion().compareTo(p2.getDuracion());
        Collections.sort(pelis, criterio);
    }
    
    public void ordenarNota() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getNota().compareTo(p2.getNota());
        Collections.sort(pelis, criterio);
    }
    
    public void ordenarAutor() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getAutor().compareTo(p2.getAutor());
        Collections.sort(pelis, criterio);
    }
    
    public void ordenarDirector() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getDirector().compareTo(p2.getDirector());
        Collections.sort(pelis, criterio);
    }
    
    public void ordenarPrecio() {
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getPrecioAlquiler().compareTo(p2.getPrecioAlquiler());
        Collections.sort(pelis, criterio);
    }
    
    public int buscarPorNombre(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public int buscarPorDuracion(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getDuracion().compareTo(p2.getDuracion());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public int buscarPorNota(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getNota().compareTo(p2.getNota());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public int buscarPorAutor(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getAutor().compareTo(p2.getAutor());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public int buscarPorDirector(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getDirector().compareTo(p2.getDirector());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public int buscarPorPrecio(Peliculas p){
        Comparator<Peliculas> criterio = (p1, p2) -> p1.getPrecioAlquiler().compareTo(p2.getPrecioAlquiler());
        
        int posicion = Collections.binarySearch(pelis, p, criterio);
        
        return posicion;
    }
    
    public void añadirPelicula(Peliculas p){
        pelis.add(p);
    }
    
    
}


