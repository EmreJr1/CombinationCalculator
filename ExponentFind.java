import java.util.Scanner;

public class ExponentFind {


       //4 ve 5 in kuvvetlerini bulan program

        public static void main(String[] args) {
            int userInput ;


            //kullanıcı veri girişi
            Scanner inp = new Scanner(System.in);
            System.out.print("Sayı giriniz =");
            userInput=inp.nextInt();


            //4 ün katlarını bulma
            for (var i=1; i<=userInput;i*=4){
                System.out.println(i);
            }
            System.out.println("*************************");

            //5 in katlarını bulma
            for (var i=1; i<=userInput;i*=5) {
                System.out.println(i);
            }
        }
    }



