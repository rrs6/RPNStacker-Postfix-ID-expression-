package token;

public class Token {
    public static final String TOKENIZER_DELIMITER = "\t\n\r\f";
    public final TokenType type; // token type
    public final String lexeme; // token value

    public Token (TokenType type, String value) {
        this.type = type;
        this.lexeme = value;
    }

    @Override
    public String toString() {
        return "Token [type=" + this.type + ", lexeme=" + this.lexeme + "]";
    }
}