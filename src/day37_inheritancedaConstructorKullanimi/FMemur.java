package day37_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Extends keyword kullanilan classlarda
    ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim
    Java constructor'in ilk satirina
    super(); constructor call yazar

    super(); constructor call, default constructor'a benzer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir constructor call yazarsak
    Java super(); 'i siler.

    Eger biz müdahale edip kendi constructor call'umuzu olusturmazsak
    Java'nin default olarak olusturdugu constructor call
    her zaman parametresizdir
    super();


     */

    FMemur(){

        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim){


        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {

       FMemur mm1=new FMemur();new FMemur("ali");


    }
}
