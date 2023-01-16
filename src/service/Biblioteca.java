package src.service;

import src.dominio.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List<Libro> libros; //listado de libros de la clase Libro
   private int consecutivo; //nro consecutivo para crear el etiquetado


   //constructor para que solo se pueda instancias desde Biblioteca
   public Biblioteca() {
      this.libros = new ArrayList();
   }


   // Para registrar un nuevo Libro, sin etiquetado
   public void registrarLibro(Libro libro) {
      libros.add(libro);
   }


   //Para crear el etiquetado
   public void etiquetarLibro() {

      for (int i = 0; i < libros.size(); i++) {
         if (libros.get(i).getCodigo() == null) {

            libros.get(i).setCodigo(libros.get(i).getTitulo() + "/" + libros.get(i).getAnioPublicacion() + "/" + consecutivo);
            consecutivo++;

         }
      }
   }


   //generar un listado de libros con el mismo titulo
   public List<Libro> buscarLibro(String libroBuscar) {

      List<Libro> librosMismaPalabra = new ArrayList<>();

      for (int i = 0; i < libros.size(); i++) {

         if (libros.get(i).getTitulo().equals(libroBuscar)) {

            librosMismaPalabra.add(libros.get(i));

         }
      }
      return librosMismaPalabra;
   }

   //imprimir Biblioteca
   public void imprimirLibros() {

      System.out.println(libros);
   }
}
