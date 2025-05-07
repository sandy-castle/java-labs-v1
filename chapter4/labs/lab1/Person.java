package chapter4.labs.lab1;

/**
 * Lab 1: 클래스와 객체 만들기
 * 
 * Person 클래스 정의하기
 */
public class Person {
    // TODO: 이름, 나이, 성별을 저장할 수 있는 필드를 정의하세요.
    String name;
    int age;
    String gender;
    
    // TODO: 객체 정보를 출력하는 메소드를 작성하세요.
    public Person(String name, int age, String gender)
    {
       this.name = name;
       this.age = age;
       this.gender = gender;
    }
    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    // TODO: 생일이 지났을 때 나이를 한 살 증가시키는 메소드를 작성하세요.
    public void increaseAge()
    {
        age++;
        System.out.println("생일이 지나 나이가 바뀌었습니다.");
        System.out.println("현재 나이: " + age);
    }
} 