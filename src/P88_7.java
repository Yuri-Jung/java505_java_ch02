import java.util.Scanner;
public class P88_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학점에 맞는 수를 입력하시오. A,B:1 C,D:2 F:3");
        int grade = scanner.nextInt();
        switch(grade){
            case 1:
            System.out.println("Excellent");
            break;

            case 2:
            System.out.println("Good");
            break;

            case 3:
            System.out.println("bye");
            break;

        }
    }
}