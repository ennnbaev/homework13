package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        LocalDateTime TuesdayLesson=LocalDateTime.of(2021,8,31,20,0);
        LocalDateTime SaturdayLesson=LocalDateTime.of(2021,9,4,18,0);
        Duration duration1=Duration.between(TuesdayLesson,SaturdayLesson);
        System.out.println("Задания 1");
        System.out.println("Промежуток между лекций в секундах "+duration1.toSeconds());
        System.out.println("Промежуток между лекций в минутах "+duration1.toMinutes());
        System.out.println("Промежуток между лекциях в час "+duration1.toHours());
        System.out.println("Промежуток между лекциях в днях "+duration1.toDays());

        System.out.println("Задания 2");
        LocalDateTime beginLesson=LocalDateTime.of(2021,9,4,16,0);
        LocalDateTime endLesson=LocalDateTime.of(2021,9,4,18,0);
        Duration duration=Duration.between(beginLesson,endLesson);
        System.out.println("Количество минут в лекции "+duration.toMinutes());
        System.out.println("Количество секунд в лекции "+duration.toSeconds());

        System.out.println("Задания 3");
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy/MMM/dd/ h:mm:ss a", Locale.ENGLISH);
        LocalDateTime localDateTime=LocalDateTime.parse("1999/Jun/18/ 11:34:56 PM",dateTimeFormatter);
        System.out.println(localDateTime);
        System.out.println("Задания 3.2");

        LocalDateTime dateTime = LocalDateTime.of(1999,1,18 ,16,34,56);
        //стандартный формат даты
        System.out.println("стандартный формат даты LocalDateTime : " + dateTime);
        //приименяем свой формат даты

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy/MMM/dd/ h:mm:ss a")));





        System.out.println("Задания 4");
        LocalDateTime localDateTime2=LocalDateTime.of(2021,9,4,18,0);
        System.out.println(localDateTime2);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd");
        String result=localDateTime2.format(formatter);
        System.out.println(result);

    }
}