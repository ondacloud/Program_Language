# 날짜와 시간

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Java 8+에서는 `java.time` API 사용을 권장합니다.

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

LocalDate today = LocalDate.now();
LocalDateTime now = LocalDateTime.now();
ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
System.out.println(formatted);
```

## 동작 원리와 주의사항

LocalDateTime은 시간대 정보가 없어 단독으로 세계의 한 순간을 확정하지 못합니다. 저장·비교할 순간은 Instant, 지역 표현은 ZonedDateTime을 검토합니다. 날짜 간 간격은 Period, 시간 기반 간격은 Duration을 사용합니다.

## 직접 확인하기

고정 Instant를 Asia/Seoul로 변환하고 LocalDateTime만 저장했을 때 빠지는 정보를 설명하세요.

---

[언어 목차](../README.md) · [이전](../29.%20file%20io/README.md) · [다음](../31.%20lambda%20functional%20interface/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[Main.java](Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
