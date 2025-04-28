package chapter1.labs.lab2;

import java.util.Scanner;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte b1 = 0;
        short s1 = 0;
        int i1 = 0;
        long l1 = 0;
        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float f1 = 0;
        double d1 = 0;
        
        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char c1 = 0;
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean boo1 = true;
        
        // TODO: 5. 모든 변수 값을 출력하세요.
        System.out.println("byte 값 : " + b1);
        System.out.println("short 값 : " + s1);
        System.out.println("int 값 : " + i1);
        System.out.println("long 값 : " + l1);
        System.out.println("float 값 : " + f1);
        System.out.println("double 값 : " + d1);
        System.out.println("char 값 : " + c1);
        System.out.println("boolean 값 : " + boo1);
        
        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 키는 : " );
        double height = sc.nextDouble(); // 키 입력받기 (단위: 미터)
        System.out.print("당신의 몸무게는 : " );
        double weight = sc.nextDouble(); // 몸무게 입력
        double bmi = weight / (height * height);

        // 결과 출력
        System.out.println("당신의 BMI는: " + bmi);

    }
} 