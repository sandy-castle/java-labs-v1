package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        System.out.println("자동 형 변환");
        byte by1 = 47;
        int in1 = by1;
        long lo1 = in1;
        float fl1 = lo1;
        double dbl1 = fl1;
        System.out.println("byte 값 : "+by1);
        System.out.println("int 값 : "+in1);
        System.out.println("long 값 : "+lo1);
        System.out.println("float 값 : "+fl1);
        System.out.println("double 값 : "+dbl1);
        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기
        System.out.println("명시적 형변환");
        double dbl2= 3.14159;
        fl1 = (float) dbl1;
        System.out.println("현재 fl1 값 : "+fl1);
        lo1 = (long) fl1;
        System.out.println("현재 lo1 값 : "+lo1);
        in1 = (int) lo1;
        System.out.println("현재 in1 값 : "+in1);
        char ch1 = (char) in1;
        System.out.println("현재 ch1 값 : "+ch1);
        short sh1 = (short) ch1;
        System.out.println("현재 sh1 값 : "+sh1);
        byte by2 = (byte) sh1;
        System.out.println("현재 by1 값 : "+by2);

        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        System.out.println("데이터 손실 확인");
        int in2 = 2^31-1;
        System.out.println(" in2  : "+in2);
        by2 = (byte) in2;
        System.out.println("in2 값은 by2로 변환되었습니다. ");
        System.out.println("by2 : "+by2);
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기
        System.out.println("문자열과 숫자열 서로 바꾸기");
        String str1 = "123";  // 정수형 문자열
        String flo1 = "3.14";  // 실수형 문자열

        // 문자열을 정수로 변환
        int intValue = Integer.parseInt(str1);

        // 문자열을 실수로 변환
        float floatValue = Float.parseFloat(flo1);

        // 출력
        System.out.println("정수로 변환된 값: " + intValue);  // 출력: 123
        System.out.println("실수로 변환된 값: " + floatValue);// 출력: 3.14

        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        // 정수와 실수 선언
        int int8 = 456;
        float fl7 = 7.89f;

        // 정수를 문자열로 변환
        String strInt = Integer.toString(int8);

        // 실수를 문자열로 변환
         String strFloat = Float.toString(fl7);

        // 출력
        System.out.println("정수 456을 문자열로 변환한 값: " + strInt);  // 출력: 456
        System.out.println("실수 7.89를 문자열로 변환한 값: " + strFloat);  // 출력: 7.89
    }
} 