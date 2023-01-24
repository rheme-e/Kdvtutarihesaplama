package Giris;
import java.text.DecimalFormat;
import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        double urun;
        Scanner inp=new Scanner(System.in);
        System.out.println("Ürünün değeri");
        urun=inp.nextDouble();
        double kdvli=(urun+urun*0.18);
        double kdvtutari=(urun*0.18);
        System.out.println("Ürünün KDV'li değeri:" + new DecimalFormat("##.##" ).format(kdvli));
        System.out.println("KDV tutarı:" + new DecimalFormat("##.##" ).format(kdvtutari));
    }
}