package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public final class ExceptionConstants {
    private static Map<Class<? extends Throwable>, String> exceptionCodes = new HashMap<>();

    static {
        exceptionCodes.put(KianCreditBusinessException.class, "invalid data");
    }

    public static String getExceptionMessage(Class<? extends Throwable> exceptionClass) {
        return exceptionCodes.get(exceptionClass);
    }

}