package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 *
 * Circle 클래스를 정의하세요.
 * 이 클래스는 Shape 클래스를 상속받아야 합니다.
 */
public class Circle extends Shape {
    // TODO: 원의 속성 정의 (예: 반지름)
    private double radius;

    // TODO: 생성자 정의
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // TODO: 지름을 반환하는 메소드 정의
    public double getDiameter() {
        return radius * 2;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 면적 계산
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 둘레 계산
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 정보 출력
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("반지름: " + radius);
        System.out.println("지름: " + getDiameter());
    }
}
