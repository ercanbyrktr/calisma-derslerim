package day23_Arrays;

public class C02_EnUzunVeKısaKelime {
    public static void main(String[] args) {
        // soru 2- Verilen String bir array'de
        // en uzun ve en kısa String'leri yazdiran bir method olusturun

        String[] isimler= {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        enUzunVeKisayiYazdir(isimler);
    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime= isimler[0];
        String enKisaKelime= isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }

            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }

        }
        System.out.println("Arraydeki en uzun kelime:" +enUzunKelime);
        System.out.println("Arraydaki en kisa kelime:" +enKisaKelime);
    }
}
