package cn.itcast.dateConverters;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//自定义类实现converter接口，实现类型转换
public class DateConverter implements Converter<String,Date> {


    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat();
            Date date = null;
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
