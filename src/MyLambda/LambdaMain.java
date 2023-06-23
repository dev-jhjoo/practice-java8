package MyLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain {
    public void run(){
        System.out.println("LambdaMain start");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        // 길이로 문자열 정렬
        Collections.sort(names, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(names); // 출력: [Bob, Dave, Alice, Charlie]
        // 알파벳 역순으로 문자열 정렬
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names); // 출력: [Dave, Charlie, Bob, Alice]


        // 새로운 스레드 생성
        Thread thread = new Thread(() ->
                System.out.println("새로운 스레드에서 동작하는 코드")
        );
        thread.start();


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 각 요소를 제곱하여 새로운 리스트 생성
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers); // 출력: [1, 4, 9, 16, 25]
        // 홀수 요소만 필터링하여 출력
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

    }
}
