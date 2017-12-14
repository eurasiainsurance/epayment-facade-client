package tech.lapsa.epayment.facade;

public class InvoiceNotFound extends Exception {

    private static final long serialVersionUID = 1L;

    public InvoiceNotFound() {
	super();
    }

    public InvoiceNotFound(String message, Throwable cause) {
	super(message, cause);
    }

    public InvoiceNotFound(String s) {
	super(s);
    }

    public InvoiceNotFound(Throwable cause) {
	super(cause);
    }

}
