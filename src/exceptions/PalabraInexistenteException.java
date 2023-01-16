package src.exceptions;

public class PalabraInexistenteException extends RuntimeException {
    private String description;

    public PalabraInexistenteException(String description){
        super(description);
    }
}
