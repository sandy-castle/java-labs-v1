package chapter1.labs.lab4;

import java.util.Scanner;

/**
 * Lab 4: 자바 연산자 실습
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        Scanner input = new Scanner(System.in);
        System.out.println("=====산술 연산자 사용하기======");
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int first = input.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int second = input.nextInt();
        System.out.println("a + b : " +(first+second));
        System.out.println("a - b : " + (first - second));
        System.out.println("a * b : " +(first*second));
        System.out.println("a / b : " +(first/second));
        System.out.println("a % b : " +(first%second));

        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.
        System.out.println("=====증감 연산자 사용하기======");
        System.out.print("숫자를 입력하세요 :" );
        int third = input.nextInt();
        System.out.println("a++ : " +(third++));
        System.out.println("++a :" +(++third));
        System.out.println("a-- : " +(third--));
        System.out.println("--a :" +(--third));
        
        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).
        System.out.println("=====비교 연산자 사용하기======");
        System.out.print("숫자를 입력하세요 : " );
        int fourth = input.nextInt();
        System.out.print("숫자를 입력하세요 : ");
        int fifth = input.nextInt();
        System.out.println("a == b :" + (fourth==fifth));
        System.out.println("a != b :" + (fifth!=fourth));
        System.out.println("a < b : " + (fifth<fourth));
        System.out.println("a > b : " + (fifth>fourth));
        System.out.println("a <= b : " + (fifth<=fourth));
        System.out.println("a >= b : " + (fifth>=fourth));
        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println("=====논리 연산자 사용하기======");
        System.out.println("boo1 : " + boo1 + " boo2 : " + boo2);
        System.out.println("a&&b : " + (boo1&&boo2));
        System.out.println("a||b : " + (boo1||boo2));
        System.out.println("!a : " + (!boo1));
        
        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        System.out.println("=====대입 연산자 사용하기======");
        System.out.print("숫자를 입력하세요 : " );
        int sixth = input.nextInt();
        System.out.print("숫자를 입력하세요 : " );
        int seventh = input.nextInt();
        System.out.println("a += b : "+ (sixth+=seventh) );
        System.out.println("a -= b : "+ (sixth-=seventh) );
        System.out.println("a *= b : "+ (sixth*=seventh) );
        System.out.println("a /= b : "+ (sixth/=seventh) );
        System.out.println("a%= b : "+ (sixth%=seventh) );

        
        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.
        System.out.println("=====if-elss를 이용한 삼항 연산자======");
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int eighth = input.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : " );
        int nineth = input.nextInt();
        if (eighth>nineth)
        {
            System.out.println("첫번째 숫자가 두번째 숫자보다 큽니다.");
        }
        else
        {
            System.out.println("두번째 숫자가 첫번째 숫자보다 큽니다.");
        }
        
    }
} 