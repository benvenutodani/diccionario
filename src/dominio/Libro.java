package src.dominio;

import java.util.Objects;

public class Libro {
    private String titulo; //título del libro
    private String autor; //autor del libro
    private int anioPublicacion; //año de publicacion
    private String codigo; // etiquetado se generará mediante un método en la clase libreria


    //constructores
// primer cosntructor para instanciar los libros
    public Libro(String titulo, String autor, int anioPublicaion) {
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicaion;
    }

    //segundo constructor para intanciar nombre de libro para los métodos de busqueda
    public Libro(String titulo) {
        this.titulo = titulo;
    }


    // get para instanciar
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }


    //set para crear la etiqueta
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return titulo == libro.titulo;
    }


    //para usar en el método de imprimir
    @Override
    public String toString() {
        return titulo + "/" + autor + "/" +
                anioPublicacion + "/" + codigo;
    }
}
