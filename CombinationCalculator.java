import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        //Değişken tanımlama
        int number1 ,number2;
        int total1=1 ;
        int total2 =1;
        int total3 =1;

        //Kullanıcı girdisi
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number =");
        number1=input.nextInt();
        System.out.print("Enter second number =");
        number2=input.nextInt();

        //Kombinasyon işlemleri
        for (int i=1; i<=number1; i++){
            total1*=i;
        }
        for (int i=1; i<=number2; i++){
            total2*=i;
        }
        for (int i=1; i<=number1-number2; i++){
            total3*=i;
        }

        //Çıktıyı kullanıcıya gösterme
        System.out.println("C(n,r)=n! / (r! * (n-r)!)");
        System.out.println("Combinatiyon = "+total1/(total2*total3));

    }
}
