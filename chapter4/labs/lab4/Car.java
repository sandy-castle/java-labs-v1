package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 *
 * Car 클래스 정의하기 (Engine을 포함하는 관계)
 */
public class Car {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (모델명, 색상, 속도, Engine 타입의 필드 등)
    private String model;
    private String color;
    private Engine engine;
    private int speed;

    // TODO: 생성자를 정의하세요.
    // (Engine 객체를 생성하여 포함관계 구현)
    public Car(String model, String color, Engine engine, int speed) {
        this.model = model;
        this.color = color;
        this.engine = engine;  // 이미 전달받은 engine 사용
        this.speed = 0;
    }

    // TODO: 자동차를 시동하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void startEngine() {
        engine.start();
    }

    // TODO: 자동차를 정지하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 메소드 호출)
    public void stopEngine() {
        if (speed > 0) {
            System.out.println("차를 먼저 멈추세요.");
            return;
        }
        engine.stop();
    }

    // TODO: 자동차의 속도를 증가시키는 메소드를 정의하세요.
    public void accEngine(int amount) {
        if (!engine.isRunning()) {
            System.out.println("시동이 꺼져 있어 가속할 수 없습니다.");
            return;
        }

        speed += amount;
        System.out.println(amount + "km/h 가속했습니다. 현재 속도: " + speed + "km/h");
    }

    // TODO: 자동차의 속도를 감소시키는 메소드를 정의하세요.
    public void breakEngine(int amount) {
        if (speed - amount < 0) {
            speed = 0;
        } else {
            speed -= amount;
        }

        System.out.println(amount + "km/h 감속했습니다. 현재 속도: " + speed + "km/h");
    }

    // TODO: 자동차의 정보를 출력하는 메소드를 정의하세요.
    // (내부적으로 Engine 객체의 정보도 출력)
    public void displayCarInfo() {
        System.out.println("\n===== 자동차 정보 =====");
        System.out.println("모델: " + model);
        System.out.println("색상: " + color);
        System.out.println("현재 속도: " + speed + "km/h");
        System.out.println("------ 엔진 정보 ------");
        engine.printInfo(); // 기존의 engine.displayCarInfo() → 오류
        System.out.println("=====================");
    }

    // TODO: 필요한 getter/setter 메소드를 정의하세요.
    public String getColor() { return color; }
    public String getModel() { return model; }
    public int getSpeed() { return speed; }
    public Engine getEngine() { return engine; }
}
