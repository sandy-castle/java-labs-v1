package chapter3.labs.lab2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열 활용하기 실습
 */
public class ArrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 정수형 배열 활용
        System.out.println("===== 정수형 배열 활용 =====");
        
        // TODO: 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 계산하여 출력하세요.
        // 힌트: Scanner를 이용하여 사용자로부터 입력을 받으세요.
        int[] wins =new int[5];
        int sumWins = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < wins.length; i++)
        {
            System.out.print((i + 1) + "번째 값: ");
            wins[i] = scanner.nextInt();
            sumWins += wins[i];
        }

        double avrWins = (double) sumWins / wins.length;

        System.out.println("\n입력된 점수:");
        for (int score : wins)
        {
            System.out.print(score + " ");
        }

        System.out.println("\n합계: " + sumWins);
        System.out.println("평균: " + avrWins);


        // 2. 문자열 배열 활용
        System.out.println("\n===== 문자열 배열 활용 =====");
        
        // TODO: 5개의 이름을 입력받아 배열에 저장하고, 특정 문자(예: 'A')로 시작하는 이름을 검색하여 출력하세요.

        // 힌트: String 클래스의 startsWith() 또는 charAt() 메소드를 활용하세요.
        String[] fruitsName = new String[5];
        System.out.println("과일 이름을 영어로 입력하세요 :");
        for (int i = 0; i < fruitsName.length; i++)
        {
            System.out.print((i + 1) + "번째 과일: ");
            fruitsName[i] = scanner.next();
        }
        System.out.println("\n'A'로 시작하는 과일 이름을 출력합니다");
        boolean found = false;
        for (String fruit : fruitsName)
        {
            if (fruit.startsWith("A") || fruit.startsWith("a"))
            { // 대소문자 구분 없이 처리
                System.out.println(fruit);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("해당 조건에 맞는 과일 이름이 없습니다.");
        }

        // 3. 배열 정렬
        System.out.println("\n===== 배열 정렬 =====");
        
        // TODO: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 오름차순으로 정렬하여 출력하세요.
        // 힌트: 이중 반복문을 사용하여 버블 정렬 알고리즘을 구현하거나, Arrays.sort()를 활용하세요.
       //이중반복문
        int[]  sortNum = new int[5];
        //입력 레스기릿
        System.out.println("숫자 5개를 입력하세요");
        for (int i = 0; i < sortNum.length; i++)
        {
            System.out.print((i + 1) + "번째 정수 : ");
            sortNum[i] = scanner.nextInt();
        }
        //버블 정렬 : 오름차순
        for (int i = 0; i < sortNum.length-1; i++)
        {
            for (int j = 0; j < sortNum.length-1-i; j++)
            {
                if(sortNum[j] > sortNum[j+1])
                {
                    int temp = sortNum[j];
                    sortNum[j] = sortNum[j+1];
                    sortNum[j+1] = temp;
                }
            }
        }
        //출력
        System.out.println("\n오름차순 정렬 결과.");
        for(int num : sortNum)
        {
            System.out.print(num + " ");
        }
        //Array sort 버전
        Scanner scanNum = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("\n숫자 5개를 입력하세요 ");
        for (int i = 0; i < 5; i++) nums[i] = scanNum.nextInt();

        Arrays.sort(nums);  // 정렬

        for (int n : nums) System.out.print(n + " ");

        // 4. 2차원 배열을 이용한 행렬 덧셈
        System.out.println("\n===== 2차원 배열을 이용한 행렬 덧셈 =====");
        
        // TODO: 두 개의 2x3 행렬을 입력받아 행렬 덧셈을 수행하고 결과를 출력하세요.
        // 힌트: 중첩 반복문을 사용하세요.

        Scanner sc = new Scanner(System.in);
        int[][] fristArray = new int[2][3];
        int[][] secondArray = new int[2][3];
        int[][] result = new int[2][3];

        //1번 행렬
        System.out.println("첫 번째 2x3 행렬을 입력하세요:");
        for (int i = 0; i < 2; i++)
        {
            System.out.print((i + 1) + "행 입력: ");
            for (int j = 0; j < 3; j++)
            {
                fristArray[i][j] = sc.nextInt();
            }
        }

        // 두 번째 행렬 입력
        System.out.println("두 번째 2x3 행렬을 입력하세요:");
        for (int i = 0; i < 2; i++)
        {
            System.out.print((i + 1) + "행 입력: ");
            for (int j = 0; j < 3; j++)
            {
                secondArray[i][j] = sc.nextInt();
            }
        }
        //행렬 덧셈
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                result[i][j] = fristArray[i][j] + secondArray[i][j];
            }
        }

        // 결과 출력
        System.out.println("행렬 덧셈 결과:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        // 5. 배열을 이용한 간단한 데이터 분석
        System.out.println("\n===== 배열을 이용한 데이터 분석 =====");
        
        // TODO: 10개의 정수를 입력받아 배열에 저장한 후, 최댓값, 최솟값, 중앙값(또는 평균)을 계산하여 출력하세요.
        // 힌트: 정렬을 활용하면 중앙값을 쉽게 찾을 수 있습니다.
        
        
        scanner.close();
    }
} 