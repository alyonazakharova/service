package com.bercut.service.utils;

public class Helper {
    public static boolean optionalParameterCheck(Boolean param) {
        //param is true by default
        return param == null || param;
    }
}
