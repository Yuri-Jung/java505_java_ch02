import java.util.Scanner;
public class P88_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요. : ");
        int money = scanner.nextInt();
        int money1 = money / 50000;
        int money2 = money / 10000;
        int money3 = money / 1000;
        int money4 = money / 500;
        int money5 = money / 100;
        int money6 = money / 10;
        int money7 = money / 1;

        if (money > 50000) {
            System.out.println("5만원권 " + money1 + "개");
            if ((money - money1) > money1) {
                System.out.print("1만원권 " + money2 + "개");
            }
            if ((money - money2) > money2) {
                System.out.print("천원권 " + money3 + "개");
            }
            if ((money - money3) > money3) {
                System.out.print("1만원권 " + money4 + "개");
            }
            if ((money - money4) > money4) {
                System.out.print("100원 " + money5 + "개");
            }
            if ((money - money5) > money5) {
                System.out.print("10원 " + money6 + "개");
            }
            if ((money - money6) > money6) {
                System.out.print("1원 " + money7 + "개");
            }

//        else if(money>10000){
//            System.out.print("1만원권 "+ money2+"개");
//        } else if(money>1000){
//            System.out.print("천원권 "+ money3+"개");
//        } else if(money>500){
//            System.out.print("500원 "+ money4+"개");
//        }
//        else if(money>100){
//            System.out.print("100원 "+ money5+"개");
//        }
//        else if(money>10){
//            System.out.print("10원 "+ money6+"개");
//        }
//        else if(money>1){
//            System.out.print("1원 "+ money7+"개");
//        }
        }
    }
}
