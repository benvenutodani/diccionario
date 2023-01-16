package src;

//import src.dominio.Contacto;
//import src.dominio.Customer;
import src.dominio.Libro;
import src.dominio.Palabra;
import src.service.Biblioteca;
import src.service.Diccionario;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;

public class App {
    public static void main(String[] args){
      /*  Diccionario diccionarioespaniol = new Diccionario( "Español");
        diccionarioespaniol.registrarPalabra(new Palabra("programacion", "accion de Programar","Español"));
        diccionarioespaniol.registrarPalabra(new Palabra("Saludar", "accion de saludar", "Español"));
        diccionarioespaniol.registrarPalabra(new Palabra("Saludar", "accion de saludar", "Español"));
        diccionarioespaniol.registrarPalabra(new Palabra("Abeja", "animal volador", "Español"));

        diccionarioespaniol.buscarPalabra("programacion");
        diccionarioespaniol.imprimirPalabra();
        diccionarioespaniol.imprimirPalabra();*/

        //Biblioteca:




        Biblioteca biblioteca = new Biblioteca();

        biblioteca.registrarLibro(new Libro("Rayuela", "Juio Cortazar",1963));
        biblioteca.registrarLibro(new Libro("Los árboles mueren de pie", "Alejandro Cazona", 1903));
        biblioteca.registrarLibro(new Libro("Ceremonia secreta", "Marco Denevi", 1960));
        biblioteca.registrarLibro(new Libro("Matemáticas...¿Estás ahí?", "Adrian Paenza", 2006));
        biblioteca.registrarLibro(new Libro("Los árboles mueren de pie", "Alejandro Cazona", 1903));
        biblioteca.registrarLibro(new Libro("Ceremonia secreta", "Marco Denevi", 1960));
        biblioteca.registrarLibro(new Libro("Los árboles mueren de pie", "Alejandro Cazona", 1903));

        biblioteca.imprimirLibros();

        System.out.println("El nuevo Listado del Libro: "+ biblioteca.buscarLibro("Ceremonia secreta"));

        biblioteca.etiquetarLibro();

        biblioteca.imprimirLibros();


        Diccionario diccionario = new Diccionario("Español");
        diccionario.buscarPalabra("Excepcion");

       /* Map<Customer, String> customers = new HashMap<>();
        Customer maria= new Customer("123a4", "La casa de Luis", "Asuncion 1234");
        Customer rupert= new Customer("123a4","Poleman","Beazlet 1234");
        Customer harry= new Customer("123a4","Filardi", "Lope de Vega 2345");
        Customer leonides= new Customer("123a4","Barcelona", "Beiró 4534");
        Customer maga= new Customer("123a4","Barcelona", "Beiró 4534");
*/
       /* Contacto maria = new Contacto("Maria" , "Ara" );
        Contacto luis = new Contacto("Luis" , "Miguel" );
        Contacto diego = new Contacto("Diego" , "Torres" );
        Contacto anne = new Contacto("Anne" , "Tejas" );
        Contacto daniela = new Contacto("Daniela" , "Belén" );
*/

    }
}
