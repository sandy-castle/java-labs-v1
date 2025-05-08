package chapter4.labs.lab3;


/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * Calculator 클래스 정의하기
 */
public class Calculator {
    // TODO: PI 값을 나타내는 static final 상수를 정의하세요.
    public static final double PI = 3.14159265358979323846;
    // TODO: 인스턴스 변수를 정의하세요. (계산기 모델명, 계산 횟수 등)
    private String modelVer;
    private double similarity;
    // TODO: 계산기 객체의 총 개수를 나타내는 static 변수를 정의하세요.
    private static int claCounter = 0; // 전체 계산기 수 (static)
    private int calcCount = 0;         // 이 계산기의 수행 횟수 (인스턴스 변수)

    // TODO: 생성자를 정의하고, 객체가 생성될 때마다 계산기 개수를 증가시키세요.
    public Calculator(String modelVer, double similarity) {
        this.modelVer = modelVer;
        this.similarity = similarity;
        claCounter++;      // 전체 계산기 수 증가
        this.calcCount = 0; // 개별 계산기 수행횟수 초기화
    }

    // TODO: 원의 면적을 계산하는 static 메소드를 정의하세요.
    public static double calCircleArea(double similarity)
    {return PI * similarity * similarity;}
    // TODO: 원의 둘레를 계산하는 static 메소드를 정의하세요.
    public static double calCircleEdge(double similarity)
    {return  2*PI * similarity ;}
    // TODO: 사각형의 면적을 계산하는 static 메소드를 정의하세요.
    public static double calRecArea(double similarity)
    {return similarity * similarity;}

    public void useCalculator() {
        calcCount++;
        System.out.println("[" + modelVer + "] 계산 수행 #" + calcCount);
        System.out.println("→ 원 면적: " + calCircleArea(similarity));
        System.out.println("→ 원 둘레: " + calCircleEdge(similarity));
        System.out.println("→ 정사각형 면적: " + calRecArea(similarity));
    }

    // TODO: 계산기의 정보를 출력하는 메소드를 정의하세요.
    public void printInfo() {
        System.out.println("계산기 모델: " + modelVer);
        System.out.println("기준값 (반지름 또는 한 변): " + similarity);
        System.out.println("계산 횟수: " + claCounter);
    }

    // TODO: 현재까지 생성된 계산기의 총 개수를 반환하는 static 메소드를 정의하세요.
    public static int getTotalCalculatorCount()
    {
        return claCounter;
    }
} 