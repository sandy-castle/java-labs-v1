package chapter5.labs.lab1;

/**
 * Lab 1: 상속과 메소드 오버라이딩
 *
 * Rectangle 클래스를 정의하세요.
 * 이 클래스는 Shape 클래스를 상속받아야 합니다.
 */
public class Rectangle extends Shape {
    // TODO: 사각형의 속성 정의 (예: 너비, 높이)
    private double width;
    private double height;

    // TODO: 생성자 정의
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 면적 계산
    @Override
    public double getArea() {
        return width * height;
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 둘레 계산
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // TODO: 부모 클래스의 메소드를 오버라이딩하여 정보 출력
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
    }

    // TODO: 정사각형 여부 확인
    public boolean isSquare() {
        return width == height;
    }
}
