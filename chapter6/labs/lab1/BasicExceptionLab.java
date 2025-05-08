package chapter6.labs.lab1;

import java.util.Scanner;

/**
 * Lab 1: 기본 예외처리
 * 
 * 사용자로부터 두 개의 숫자를 입력받아 나눗셈을 수행하는 프로그램입니다.
 * 0으로 나누기, 숫자가 아닌 입력 등의 예외 상황을 처리해야 합니다.
 */
public class BasicExceptionLab
{
    public static void main(String[] args)
    {
        System.out.println("Lab 1: 기본 예외처리 실습");
        // TODO: Scanner 객체를 생성하세요.
        Scanner scanner = null;
        // TODO: try-catch-finally 구문을 작성하세요.
        // 1. 사용자로부터 두 개의 숫자를 입력받습니다.
        // 2. 첫 번째 숫자를 두 번째 숫자로 나눈 결과를 출력합니다.
        // 3. 다음 예외 상황을 처리하세요:
        //    - ArithmeticException: 0으로 나누려는 경우
        //    - NumberFormatException: 숫자가 아닌 값을 입력한 경우
        //    - 기타 예외: 기타 모든 예외 상황
        // 4. finally 블록에서 Scanner 객체를 닫고 프로그램 종료 메시지를 출력하세요.

        try
        {
            // 1. 사용자로부터 두 개의 숫자를 입력받습니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            // 2. 첫 번째 숫자를 두 번째 숫자로 나눈 결과를 출력합니다.
            int result = num1 / num2;
            System.out.println("나눈 결과: " + result);
        }
        catch (ArithmeticException e)
        {
            // 3-1. 0으로 나누려는 경우
            System.out.println("오류: 0으로 나눌 수 없습니다.");
        }
        catch (NumberFormatException e)
        {
            // 3-2. 숫자가 아닌 값을 입력한 경우
            System.out.println("오류: 숫자를 입력해야 합니다.");
        }
        catch (Exception e)
        {
            // 3-3. 기타 모든 예외 상황
            System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
        }
        finally
        {
            // 4. Scanner 닫고 종료 메시지 출력
            scanner.close();
            System.out.println("프로그램을 종료합니다.");
        }
    }
} 