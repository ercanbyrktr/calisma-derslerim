package day33_timeForMatter_varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" + tarihSaat);
        // 2023-01-05T18:25:34.699036700

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");

        System.out.println(dtf1.format(tarihSaat)); // 05/1/23 06:30

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");

        System.out.println(dtf2.format(tarihSaat)); // 5/Oca/2023 18:32
    }
}
