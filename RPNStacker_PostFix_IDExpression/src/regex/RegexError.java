package regex;

public class RegexError extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public RegexError(String msg) {
        super(msg);
    }
}