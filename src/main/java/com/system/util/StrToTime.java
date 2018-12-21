package com.system.util;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrToTime {
    public static Time ConvertStrToTime(String string) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date d = format.parse(string);
        return new Time(d.getTime());
    }
}
