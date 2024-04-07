package studentassignment.exceptions;

public class DataNotPresentException extends RuntimeException{
	
	public DataNotPresentException(String message) {
		 super(message);
	}
	
	 public DataNotPresentException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
super(message, cause, enableSuppression, writableStackTrace);
}

}
