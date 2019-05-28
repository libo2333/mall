package com.springboot.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String dateOfNow(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }
}
