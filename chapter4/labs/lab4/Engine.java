package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 *
 * Engine 클래스 정의하기
 */
public class Engine {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (엔진 타입, 마력, 작동 상태 등)
    private String model;
    private int horsePower;
    private boolean running;

    // TODO: 생성자를 정의하세요.
    public Engine(String model, int horsePower)
    {
        this.model = model;
        this.horsePower = horsePower;
        this.running = false; // 기본값: 꺼져 있음
    }

    // TODO: 엔진을 시작하는 메소드를 정의하세요.
    public void start() {
        if (!running) {
            running = true;
            System.out.println("엔진이 시동되었습니다.");
        } else {
            System.out.println("엔진이 이미 작동 중입니다.");
        }
    }

    // TODO: 엔진을 정지하는 메소드를 정의하세요.
    public void stop()
    {
        if (running)
        {
            running = false;
            System.out.println("엔진이 정지되었습니다.");
        }
        else
        {
            System.out.println("엔진은 이미 꺼져 있습니다.");
        }
    }

    // TODO: 엔진의 상태를 확인하는 메소드를 정의하세요.
    public boolean isRunning() {return running;}

    // TODO: 엔진의 정보를 출력하는 메소드를 정의하세요.
    public void printInfo() {
        System.out.println("엔진 모델: " + model);
        System.out.println("마력: " + horsePower + " HP");
        System.out.println("작동 상태: " + (running ? "작동 중" : "정지됨"));
    }

    // TODO: 필요한 getter/setter 메소드를 정의하세요.
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getHorsePower() {return horsePower;}
    public void setHorsePower(int horsePower) {this.horsePower = horsePower;}
}
