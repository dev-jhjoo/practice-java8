# Practice-java8
> Java 8은 많은 기능 개선과 새로운 기능을 포함한 주요 업데이트입니다.    
> 이에대한 설명과 예제 코드를 정리해보려 합니다.

<br><br><br>
### 1. 람다 표현식 (Lambda Expressions)

---

람다 표현식은 익명 함수를 생성하기 위한 간단한 문법을 제공합니다. 함수형 인터페이스를 구현하는 객체를 생성하지 않고도 코드 블록을 전달할 수 있습니다.
``` java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// 람다 표현식을 사용하여 리스트의 각 요소를 출력
numbers.forEach(n -> System.out.println(n));

// 람다 표현식을 사용하여 짝수만 출력
numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

<br><br><br>
### 2. 함수형 인터페이스 (Functional Interfaces)

---

함수형 인터페이스는 람다 표현식과 함께 사용하기 위해 설계된 인터페이스입니다. 이를 통해 람다 표현식을 통해 전달된 코드 블록을 특정 인터페이스의 메서드로 쉽게 구현할 수 있습니다.
``` java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println(addition.calculate(5, 3)); // 출력: 8
        
        Calculator subtraction = (a, b) -> a - b;
        System.out.println(subtraction.calculate(5, 3)); // 출력: 2
    }
}
```

<br><br><br>
### 3. 스트림 (Streams)

---

스트림은 데이터 처리를 위한 새로운 추상화 계층입니다. 컬렉션, 배열 등의 데이터 소스를 처리하고 다양한 연산을 수행할 수 있습니다.
``` java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// 스트림을 사용하여 각 요소를 제곱한 후 필터링하여 출력
numbers.stream()
       .map(n -> n * n)
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

<br><br><br>
### 4. 날짜와 시간 API (Date and Time API)

---

Java 8에서는 java.time 패키지를 통해 날짜와 시간을 다루기 위한 새로운 API를 제공합니다.
``` java
// 현재 날짜와 시간 가져오기
LocalDateTime now = LocalDateTime.now();
System.out.println(now); // 출력: 2023-06-19T15:30:45.123

// 날짜 포맷 지정하여 출력
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = now.format(formatter);
System.out.println(formattedDateTime); // 출력: 2023-06-19 15:30:45
```

<br><br><br>
### 5. 기본 메서드 (Default Methods)

---

인터페이스에 기본적으로 구현된 메서드를 추가할 수 있게 되었습니다. 이를 통해 인터페이스를 구현하는 클래스들이 새로운 메서드를 구현하지 않아도 됩니다.
``` java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle started.");
    }
}

class Car implements Vehicle {
    // 기본 메서드를 오버라이드하지 않아도 됨
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // 출력: Vehicle started.
    }
}
```


<br><br><br>
### 6. Optional 클래스

---

Optional 클래스는 null 값을 다루는데 유용한 기능을 제공합니다. null을 포함할 수 있는 값을 감싸고, null 체크와 관련된 코드를 간단하게 작성할 수 있습니다.
``` java
Optional<String> optionalValue = Optional.of("Hello");

// 값이 존재하는지 확인하고 출력
optionalValue.ifPresent(System.out::println); // 출력: Hello

// 값이 존재하지 않을 때 기본값 출력
String value = optionalValue.orElse("Default Value");
System.out.println(value); // 출력: Hello

// 값이 존재하지 않을 때 예외 발생
String result = optionalValue.orElseThrow(IllegalStateException::new);
```