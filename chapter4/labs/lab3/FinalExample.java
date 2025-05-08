package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * final 키워드 예제 클래스
 */
// FinalExample.java
public class FinalExample {
    // TODO: final 변수를 선언하고 초기화하세요.
    private final int constantValue = 100;

    // TODO: final 변수를 선언만 하고, 생성자에서 초기화하세요.
    private final String name;

    // TODO: 생성자를 정의하세요.
    public FinalExample() {
        // final 변수 초기화
        this.name = "FinalExample Instance";
    }

    // TODO: final 메소드를 정의하세요.
    public final void showConstant() {
        System.out.println("상수값: " + constantValue);
        System.out.println("이름: " + name);
    }

    // TODO: final 매개변수를 받는 메소드를 정의하세요.
    public void printFinalParameter(final int number) {
        // number = number + 1; // 불가능 (컴파일 오류 발생)
        System.out.println("전달된 final 매개변수: " + number);
    }

    public static void main(String[] args) {
        System.out.println("Final 키워드 예제를 실행합니다.");

        // TODO: FinalExample 객체를 생성하세요.
        FinalExample fe = new FinalExample();

        // TODO: 객체의 메소드를 호출하세요.
        fe.showConstant();
        fe.printFinalParameter(42);

        // TODO: final 클래스의 객체를 생성하고 메소드를 호출하세요.
        FinalClass fc = new FinalClass();
        fc.display();

        // TODO: final 지역 변수를 선언하고 사용하세요.
        final int localValue = 10;
        System.out.println("final 지역 변수: " + localValue);
    }
}

// TODO: final 클래스를 정의하세요.
final class FinalClass {
    public void display() {
        System.out.println("final 클래스의 메소드입니다.");
    }
}

// TODO: 일반 클래스와 하위 클래스를 정의하고, final 메소드 오버라이딩을 시도해보세요.
class Parent {
    public final void cannotOverride() {
        System.out.println("이 메소드는 오버라이딩할 수 없습니다.");
    }
}

class Child extends Parent {
    // @Override
    // public void cannotOverride() {
    //     System.out.println("오버라이딩 시도 → 컴파일 오류 발생!");
    // }
}


