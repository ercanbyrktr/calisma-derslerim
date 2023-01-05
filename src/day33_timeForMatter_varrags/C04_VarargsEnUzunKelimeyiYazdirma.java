package day33_timeForMatter_varrags;

public class C04_VarargsEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet");
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each : kelime
        ) {
       if (each.length()>enUzunKelime.length()){
           enUzunKelime=each;
       }
        }
        System.out.println("Girilen kelimelerden en uzunu :" + enUzunKelime);
    }
}
