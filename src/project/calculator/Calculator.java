package project.calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과 저장하는 컬렉션 타입 필드 생성
    //1. 속성
    //(순서: 2) 컬렉션 선언
    private static ArrayList<Integer> arrayList = new ArrayList<>();


    //2. 생성자
    // 규칙
    //클래스와 이름이 같다.
    //반환 데이터 타입이 없다.
    // 여러 개가 존재할 수 있다.

    //3. 기능

    //TODO 1. ArrayList 결과 값을 저장하는 값을 얻는다.
    //(순서: 3번)결과값 저장하는 메서드 -> 저장하는 것은 setter
     public void addResult(int result) {
         arrayList.add(result); //result 데이터 추가
     }

    //(순서: 4번)getter -> 조회
     //결과 꺼내오기
     public ArrayList<Integer> getArrayList() {
         return arrayList; //데이터 찾기
     }

    // (순서: 1번) 사칙연산을 수행한 후, 결과값을 반환하는 매서드 구헌
    //접근제어자, 반환데이터, 변수이름, 매개변수
    public int calculate (int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("분모는 0이 될 수 없습니다.");
                }
                break; //수정한 부분
            default:
                System.out.println("기호를 다시 입력해주세요.\n");
                System.out.println("결과:" +  result);
                break;

                // 반복되게 시도
                //continue;
//                System.out.println("결과 " + result);
        }
        // TODO 3. result를 ArrayList 저장
        return result;
    }
}
