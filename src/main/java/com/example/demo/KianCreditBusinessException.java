package com.example.demo;

public class KianCreditBusinessException extends RuntimeException {
    public KianCreditBusinessException() {
    }

    public KianCreditBusinessException(String message) {
        super(message);
    }

    public KianCreditBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public KianCreditBusinessException(Throwable cause) {
        super(cause);
    }

    public KianCreditBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
