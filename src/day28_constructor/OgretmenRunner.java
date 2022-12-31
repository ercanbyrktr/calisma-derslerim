package day28_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1" + ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Ercan", "BAYRAKTAR", "1/1/2022", "Matematik", "Fizik");
        System.out.println("Ogretmen 2" + ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Inci", "BAYRAKTAR", "6/6/2016");
        System.out.println("Ogretmen 3" + ogretmen3);
    }
}
