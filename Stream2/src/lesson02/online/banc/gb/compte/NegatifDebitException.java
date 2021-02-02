package banc.gb.compte;

public class NegatifDebitException extends Exception{

    public NegatifDebitException(String message) {
        super(message);
    }
}
