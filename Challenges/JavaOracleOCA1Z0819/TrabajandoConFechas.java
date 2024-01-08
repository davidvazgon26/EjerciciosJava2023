package Challenges.JavaOracleOCA1Z0819;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TrabajandoConFechas {
    public static void main(String[] args) {
        // Antes de java 8
        Calendar c = Calendar.getInstance();
        Date d2 = new Date();

        System.out.println("instancia de Calendar: " + c);
        System.out.println("Instancia de Date: " + d2);

        // Despues de java 8
        LocalDate d = LocalDate.now();
        LocalDateTime dt = LocalDateTime.now();
        LocalTime t = LocalTime.now();

        System.out.println(d);
        System.out.println(dt);
        System.out.println(t);

        LocalDate date = LocalDate.of(1980, Month.SEPTEMBER, 8);
        LocalTime time = LocalTime.of(8, 1, 12);
        System.out.println(date + " and " + time);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date2 = LocalDate.parse("03 07 1978", format);
        System.out.println(date2);
        LocalDate date3 = date2.plusDays(3); // Se asigna a otra variable porque es inmutable.
        System.out.println(date3);
        System.out.println(date3.isAfter(date2));
    }
}
