import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("nextLine()를 사용하여 한 번에 키보드 입력 가져오기");
//        String data= scanner.nextLine();
//        System.out.println(data);

//        String name = scanner.next();
//        System.out.println("당신의 이름은"+name+"입니다");
//
//        String city = scanner.next();
//        System.out.println("당신이 사고 있는 도시는 "+city+"입니다");
//
//        int age = scanner.nextInt();
//        System.out.println("당신의 나이는"+"입니다.");
//
//        double weight = scanner.nextDouble();
//        System.out.println("당신의 체중은 "+weight+"입니다.");
//
//        boolean single = scanner.nextBoolean();
//        System.out.println("당신의 독신 여부는 "+single+"입니다.");
//
//
//
//        scanner.close();

        System.out.println("----문자열 연결 연산자-----");

        System.out.println("하나의 긴 문자열을 표현하기 위해서는 String 타입의 변수에 긴 문자열을 저장하여 출력");


        System.out.println("여러개의 문자열 번수에 저장된 내용을 한 줄로 표현하고 싶을 경우 사용하는 것이 문자열 연결연산자");

        String str1 = "String 타입의 긴 문자열을 입력하여 println()함수를 통해 화면에 출력";
        System.out.println(str1);

        System.out.println("2개 이상의"+"문자열을 + 연산자를 사용하여"+"연산을 진행하면"+"하나의 긴 문자열로 출력됨");

        String str2="2개 이상의 ";
        String str3 = "문자열을 + 연산자를 사용하여 ";
        String str4 = "연산을 진행하면 ";
        String str5= "하나의 긴 문자열로 출력됨";

        String str6=str2+str3+str4+str5;
        System.out.println(str6);
//여러 문자열을 한 줄로 정리하여 보이게 한다.

//        문자열과 기본 데이터타입을 연산시 모두 문자열로 변환됨.
        String menu = "로세티리 바베큐 ";
        String menu2="세트";
        int price1 = 6500;
        int price2 = 2000;

        System.out.println(menu +price1+"원");
        System.out.println(menu+menu2+(price1+price2)+"원");

//        menu+menu2에서 +는 문자열연결연산자.  왼->오
//        ()안에 있는 데이터를 먼저 연산
//        ()가 가장먼저 계산되기 때문에 price1 price2가 먼저 계산된다. 그러나 8500은 문자열이다.
        System.out.println(menu+menu2+price1+price2+"원");
//        연산자의 운선순위 때문에 왼쪽부터 차례대로 연산을 진행하여 문자열과 숫자(65000)의 연산이 먼저 발생하고 , 그 이후에 문자열과
//        두 번째 숫자(2000)의 연산이 발생하여 '로세리티 바베큐 세투 65002000의 형태로 화면에 출력된다.
//         * / 우선순위에 있기 때문에 먼저 계산되기 때문에 괜찮다. 그렇지만 + - 가 문제 생기는 경우가 발생한다.


        System.out.println("\n----증감 연산자-----\n");

//        전위연산 혹은 후위 연산이 단독으로 사용될 경우에는 일반 연산자를 통해서 값을 증감시키는 것과 차이가 없다.
//        전위 연산 혹은 후위 연산을 다른 연산식과 함께 사용할 경우 실행되는 시점이 달라짐
        int op = 10;
        System.out.println("변수 op의 값: "+op);
        op++;
        System.out.println("op++ 이후의 값"+op);
        ++op;
        System.out.println("++op 이후의 값"+op);
        --op;
        System.out.println("--op 이후의 값"+op);
        op--;
        System.out.println("op-- 이후의 값"+op);

        System.out.println("\n");

        op = 10;
        System.out.println("현재 변수 OP의 값 : "+op);
        System.out.println("++op 실행 이후의 값 : "+ (++op));
        System.out.println("현재 변수 OP의 값 : "+op);
        System.out.println("op++ 실행 시 : "+ op++);
        System.out.println("현재 op의 값: "+op);
        System.out.println("op-- 실행시: " + op--);
        System.out.println("현재 op의 값: "+op);
        System.out.println("현재 --op 실행 시:"+ --op);
        System.out.println("현재 op의 값: "+op);



        System.out.println("\n----비교연산자----\n");

        System.out.println('a'>'b');
        System.out.println(3>=2);
        System.out.println(3.45<=2);
        System.out.println(-1<0);
        System.out.println(3==2);
        System.out.println(3!=2);
//        System.out.println(!(3!=2));
//        System.out.println();

        System.out.println("\n======논리연산자=====\n");

        System.out.println(!(3!=2));
        System.out.println((3>2)&&(3>4));
        System.out.println((3!=2)||(-1>0));
        System.out.println((3!=2)^(-1>0));  //둘다 TRUE FALSE가 나오면 FALSE로 나온다.


        System.out.println("\n======조건연산자(3항 연산자)=====\n");

        int num1=3;
        int num2= 5;

        System.out.println("두 수의 차는 "+((num1>num2)?(num1-num2):(num2-num1)));

        if (num1>num2){
            System.out.println("두 수의 차는 "+(num1-num2));
        } else {
            System.out.println("두 수의 차는 "+(num2-num1));
        }
    }
}