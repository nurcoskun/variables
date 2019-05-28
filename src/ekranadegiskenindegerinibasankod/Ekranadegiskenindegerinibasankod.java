
package ekranadegiskenindegerinibasankod;
import java.util.Scanner;
public class Ekranadegiskenindegerinibasankod {


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int snc = 0;
        
         System.out.println("Mantıksal İşleminizi Seçiniz:\n"
                 + "1-)İlk Girilen Sayı 2. Sayı ve 3. Sayı değerinin arasında mı?\n2-)"
                 + "İlk Girilen Sayı 2. Sayı ile eşit ve 3. Sayıdan Küçük mü?\n3-)"
                 + "İlk Girilen Sayı 2. Sayı veya 3. Sayıdan Büyük mü?\n4-)"
                 + "Girilen Sayılar Birbirlerine Eşit mi?");
       
            System.out.print("İşlem Numarasını Giriniz:");
        snc = scan.nextInt();
 
 
         System.out.println("Birinci Sayi:");
       a=scan.nextInt();
      
       System.out.println("İkinci Sayi:");
       b=scan.nextInt();
       
       System.out.println("Üçüncü Sayi:");
       c=scan.nextInt();
       
       
    
    }
    
}
