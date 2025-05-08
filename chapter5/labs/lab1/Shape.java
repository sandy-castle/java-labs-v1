package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 *
 * Shape 클래스를 정의하세요.
 * 이 클래스는 도형의 기본 속성과 면적을 계산하는 메소드를 가지고 있어야 합니다.
 */
public abstract class Shape {
    // TODO: 도형의 기본 속성 정의 (예: 색상, 내부 채움 여부)
    protected String color;
    protected boolean filled;

    // TODO: 생성자 정의
    public Shape() {
        this.color = "black";
        this.filled = true;
    }

    // TODO: 면적을 계산하는 추상 메소드 정의
    public abstract double getArea();

    // TODO: 둘레를 계산하는 추상 메소드 정의
    public abstract double getPerimeter();

    // TODO: 도형 정보를 출력하는 메소드 정의
    public void displayInfo() {
        System.out.println("\n===== 도형 정보 =====");
        System.out.println("유형: " + getClass().getSimpleName());
        System.out.println("색상: " + color);
        System.out.println("내부 채움: " + (filled ? "채워짐" : "비어있음"));
        System.out.println("면적: " + getArea());
        System.out.println("둘레: " + getPerimeter());
    }
}
