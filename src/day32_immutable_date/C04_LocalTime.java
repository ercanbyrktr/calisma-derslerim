package day32_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 21:40:26.610303400
        /*
        bizim olusturdugumuz date ve time
        canli saat ve tarih degildir
        LocalTime.now(); kullandigimiz satirda
        o anki tarih  veya saati alip
        bizim variable'imiza store eder
        time1 variable'inin degeri sabittir
         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1); //

        System.out.println(time1.getSecond()); // 11

        System.out.println(time1.plusSeconds(10000)); // 00:51:51.002996700

        System.out.println(time1.minusMinutes(200)); // 18:47:24.805752700

    }
}
