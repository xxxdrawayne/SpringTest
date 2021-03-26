package com.ywt.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/18 15:44
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateStr) {
        //将日期的字符串转换成日期对象，返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
