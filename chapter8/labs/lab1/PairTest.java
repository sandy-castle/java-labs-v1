package chapter8.labs.lab1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lab 1: 제네릭 클래스 구현 테스트
 *
 * Pair 클래스와 PairUtils 클래스의 기능을 테스트합니다.
 */
public class PairTest {
    public static void main(String[] args) {
        System.out.println("=== Pair 클래스 테스트 ===");

        // Integer와 String 타입의 Pair
        Pair<Integer, String> intStrPair = new Pair<>(1, "하나");
        System.out.println("Integer-String Pair: " + intStrPair);

        // Double과 Double 타입의 Pair
        Pair<Double, Double> doublePair = new Pair<>(3.14, 2.71);
        System.out.println("Double-Double Pair: " + doublePair);

        // 사용자 정의 클래스를 사용한 Pair
        class Point {
            int x, y;
            Point(int x, int y) { this.x = x; this.y = y; }
            @Override
            public String toString() { return "(" + x + "," + y + ")"; }
        }
        Pair<String, Point> customPair = new Pair<>("origin", new Point(0, 0));
        System.out.println("Custom Pair: " + customPair);

        System.out.println("\n=== PairUtils 클래스 테스트 ===");

        // of 메소드 테스트
        Pair<String, Integer> ofPair = PairUtils.makePair("사과", 10);
        System.out.println("makePair: " + ofPair);

        // swap 메소드 테스트
        Pair<Integer, String> swapped = PairUtils.swap(ofPair);
        System.out.println("swap: " + swapped);

        // 숫자 타입의 sum 메소드 테스트
        Pair<Number, Number> numberPair = new Pair<>(100, 45.6);
        double sum = PairUtils.sum(numberPair);
        System.out.println("sum: " + sum);

        // 타입 제한 테스트 (Number 하위 클래스만 가능)
        Pair<Integer, Double> intDoublePair = new Pair<>(10, 3.5);
        System.out.println("sum (int + double): " + PairUtils.sum(intDoublePair));

        // 와일드카드 메소드 테스트
        Pair<String, Double> pricePair = new Pair<>("커피", 4.5);
        System.out.print("printPair: ");
        PairUtils.printPair(pricePair);

        // findMatchingPair 테스트
        List<String> words = Arrays.asList("ant", "banana", "apple", "avocado", "berry");
        Predicate<String> startsWithA = s -> s.startsWith("a");
        Pair<String, String> matchingPair = PairUtils.findMatchingPair(words, startsWithA);
        System.out.println("findMatchingPair: " + matchingPair);

        // compare 메소드 테스트
        Pair<String, Integer> p1 = new Pair<>("key", 100);
        Pair<String, Integer> p2 = new Pair<>("key", 100);
        System.out.println("compare: " + PairUtils.compare(p1, p2)); // true
    }
}
