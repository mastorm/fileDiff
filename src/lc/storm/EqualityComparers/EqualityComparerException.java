package lc.storm.EqualityComparers;

public class EqualityComparerException extends Exception{
    public EqualityComparerException() {
    }

    public EqualityComparerException(String message) {
        super(message);
    }

    public EqualityComparerException(String message, Throwable cause) {
        super(message, cause);
    }

    public EqualityComparerException(Throwable cause) {
        super(cause);
    }

    public EqualityComparerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
