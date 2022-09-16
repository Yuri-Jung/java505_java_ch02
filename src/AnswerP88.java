import java.util.Scanner;

public class AnswerP88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println("돈 액수 입력하시오");

//    원금 나누기 오만원 해서 오만원 개수 확인
        int m50000 = money / 50000;
        money = money % 50000;
//    5만원을 뺀 15245원을 변수 money에 저장

//    1만원권 수를 확인하기 위해 10000으로 나눔
        int m10000 = money / 10000;
        money = money % 10000; //1만원을 제외한 금액을 저장하기 위해 나머지 연산을 한다.

        int m1000 = money / 1000; //5245원에서 1천원권의 수를 확인하기 위해 1000으로 나눔
        money = money % 1000; //5000을 뺀 나머지 금액을 계산하기 위해 나머지 연산

        int m500 = money / 500;
        money = money % 500; //500을 나눈 후 나머지 금액을 계산하기 위해 나머지 연산

        int m100 = money / 100; //100원 개수를 확인
        money = money % 100; //200을 뺀 나머지 값 계산 45남음

        int m10 = money / 10;
        money = money % 10; // 1원 동전 수 계산

        System.out.println("오만원권"+m50000+"개");
        System.out.println("만원권"+m10000+"개");

        System.out.println("천원권"+m1000+"개");

        System.out.println("오백원권"+m500+"개");
//2번문제
        System.out.println("학점등급을 입력하세요");
        String level = scanner.next();
        switch(level){
            case "A":
            case "B":
                System.out.println();

                
//                3번문제
                int number = scanner.nextInt();
                int first = number/10; //10의 자리 숫자 저장
                int second = number %10; // 1의 자리 숫자를 저장
                int count = 0; //3,6,9 의 수를 저장하기 위한 변수

//                10의 숫자가 3의 배수인지 확인
                if(first%3==0){
                    count++;  //3의 배수면 변수 count 1증가
                }
                if (second%3==0){
                    count++;  //3의 배수면 변수 count 1증가
                }
                if (count==1){
                    System.out.println("박수짝");
                }
                else if (count==2){
                    System.out.println("박수짝짝");
                }
                else  {
                    System.out.println("박수없음");
                }
                if (first%3==0 && (second%3==0)){
                    System.out.println("박수짝짝");
                }
                else if((fist%3==0)^(second%3==0)) {
                System.out.println("박수짝");
            }
        else{
                System.out.println("박수없음");
            }
        }

       }
    }

