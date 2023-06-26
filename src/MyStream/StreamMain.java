package MyStream;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 8에서 추가된 스트림(Stream)은 데이터 처리를 위한 새로운 추상화 계층입니다.
 * 스트림은 컬렉션, 배열 등의 데이터 소스를 처리하고 다양한 연산을 수행할 수 있습니다.
 * 이를 통해 데이터 처리를 보다 간결하고 효율적으로 할 수 있습니다.
 * 아래 예제 코드와 함께 스트림에 대해 자세히 알아보겠습니다.
 */
public class StreamMain {

    public void run(){
        System.out.println("StreamMain start");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //////////////////////
        // 중간 연산
        //////////////////////
        // 각 요소를 제곱하여 새로운 스트림 생성
        Stream<Integer> squaredStream = numbers.stream().map(n -> n * n);
        // 짝수만 필터링하여 새로운 스트림 생성
        Stream<Integer> evenStream = numbers.stream().filter(n -> n % 2 == 0);
        // 정렬된 스트림 생성
        Stream<Integer> sortedStream = numbers.stream().sorted();
        // 중복 제거하여 새로운 스트림 생성
        Stream<Integer> distinctStream = numbers.stream().distinct();


        //////////////////////
        // 최종 연산
        //////////////////////
        // `collect` - 스트림 요소를 수집하여 새로운 컬렉션 생성
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubledNumbers); // 출력: [2, 4, 6, 8, 10]

        // `min` / `max` - 최솟값 또는 최댓값 찾기
        List<Integer> minMaxNumbers = Arrays.asList(5, 8, 2, 1, 6);
        Optional<Integer> minNumber = minMaxNumbers.stream().min(Integer::compare);
        System.out.println(minNumber.orElse(0)); // 출력: 1
        Optional<Integer> maxNumber = minMaxNumbers.stream().max(Integer::compare);
        System.out.println(maxNumber.orElse(0)); // 출력: 8

        // `reduce` - 모든 요소를 조합하여 단일 결과 계산
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum); // 출력: 15
        Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
        System.out.println(product.orElse(0)); // 출력: 120

        // `anyMatch` / `allMatch` / `noneMatch` - 요소들 중 조건에 맞는 요소 검사
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven); // 출력: true
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven); // 출력: false
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(noneNegative); // 출력: true

        // `findFirst` / `findAny` - 첫 번째 또는 아무 요소 찾기
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println(firstEven.orElse(0)); // 출력: 2
        Optional<Integer> anyOdd = numbers.stream().filter(n -> n % 2 != 0).findAny();
        System.out.println(anyOdd.orElse(0)); // 출력: 1

    }
}
