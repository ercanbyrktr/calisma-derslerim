package day28_constructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public String yil;
    public int fiyat;

    public Araba(String markaR, String modelR, String yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil= yilR;
        fiyat=fiyatR;

    }
    public Araba(String opel, String astra, String yilR, String s){

    }
    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olıusturmaliyiz
     */

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }

}
