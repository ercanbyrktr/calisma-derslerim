package day35_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    // getter method'u da tek bir satirlik islem yapiyor
    // baska class'larin private oldugu icin erisemedigi
    // tasitTuru bilgisini, class icinden alip
    // istenen farkli class'lar return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // return olmadigi icin bu methodun cagrildigi tasitrunner class'inda yazdırılamaz
        // burada bir satirlik islem yapiyor o bir satirlik islem var, gönderdigimiz argument'i instance'a atama
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variablelar icin olusturulan getter methodlarin ismi
    // isVariableIsmi seklinde olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
