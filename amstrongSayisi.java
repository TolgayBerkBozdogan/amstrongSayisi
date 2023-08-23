import java.util.Scanner;

public class amstrongSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int number = input.nextInt();
        int counter = 0, basValue, tempNumber = number, basPow, result = 0;


        //Basamak Sauısı counter'a eşit:
        while (tempNumber != 0) {
            basValue = tempNumber /= 10;
            counter++;
        }
        System.out.println("Basamak Sayısı:" + counter);

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= counter; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " Sayısı bir Amstrong sayıdır.");
        }else {
            System.out.println(number + " Sayısı bir Amstrong sayısı değildir.");
        }




    }
}
