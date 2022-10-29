// Klavyeden girilen pozitif tam sayıyı tersten yazdıran program.
package tersten_yazdıran;
import java.util.Scanner;

/*
Adım 1: Başla
Adım 2: Kullanıcıdan n değeri al
Adım 3: s değişkeni tanımla
Adım 4: for döngüsü ile girilen sayı >0 dan büyük olana kadar döndür
Adım 5: s= girilen%10; yap ve s yi ekrana yazdır 
Adım 6: yeni girilen sayıyı oluştur girilen /10;
Adım 7: Bitir.
*/

public class Tersten_yazdıran {


    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir Sayı Giriniz :");
        int girilen = input.nextInt();
        
        int s;
        
        for (; girilen>0;)
        {
            s = girilen%10;
            System.out.print(s+" ");
            girilen /=10;
        }    
    }
}
