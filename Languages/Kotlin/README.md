# Kotlin

실제 문법·함수·파일 규칙 이름을 번호순으로 배치했습니다. 기초 연산 → 출력 → 입력 → 조건 → 반복 → 함수·자료구조 → 해당 기술의 주요 기능 순서로 학습합니다. 프레임워크에서는 언어 문법과 UI·라우팅 API의 역할을 구분합니다.

## 준비와 실행

학습 기준: Kotlin/JVM 2.2 이상, JDK 17 이상, Python 3.10 이상. [Kotlin CLI 설치](https://kotlinlang.org/docs/command-line.html) 후 `kotlinc`를 PATH에 추가하세요. Windows에서는 `kotlinc.bat`도 실행기가 찾습니다.

```powershell
java -version
kotlinc -version
python run.py "00. operator/Main.kt"
```

실행기는 한 파일씩 임시 디렉터리에 JAR로 컴파일하고 실행합니다. Android UI·Gradle·코루틴 라이브러리는 이 JVM 기초 과정과 별도입니다.

## 구문별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [println & print](01.%20println%20%26%20print/README.md) |
| 02 | [readlnOrNull & toIntOrNull](02.%20readlnOrNull%20%26%20toIntOrNull/README.md) |
| 03 | [if & else](03.%20if%20%26%20else/README.md) |
| 04 | [when](04.%20when/README.md) |
| 05 | [for & in](05.%20for%20%26%20in/README.md) |
| 06 | [while & do while](06.%20while%20%26%20do%20while/README.md) |
| 07 | [break & continue](07.%20break%20%26%20continue/README.md) |
| 08 | [val & var](08.%20val%20%26%20var/README.md) |
| 09 | [fun & return](09.%20fun%20%26%20return/README.md) |
| 10 | [listOf & mutableListOf](10.%20listOf%20%26%20mutableListOf/README.md) |
| 11 | [mapOf & setOf](11.%20mapOf%20%26%20setOf/README.md) |
| 12 | [map & filter & fold](12.%20map%20%26%20filter%20%26%20fold/README.md) |
| 13 | [null safety & Elvis](13.%20null%20safety%20%26%20Elvis/README.md) |
| 14 | [is & smart cast](14.%20is%20%26%20smart%20cast/README.md) |
| 15 | [data class & copy](15.%20data%20class%20%26%20copy/README.md) |
| 16 | [class & init](16.%20class%20%26%20init/README.md) |
| 17 | [interface & override](17.%20interface%20%26%20override/README.md) |
| 18 | [sealed interface & when](18.%20sealed%20interface%20%26%20when/README.md) |
| 19 | [try & catch & finally](19.%20try%20%26%20catch%20%26%20finally/README.md) |
| 20 | [let & apply & also](20.%20let%20%26%20apply%20%26%20also/README.md) |
| 21 | [generic & extension](21.%20generic%20%26%20extension/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 70점 이상만 표시하는 성적 목록을 만들어 보세요. 빈 이름·숫자가 아닌 값·경계값 70을 확인하고, 각 항목 삭제와 합계 계산을 추가하세요. UI 과정에서는 목록 항목의 안정된 key와 상태 소유 위치도 설명하세요.

[공식 문서](https://kotlinlang.org/docs/home.html) · [전체 목차](../../README.md)
