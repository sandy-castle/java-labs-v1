package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 *
 * Driver 클래스 정의하기 (Car를 사용하는 관계)
 */
public class Driver {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (이름, 운전 경력 등)
    private String name;
    private int licenseYear;

    // TODO: 생성자를 정의하세요.
    public Driver(String name, int licenseYear) {
        this.name = name;
        this.licenseYear = licenseYear;
    }

    // TODO: 자동차를 운전하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void drive(Car car) {
        System.out.println("\n" + name + "이(가) " + car.getModel() + "을(를) 운전합니다.");
        car.startEngine();
        car.accEngine(50);
        car.breakEngine(20);
        car.stopEngine();
    }

    // TODO: 자동차를 점검하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void checkCar(Car car) {
        System.out.println("\n" + name + "이(가) 자동차 상태를 점검합니다.");
        car.displayCarInfo();
    }

    // TODO: 운전자의 정보를 출력하는 메소드를 정의하세요.
    public void printDriverInfo() {
        System.out.println("\n===== 운전자 정보 =====");
        System.out.println("이름: " + name);
        System.out.println("운전 경력: " + licenseYear + "년");
        System.out.println("====================");
    }
}
