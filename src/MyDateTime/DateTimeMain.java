package MyDateTime;

import java.time.*;


/**
 * Java 8에서는 날짜와 시간을 다루기 위한 새로운 API인 java.time 패키지가 도입되었습니다.
 * 이 API는 이전에 사용되던 java.util.Date 및 java.util.Calendar보다
 * 훨씬 향상된 기능과 사용이 간편한 인터페이스를 제공합니다.
 * 이전 버전에 비해 훨씬 직관적이고 사용하기 편리한 방식으로 날짜와 시간을 다룰 수 있습니다.
 * LocalDate, LocalTime, LocalDateTime을 사용하여 날짜와 시간을 생성하고,
 * Period와 Duration을 사용하여 날짜 및 시간 간의 차이를 계산할 수 있습니다.
 * 이를 통해 날짜 및 시간 관련 작업을 더욱 쉽게 처리할 수 있습니다.
 * 아래 예제 코드와 함께 Java 8의 날짜와 시간 API에 대해 자세히 알아보겠습니다.
 */
public class DateTimeMain {

    public void run(){
        System.out.println("DateTimeMain start");
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 출력: 2023-06-19

        // 특정 날짜 생성
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        System.out.println(birthDate); // 출력: 1990-05-15

        // 현재 시간 가져오기
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 출력: 15:30:45.123

        // 특정 시간 생성
        LocalTime targetTime = LocalTime.of(10, 30, 0);
        System.out.println(targetTime); // 출력: 10:30:00

        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 출력: 2023-06-19T15:30:45.123

        // 특정 날짜와 시간 생성
        LocalDateTime targetDateTime = LocalDateTime.of(1990, 5, 15, 10, 30, 0);
        System.out.println(targetDateTime); // 출력: 1990-05-15T10:30:00

        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 12, 31);

        // 두 날짜 사이의 기간 계산
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getMonths() + "개월 " + period.getDays() + "일"); // 출력: 11개월 30일

        // 시간 간격 계산
        Duration duration = Duration.between(LocalTime.of(10, 0), LocalTime.of(12, 30));
        System.out.println(duration.getSeconds() + "초"); // 출력: 9000초

    }
}
