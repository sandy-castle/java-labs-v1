package chapter4.labs.lab3;

import java.util.Scanner;
import chapter4.labs.lab3.Calculator;


/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * Calculator 클래스를 테스트하는 메인 클래스
 */
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Calculator 클래스 테스트를 시작합니다.");
        Scanner input = new Scanner(System.in);
        // TODO: 클래스 이름으로 static 상수에 접근하여 출력하세요.
        System.out.println("원주율 값 : " + Calculator.PI);
        // TODO: 객체 생성 없이 static 메소드를 호출하여 원의 면적과 둘레를 계산하세요.
        // 반지름 입력받기
        System.out.print("반지름을 입력하세요: ");
        double radius = input.nextDouble();

        double area = Calculator.calCircleArea(radius);
        double circumference = Calculator.calCircleEdge(radius);

        System.out.println("원의 면적: " + area);
        System.out.println("원의 둘레: " + circumference);

        // TODO: 객체 생성 없이 static 메소드를 호출하여 사각형의 면적을 계산하세요.
        System.out.print("정사각형 한 변의 길이를 입력하세요: ");
        double side = input.nextDouble();
        double areaRec = Calculator.calRecArea(side);
        System.out.println("정사각형의 면적: " + areaRec);

        // TODO: Calculator 객체를 생성하고 인스턴스 메소드를 호출하세요.
        Calculator calc1 = new Calculator("Model-A", 5.0);
        calc1.useCalculator();

        // TODO: 생성된 Calculator 객체의 정보를 출력하세요.
        calc1.printInfo();

        // TODO: 추가로 Calculator 객체를 생성하고, 객체 생성 횟수를 확인하세요.
        Calculator calc2 = new Calculator("Model-B", 3.5);
        System.out.println("총 생성된 계산기 수: " + Calculator.getTotalCalculatorCount());


        // TODO: 각 객체의 인스턴스 변수 값과 static 변수 값을 비교하세요.
        System.out.println("\n[calc1 정보]");
        calc1.printInfo();
        System.out.println("→ 총 계산기 수(static): " + Calculator.getTotalCalculatorCount());

        System.out.println("\n[calc2 정보]");
        calc2.printInfo();
        System.out.println("→ 총 계산기 수(static): " + Calculator.getTotalCalculatorCount());


    }
} 