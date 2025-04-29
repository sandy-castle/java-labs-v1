package chapter2.labs.lab5;

import java.util.Scanner;

/**
 * 별표(*) 패턴 출력 실습
 */
public class StarPatternLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("패턴 출력을 위한 높이를 입력하세요: ");
        int he = scanner.nextInt();

        // 1. 직각삼각형 패턴 (왼쪽 정렬)
        System.out.println("\n1. 직각삼각형 패턴 (왼쪽 정렬)");
        // 예시 (높이 5):
        // *
        // **
        // ***
        // ****
        // *****

        // TODO: 위와 같은 패턴을 출력하세요.

        for (int i = 1; i <= he; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
        
        // 2. 직각삼각형 패턴 (오른쪽 정렬)
        System.out.println("\n2. 직각삼각형 패턴 (오른쪽 정렬)");
        // 예시 (높이 5):
        //     *
        //    **
        //   ***
        //  ****
        // *****

        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i = 1; i <= he; i++)
        {
            // 공백 출력 (height - i 개)
            for (int j = 1; j <= he - i; j++)
            {
                System.out.print(" ");
            }
            // 별 출력 (i 개)
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
        
        // 3. 피라미드 패턴
        System.out.println("\n3. 피라미드 패턴");
        // 예시 (높이 5):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i = 1; i <= he; i++) {
            // 왼쪽 공백
            for (int j = 1; j <= he - i; j++) {
                System.out.print(" ");
            }
            // 별 (2*i - 1 개)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
        //짝수 별 피라미드

        for (int i = 1; i <= he; i++)
        {
            for (int j = 1; j <= he - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i; k++)
            {  // ★짝수 별 개수★
                System.out.print("*");
            }
            System.out.println();
        }
        // 4. 역삼각형 패턴
        System.out.println("\n4. 역삼각형 패턴");
        // 예시 (높이 5):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.

        for (int i = he; i >= 1; i--)
        {
            for (int j = 1; j <= he - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = he; i >= 1; i--) {
            // 왼쪽 공백: he - i 개
            for (int j = 1; j <= he - i; j++)
            {
                System.out.print(" ");
            }
            // 별: 짝수 개 (2 * i)
            for (int k = 1; k <= 2 * i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5. 다이아몬드 패턴
        System.out.println("\n5. 다이아몬드 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        
        
        // 6. 모래시계 패턴
        System.out.println("\n6. 모래시계 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        
        
        // 7. 숫자 피라미드 패턴
        System.out.println("\n7. 숫자 피라미드 패턴");
        // 예시 (높이 5):
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
        
        // TODO: 위와 같은 패턴을 출력하세요.
        
        
        scanner.close();
    }
} 