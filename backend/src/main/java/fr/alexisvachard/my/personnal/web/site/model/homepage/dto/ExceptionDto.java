package fr.alexisvachard.my.personnal.web.site.model.homepage.dto;

public class ExceptionDto {

    private String error;

    private String stackTrace;

    public ExceptionDto() {
    }

    public ExceptionDto(String error, String stackTrace) {
        this.error = error;
        this.stackTrace = stackTrace;
    }

    public ExceptionDto(String error, String stackTrace, String errorCode) {
        this.error = error;
        this.stackTrace = stackTrace;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
