package project.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1. 입력 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        //2. 숫자 입력 지정
        while (true) {
            System.out.print("첫 번째 숫자 입력:");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자 입력:");
            int num2 = scanner.nextInt();

            // 3. 사칙연산 기호 입력
            System.out.print("사칙연산을 입력하세요: ");
            char c = scanner.next().charAt(0);

            //4. 결과값 변수 지정
            int result = 0;

            //5. 계산하기
            switch (c) {
                case '+':
                    System.out.println(result = num1 + num2);
                    break;
                case '-':
                    System.out.println(result = num1 - num2);
                    break;
                case '*':
                    System.out.println(result = num1 * num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(result = num1 / num2);
                    } else {
                        System.out.println("분모는 0이 될 수 없습니다.");
                    }
                default:
                    System.out.println("결과값: " + result);
                    // 반복되게 시도
//                    continue;
            }
            //6. 계산 결과 출력
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // 7. 입력값 받는 부분
            String a = scanner.next();
            // 8. 비교
            if (a.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else {
                System.out.println("계산을 계속합니다.");
            }
        }
    }
}










//이프문 도전
//        if (c == '+') {
//            System.out.println(result = num1 + num2);
//        } else if (c == '-') {
//            System.out.println(result = num1 - num2);
//        } else if (c == '*'){
//            System.out.println(result = num1 * num2);
//        } else if (c == '/' && num2 == 0) {
//            System.out.println(result = num1 / num2);
//            if (num2 == 0)
//                System.out.println("0을 입력할 수 없습니다.");
//        }else {
//            System.out.println("");
//        }
//
//        System.out.println("결과 = " + result);


//        System.out.println("결과값: " + num1 + str.charAt(0) + num2 );


//        String[] arr = {"+", "-", "*", "/"};
//        System.out.print("사칙연산을 입력: " + arr[0]);
//        String str = scanner.nextLine();
//        System.out.println("결과값은 : " + num1 + arr + num2);

//        if (arr.equals("+")) {
//            System.out.println("덧셈의 결과: " + num1 + num2);
//        } else if (arr.equals("-")) {
//            System.out.println(num1 - num2);
//
//        } else if (arr.equals("*")) {
//            System.out.println(num1 * num2);
//        } else if (arr.equals("/")) {
//            System.out.println(num1 / num2);
//
//        }


//        System.out.print("두 번째 수 입력: ");

// 입력 공간 출력

// 변수 생성


// 결과 변수 생성

// 사칙연산 (+, - , *, /)



