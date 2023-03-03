
package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double kdv=0.18,kdv2=0.08,fiyat;
        System.out.println("kdvsi hesaplanacak fiyatı giriniz: ");
        fiyat=input.nextDouble();
        
        double deger=fiyat>=1000? fiyat*kdv2:fiyat*kdv;
        
        System.out.println("kdv orani1 "+deger+" olarak hesaplanmistir.");
        
    }
    
}
