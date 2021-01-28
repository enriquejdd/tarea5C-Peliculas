/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tareaclase5c.enriquediaz;

/**
 *
 * @author Enrique
 */
public class PeliculasPrueba {
    public static void main(String[] args) {
        ListaPeliculas repertorio = new ListaPeliculas();
        int lugar = 0;
        
        Peliculas p1 = new Peliculas("Avatar", 162, 7.2, "James Cameron", "James Cameron", 2.95);
        Peliculas p2 = new Peliculas("Big Hero 6", 102, 7.0, "Daniel Gerson, Jordan Roberts, Robert L. Baird", "Don Hall, Chris Williams", 2.85);
        Peliculas p3 = new Peliculas("Como entrenar a tu dragón", 98, 7.3, "Dean DeBlois, Chris Sanders, Will Davies", "Chris Sanders, Dean DeBlois", 3.0);
        
        repertorio.añadirPelicula(p1);
        repertorio.añadirPelicula(p2);
        repertorio.añadirPelicula(p3);
        repertorio.añadirPelicula(new Peliculas("Spider-man. Un nuevo universo", 120, 7.6, "Phil Lord, Rodney Rothman", "Peter Ramsey, Rodney Rothman, Bob Persichetti", 3.30));
        repertorio.añadirPelicula(new Peliculas("Los juegos del hambre", 142, 6.2, "Gary Ross, Billy Ray, Suzanne Collins", "Gary Ross", 1.85));
        
        System.out.println("Las películas de las que disponemos son:");
        repertorio.imprimirLista();
        
        System.out.println("");
        System.out.println("Si las ordenamos por duración: ");
        repertorio.ordenarDuracion();
        repertorio.imprimirLista();
        
        System.out.println("");
        System.out.println("Eliminamos la 3º película.");
        repertorio.eliminarPelicula(3);
        repertorio.imprimirLista();
        
        
        
        System.out.println("");
        System.out.println("Y añadimos 300 al catálogo");
        Peliculas p4 = new Peliculas("300", 117, 7.2, "Oscar Luna Barrera, Kurt Johnstad, Michael Gordon,Zack Snyder", "Zack Snyder", 2.85);
        repertorio.añadirPelicula(p4);
        repertorio.imprimirLista();
        
        System.out.println("");
        System.out.println("Cambiamos el orden a nota puesta");
        repertorio.ordenarNota();
        repertorio.imprimirLista();
        
        System.out.println("");
        System.out.println("Buscamos la película de 300");
        lugar = repertorio.buscarPorNota(p4);
        System.out.println("Su posición es: " + lugar);
        
    }
}
