package chapter2.labs.lab4;

import java.util.Scanner;

/**
 * while 반복문을 사용한 반복 실습
 */
public class WhileLoopLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 숫자를 입력받아 0이 입력될 때까지 합을 계산하여 출력하는 프로그램

        // TODO: 사용자로부터 숫자를 입력받고, 0이 입력될 때까지의 합계를 계산하여 출력하세요.
        // 1) 합계를 저장할 변수를 선언하세요.
        // 2) while 반복문을 사용하여 사용자로부터 숫자를 입력받으세요.
        // 3) 입력받은 숫자가 0이 아니면 합계에 더하고, 0이면 반복문을 종료하세요.
        // 4) 최종 합계를 출력하세요.
        int sum = 0;
        System.out.println("숫자를 입력하세요 (0을 입력하면 종료):");
        int num = scanner.nextInt();
        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println("합계 : " + sum);

        // 2. 1부터 100까지의 짝수만 출력하는 프로그램
        System.out.println("\n1부터 100까지의 짝수 출력:");

        // TODO: while 반복문을 사용하여 1부터 100까지의 짝수만 출력하세요.
        // 1. 변수를 1로 초기화하세요.
        // 2. while 반복문을 사용하여 변수가 100 이하인 동안 반복하세요.
        // 3. 변수가 짝수인 경우에만 출력하세요.
        // 4. 변수를 1씩 증가시키세요.
        int num3 = 1;
        System.out.print("짝 수 :");
        while (num3 <= 100) {
            num3++;
            if (num3 % 2 == 1) {
                continue;
            }
            System.out.print(num3 + " ");
        }


        // 3. 구구단 출력 (do-while 사용)
        System.out.println("\n출력할 구구단의 단을 입력하세요 (2-9): ");

        // TODO: do-while 반복문을 사용하여 사용자가 2-9 사이의 숫자를 입력할 때까지 반복하고,
        // 입력받은 단의 구구단을 출력하세요.
        while (true) {
            int num2 = scanner.nextInt();

            if (num2 >= 2 && num2 <= 9) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(num2 + " x " + j + " = " + (num2 * j));
                }
                break;
            } else {
                System.out.println("2에서 9 사이의 숫자만 입력하세요.");
            }
        }
        // 4. 숫자 맞추기 게임
        System.out.println("\n숫자 맞추기 게임:");

        // 컴퓨터가 1에서 100 사이의 임의의 숫자를 선택 (예시로 73 사용)
        int target = 73;
        int attempts = 0;

        // TODO: while 반복문을 사용하여 사용자가 숫자를 맞출 때까지 반복하세요.
        // 1. 사용자로부터 숫자를 입력받으세요.
        // 2. 시도 횟수를 증가시키세요.
        // 3. 입력받은 숫자가 목표 숫자보다 크면 "더 작은 숫자를 입력하세요."를 출력하세요.
        // 4. 입력받은 숫자가 목표 숫자보다 작으면 "더 큰 숫자를 입력하세요."를 출력하세요.
        // 5. 입력받은 숫자가 목표 숫자와 같으면 "정답입니다!"와 시도 횟수를 출력하고 반복문을 종료하세요.

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int guess = scanner.nextInt(); // 1. 사용자로부터 숫자 입력
            attempts++;

            // 2. 시도 횟수 증가

            if (guess > target) {           // 3. 입력 숫자가 목표보다 크면
                System.out.println("더 작은 숫자를 입력하세요.");
            } else if (guess < target) {    // 4. 입력 숫자가 목표보다 작으면
                System.out.println("더 큰 숫자를 입력하세요.");
            } else {                        // 5. 입력 숫자가 목표 숫자와 같으면
                System.out.println("정답입니다!");
                System.out.println("시도 횟수: " + attempts + "번");
                break; // 반복 종료
            }
        }

        // 5. 피보나치 수열 출력하기
        System.out.println("\n피보나치 수열 출력:");
        System.out.print("출력할 피보나치 수열의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int first = 0;
        int second = 1;
        int index = 0;

        System.out.println("피보나치 수열 결과:");
        while (index < count) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            index++;
            scanner.close();
        }
    }
}