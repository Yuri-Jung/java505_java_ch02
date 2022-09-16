import java.util.Scanner;
public class P88_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1에서 99사이의 정수를 입력하세요");
        int clap = scanner.nextInt();
        int first = clap / 10;
        int second = clap % 10;

        if (clap % 3 == 0 && clap / 10 % 3 == 0) {
            System.out.println("박수짝짝");
        } else if (clap % 3 == 0 ) {
            System.out.println("박수짝");
        }else if(clap/10==3){
                System.out.println("박수짝");
        } else {
            System.out.println("박수없음");
        }
    }
}

