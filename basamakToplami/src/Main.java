import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, basamakSayisi, numMod, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        int tempNumber = number;

        while(tempNumber != 0){
            numMod = tempNumber%10;
            tempNumber /= 10;
            total += numMod;
            // System.out.println("Basamak değeri : " + numMod); kontrol için yazıldı
        }
        System.out.println("Girilen sayının basamak değerleri toplamı : " + total);
    }
}