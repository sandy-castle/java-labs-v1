package chapter2.labs.lab1;

import java.util.Scanner;

/**
 * if 문을 사용한 조건 분기 실습
 */
public class IfStatementLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 사용자로부터 숫자를 입력받아 양수, 음수, 또는 0인지 판별하는 프로그램
        System.out.println("숫자를 입력하세요 : ");
        int number = scanner.nextInt();
        if (number < 0)
        {
            System.out.println("음수입니다.");
        }
            else if (number == 0)
        {
            System.out.println("0입니다");
        }
            else
        {
            System.out.println("양수입니다.");
        }
        
        // TODO: 입력받은 숫자가 양수, 음수, 0인지 판별하고 출력하세요.
        // 양수이면 "양수입니다."
        // 음수이면 "음수입니다."
        // 0이면 "0입니다."
        
        
        // 2. 두 숫자를 입력받아 큰 수를 출력하는 프로그램
        System.out.println("\n첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        // TODO: 두 숫자 중 큰 수를 출력하세요.
        // 만약 두 수가 같다면 "두 수는 같습니다."라고 출력하세요.
        if (num1 > num2)
        {
            System.out.println(num1 + "가 더 큽니다.");
        }
        else if (num1 < num2)
        {
            System.out.println(num2 + "가 더 큽니다.");
        }
        else
        {
            System.out.println("두 숫자는 같습니다.");
        }
        
        // 3. 점수를 입력받아 학점을 출력하는 프로그램
        System.out.println("\n시험 점수를 입력하세요 (0-100): ");
        int score = scanner.nextInt();
        if (90<=score && score<=100)
        {
            System.out.println("성적은 A 입니다.");
        }
        else if (80<=score && score<90)
        {
            System.out.println("성적은 B 입니다.");
        }
        else if (70<=score && score<80)
        {
            System.out.println("성적은 C 입니다.");
        }
        else if (60<=score && score<70)
        {
            System.out.println("성적은 D 입니다.");
        }
        else if (0<=score && score<60)
        {
            System.out.println("성적은 F 입니다.");
        }
        else
        {
            System.out.println("잘못된 점수 입니다.");
        }

        // TODO: 입력받은 점수에 따라 학점을 출력하세요.
        // 90-100: "A"
        // 80-89: "B"
        // 70-79: "C"
        // 60-69: "D"
        // 0-59: "F"
        // 범위를 벗어난 점수: "잘못된 점수입니다."
        
        
        scanner.close();
    }
} 