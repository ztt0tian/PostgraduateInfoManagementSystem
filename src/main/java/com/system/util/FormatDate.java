package com.system.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static Date DateToString(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(sdf.format(date));
    }

    public static Date StringToDate(String date_string) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(date_string);
    }
    public static void main(String[] args) throws ParseException {
        System.out.println(StringToDate("2018-12-18"));
    }
}
