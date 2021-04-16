
package hadiahsuhu;
import java.util.Scanner;

public class HadiahSuhu {

    public static void main(String[] args) {
        System.out.println("\t\t\tKonvrensi Suhu Celcius");
        
        Scanner input = new Scanner(System.in);
        int celcius,kelvin, fahrenheit, reamur, pilihan;
        
        System.out.print("Masukkan suhu dalam celcius       : ");
        celcius = input.nextInt();
        
        System.out.println("Pilih Konvrensi Suhu ");
        System.out.println("1. Kelvin 2. Farenheit 3.Reamur");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Dalam kelvin" +(celcius+ 273));
                break;
            case 2:
                System.out.println("Dalam Farenheit" +(celcius * 9/5 + 100) +"°");
                break;
            case 3:
                System.out.println("Dalam Reamur"+ (0.8 * celcius + 100)+"°");
                break;
            default:
                System.out.println("Pilih dengan angka 1,2 atau 3");
                break;
        }
        
    }
    
}
