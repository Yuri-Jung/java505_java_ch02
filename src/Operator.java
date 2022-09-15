import java.util.Scanner;

public class Operator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 20;


        int c = a+b;
        System.out.println("a+b="+c);

        c=a-b;
        System.out.println("a-b="+c);

        c=10/3;
        System.out.println("10/3="+c);

        c=10%3;
        System.out.println("10%3="+c);

        System.out.println("\n\n");
        System.out.println("정수를 입력하세요: ");
        int time = scanner.nextInt();
        int second = time%60;
        int minute = (time/60)%60;
        int hour = (time/60)/60;

        System.out.println(time+"초는 ");
        System.out.println(hour+"시간, ");
        System.out.println(minute+"분, ");
        System.out.println(second+"초입니다");

        scanner.close();


    }
}
