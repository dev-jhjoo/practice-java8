package MyOptional;

import java.util.Optional;

/**
 * Java 8에서 추가된 Optional 은 null 값을 대체하고
 * NullPointerException 을 방지하는 데 도움을 주는 클래스입니다.
 * 아래에는 Optional 의 예제 코드를 제공합니다.
 */
public class OptionalMain {
    public void run(){
        System.out.println("OptionalMain start");

        // Optional 을 사용하지 않은 경우
        // null 체크를 수행하여 NullPointerException을 방지합니다.
        // 그러나 코드의 가독성이 떨어지고 null 체크를 위한 조건문이 추가됩니다.
        String str = null;
        if (str != null) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println("문자열이 null입니다.");
        }

        // Optional 을 사용한 경우
        // Optional을 사용하여 null 체크를 간소화합니다.
        // Optional.ofNullable() 메서드를 사용하여 null이 될 수 있는 값을 감싸고,
        // ifPresentOrElse() 메서드를 사용하여 값이 존재하는 경우와 그렇지 않은 경우에 대한 로직을 제공합니다.
        Optional<String> optionalStr = Optional.ofNullable(null);
        optionalStr.ifPresentOrElse(
                s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("문자열이 null입니다.")
        );

    }
}
