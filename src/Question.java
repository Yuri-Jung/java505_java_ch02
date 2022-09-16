import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
//        문제 1 ) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하시오.
//        else if문을 사용하여 작성
//        A+ >=95 A :>=90 B+ :>=85 B>=80 C+:>=75 C:>=70 D :>= 60 F: 60미만
//        중첩 if문을 사용하여 각각의 + 대의 점수를 출력
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        if (score >= 90) {
            if (score >= 95) {
                System.out.println("학점은" + score + "이며 A+입니다.");
            } else {
                System.out.println("학점은" + score + "이며 A 입니다.");
            }
        }
        else if (score > 80) {
            if (score >= 85) {
                System.out.println("학점은" + score + "이며 B+입니다.");
            } else {
                System.out.println("학점은" + score + "이며 B 입니다.");
            }
        }
        else if (score > 70) {
            if (score >= 75) {
                        System.out.println("학점은" + score + "이며 C+입니다.");
                    } else {
                        System.out.println("학점은" + score + "이며 C 입니다.");
                    }
                }
        else if (score >= 60) {
                    if (score >= 65) {
                        System.out.println("학점은" + score + "이며 D+입니다.");
                    } else {
                        System.out.println("학점은" + score + "이며 D 입니다.");
                    }
                }
        else if (score < 60) {
                    System.out.println("학점은" + score + "이며 F입니다.");
                }
            }
        }
