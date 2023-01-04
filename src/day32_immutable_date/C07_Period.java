package day32_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1987,4,11);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(bugun,tarih1);

        System.out.println(period); // P-35Y-8M-23D

    }
}
