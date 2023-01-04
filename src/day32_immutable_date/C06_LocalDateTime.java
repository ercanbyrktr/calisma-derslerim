package day32_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-01-04T22:14:05.021296300

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2023-04-09T02:17:22.103274800

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-10-01T02:18:25.066197300

        System.out.println(tarihSaat.toLocalDate()); // 2023-01-04
    }
}
