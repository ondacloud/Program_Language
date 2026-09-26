# 패키지와 import

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
Package는 클래스 이름 충돌을 방지하고 코드를 논리적으로 묶습니다.

```java
package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
    }
}
```

일반적으로 package 이름은 역도메인 형태(`com.example.project`)를 사용합니다. `java.lang`은 자동 import됩니다.

## 동작 원리와 주의사항

예제는 com/example/app/Main.java 경로로 저장하고 javac -d out com/example/app/Main.java, java -cp out com.example.app.Main으로 실행합니다. import는 코드를 복사하는 지시가 아니라 타입 이름을 간단히 쓰도록 하는 선언입니다. 와일드카드 import는 하위 패키지를 포함하지 않습니다.

## 직접 확인하기

클래스 이름이 같은 두 타입은 하나를 완전한 패키지 이름으로 적어 구분하세요.

---

[언어 목차](../README.md) · [이전](../21.%20static%20final/README.md) · [다음](../23.%20enum/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[Main.java](Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . com.example.app.Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
