package src.dominio;

import java.util.Objects;

public class Palabra implements Comparable <Palabra>{
    private String palabra;
    private String significado;
    private String idioma;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public Palabra(String palabra, String significado, String idioma) {
        this.palabra = palabra;
        this.significado = significado;
        this.idioma= idioma;
    }
    public String getPalabra() {
        return palabra;
    }
    public String getIdioma(){
        return idioma;
    }
    public String getSignificado() {
        return significado;
    }
    public void setSignificado(String significado) {
        this.significado = significado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palabra)) return false;
        Palabra palabra1 = (Palabra) o;
        return palabra.equals(palabra1.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    @Override
    public String toString() {
        return palabra + ": " + significado;
    }


    @Override
    public int compareTo(Palabra o) {
        return this.palabra.compareTo(o.getPalabra());
    }
}
