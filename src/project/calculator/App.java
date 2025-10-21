package project.calculator;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class App extends Calculator {
    public static void main(String[] args) {
        //1. 입력 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        //2. 숫자 입력 지정
        while (true) {
            System.out.print("첫 번째 숫자 입력:");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자 입력:");
            int num2 = scanner.nextInt();

            // 3. 사칙연산 기호 입력
            System.out.print("사칙연산을 입력하세요: ");
            char operator = scanner.next().charAt(0);

            //4. 결과값 변수 지정
            int result = calculator.calculate(num1, num2, operator);

            //TODO 2. ArrayList 받을 예정
            //3-1) 결과 출력
            calculator.addResult(result);

            //4-1) getter 활용
            ArrayList<Integer> getList = calculator.getArrayList();
            System.out.println("결과 저장: " + getList);

            //6. 계산 결과 출력
            System.out.println("결과: " + result);

            //삭제 여부
            System.out.println("\n데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String std = scanner.next();

            if (std.equals("remove")){
                calculator.removeResult(result);
                System.out.println("삭제 됐습니다.");
            } else {
                System.out.println("삭제요소가 없습니다.");
            }

            // 7.종료 여부
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            // 8. 입력값 받는 부분 -> null 안정성 참고
            String a = scanner.next();

            // 9. 비교
            if (a.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else {
                System.out.println("계산을 계속합니다.");
            }
        }
    }
}

