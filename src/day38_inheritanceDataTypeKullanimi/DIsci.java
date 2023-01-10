package day38_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isci : " + (30*saatUcreti*gunlukMesai) + "maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isci %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
       /*
       Bir obje olusturulurken
       Data turu ve constructor ayni class'dan ise
       direk o class'a gidiyorduk

       Eger data turu ve cons. farkli ise
       Obje constructor'in oldugu class'in objesidir
       ancak, bizden istenen
       Isci class'indaki spesifik ozellikler degil
       Bir iscinin muhasebe class'indaki
       tum calisanlarla beraber sahip oldugu
       genel ozellikleri yazdirir

        */
        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas();// M Personel minumum :2400maas alir
        isc1.ozelSigorta();// M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim);// P
        System.out.println(isc1.departmant);// P


        APersonel isc2=new DIsci();

        //System.out.println(isc2.gunlukMesai); // M 8
        //System.out.println(isc2.saatUcreti); // M 10
        isc2.maas();// M Personel minumum :2400maas alir
        //isc2.ozelSigorta();// M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim);// P
        System.out.println(isc2.departmant);// P
        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

    }
}
