package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * Dog 클래스를 정의하세요.
 * 이 클래스는 Animal 추상 클래스를 상속받아야 합니다.
 */
public class Dog extends Animal
{

    // TODO: 강아지의 추가 속성 정의 (예: 품종)
    private String breed;
    
    // TODO: 생성자 정의
    public Dog(String name, int age, String breed)
    {
        super(name, age);       // 부모 클래스의 생성자 호출
        this.breed = breed;     // Dog 클래스의 품종 초기화
    }

    // TODO: 추상 메소드 sound() 구현
    @Override
    public void sound()
    {
        System.out.println("dog sound");
    }
    
    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    @Override
    public void printInfo()
    {
        super.printInfo();  // 부모 클래스의 printInfo() 호출 (이름, 나이 출력)
        System.out.println("품종: " + breed);  // 추가로 품종 출력
    }

    // TODO: 강아지만의 고유한 메소드 추가
    public void wagTail()
    {
        System.out.println(getName() + "가 꼬리를 흔들고 있어요!");
    }

} 