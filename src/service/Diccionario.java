package src.service;
import src.dominio.Palabra;
import java.util.HashSet;
import java.util.Set;

public class Diccionario {

    private Set<Palabra> palabras;
    private String idioma;

    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras = new HashSet<>();
    }



    public String getIdioma() {
        return idioma;
    }


    public void registrarPalabra(Palabra palabra){
        palabras.add(palabra);
    }
    public void buscarPalabra(String palabra){
        Palabra palabraABuscar = new Palabra(palabra);
        boolean seEncontro= false;
            for (Palabra palabraEnDiccionario: palabras) {
                if (palabraEnDiccionario.getPalabra().equals(palabra)){
                    System.out.println(palabraEnDiccionario);
                    seEncontro= true;
                    break;
                }
            }
            if(!seEncontro){
                throw new RuntimeException("La palabra "+ palabraABuscar+ " no existe");
            }
        
    }

    public void removerPalabra(String palabra) {
        Palabra palabraABuscar = new Palabra(palabra);
        boolean seEncontro= false;
        for (Palabra palabraEnDiccionario: palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabra)){
                System.out.println(palabraEnDiccionario);
                seEncontro= true;
                break;
            }
        }
        if(!seEncontro){
            System.out.println("La palabra" + palabra+ " no se encuentra en el diccionario" );
        }

    }
 /*   public void imprimirPalabra(){

        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabras)) {
                System.out.println(palabra.palabras);
            }
        }
    }


*/
}
