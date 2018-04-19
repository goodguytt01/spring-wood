package com.shawn.util;



public class PageUtil {


    public static int calculateOffset(int page, int perPage) {
        return calculateOffset(page, perPage, 0);
    }


    public static int calculateOffset(int page, int perPage, int defaultValue) {
        return page < 1 ? defaultValue : (page - 1) * perPage;
    }

    public static int calculateTotalPage(int rowCount, int perPage) {
        return (rowCount % perPage == 0) ? (rowCount / perPage) : (rowCount / perPage + 1);
    }


    public static int parsePage(String pageString, int defaultValue) {
        return parseParameter(pageString, defaultValue);
    }

    public static int parsePerPage(String perPageString, int defaultValue) {
        return parsePage(perPageString, defaultValue);
    }

    private static int parseParameter(String parameterString, int defaultValue) {
        if (parameterString == null) {
            return defaultValue;
        }

        int parameter = 0;
        try {
            parameter = Integer.parseInt(parameterString);
        } catch (Exception e) {
        }
        return parameter;
    }

}
