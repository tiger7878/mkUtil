package com.monkey.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * 日期处理工具类
 * @author: monkey
 * @date: 2018/1/13 18:22
 */
public class DateTimeUtil {

    //标准格式化
    public static final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";

    /**
     * 把字符串转换为日期
     * @param dateTimeStr 字符串
     * @return 日期
     */
    public static Date strToDate(String dateTimeStr){
        return strToDate(dateTimeStr,STANDARD_FORMAT);
    }

    /**
     * 把字符串转换为日期
     * @param dateTimeStr 字符串
     * @param formatStr 格式化
     * @return 日期
     */
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(formatStr);
        DateTime dateTime=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    /**
     * 把日期转换为字符串
     * @param date 日期
     * @return 字符串
     */
    public static String dateToStr(Date date){
        return dateToStr(date,STANDARD_FORMAT);
    }

    /**
     * 把日期转换为字符串
     * @param date 日期
     * @param formatStr 字符串
     * @return 字符串
     */
    public static String dateToStr(Date date,String formatStr){
        if (date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(formatStr);
    }
}
