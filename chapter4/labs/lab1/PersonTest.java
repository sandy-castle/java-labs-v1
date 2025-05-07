package chapter4.labs.lab1;

import java.util.Scanner;
import java.util.*;

/**
 * Lab 1: 클래스와 객체 만들기
 * 
 * Person 클래스를 테스트하는 메인 클래스
 */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Person 클래스 테스트를 시작합니다.");
        Scanner input = new Scanner(System.in);
        
        // TODO: 이름이 John, 나이가 20, 성별이 Male인 Person 객체를 생성하세요.
         Person p1 = new Person("John",20,"male");
        // TODO: 생성한 객체의 정보를 출력하세요.
        p1.printInfo();

       /*
         * System.out.println(p1); 출력값 >> chapter4.labs.lab1.Person@19469ea2
        * 해당 값으 주소를 출력
        */

        // TODO: 생일이 지나 나이가 바뀌는 것을 출력하시오
        System.out.print("생일이 지났나요? (y/n): ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            p1.increaseAge();
        }
        p1.printInfo();
        // TODO: 이름이 Emily, 나이가 25, 성별이 Female인 두 번째 Person 객체를 생성하세요.
        Person p2 = new Person("Emily",25,"Female");

        // TODO: 두 번째 객체의 정보를 출력하세요.
        System.out.println("수정전");
        p2.printInfo();

        // TODO: 두 번째 객체의 나이를 증가시키고 정보를 다시 출력하세요.
        p2.age = 27;
        System.out.println("수정후");
        p2.printInfo();

        // TODO: 추가로 여러 Person 객체를 생성하여 배열로 관리하고 모든 객체의 정보를 출력하세요.
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        Scanner peopleInput = new Scanner(System.in);

        System.out.print("추가할 사람 수를 입력하세요: ");
        int count = peopleInput.nextInt();
        peopleInput.nextLine();

        for (int i = 0; i < count; i++)
        {
            System.out.println((i + 1) + "번째 사람 입력");

            String name;
            while (true)
            {
                System.out.print("이름: ");
                name = peopleInput.nextLine();
                peopleInput.nextLine();

                System.out.print("이 사람이 맞나요? (y/n): ");
                String confirm = peopleInput.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    break; // 확인됐으면 다음 단계로
                } else {
                    System.out.println("다시 입력해주세요.");
                }
            }
            System.out.print("나이: ");
            int age = peopleInput.nextInt();
            peopleInput.nextLine();
            System.out.print("성별: ");

            String gender = peopleInput.nextLine();

            Person newPerson = new Person(name, age, gender);
            people.add(newPerson);
        }

        System.out.println("=== 모든 사람의 정보 ===");
        for (Person p : people) {
            p.printInfo();
            System.out.println();
        }
    }
} 