package fr.alexisvachard.my.personnal.web.site.exception;

public class HomePageException extends ApplicationException {

    public HomePageException() {
        super();
    }

    public HomePageException(String message) {
        super(message);
    }

    public HomePageException(String message, Throwable cause) {
        super(message, cause);
    }

    public HomePageException(Throwable cause) {
        super(cause);
    }
}
