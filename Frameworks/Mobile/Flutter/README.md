# Flutter

실제 문법·함수·파일 규칙 이름을 번호순으로 배치했습니다. 기초 연산 → 출력 → 입력 → 조건 → 반복 → 함수·자료구조 → 해당 기술의 주요 기능 순서로 학습합니다. 프레임워크에서는 언어 문법과 UI·라우팅 API의 역할을 구분합니다.

## 준비와 실행

학습 기준: Dart 3.4 이상을 포함하는 Flutter stable, Python 3.10 이상. Flutter는 Dart를 사용하는 UI 프레임워크입니다. Kotlin 코드를 Flutter 위젯에 직접 넣지 않습니다. 모바일 분류에 배치했으며 예제는 설치가 비교적 간단한 웹 기기로 실행합니다.

[Flutter SDK 설치](https://docs.flutter.dev/install)를 마치고 다음 명령을 실행하세요.

```powershell
flutter --version
flutter doctor
flutter devices
python run.py "00. operator/main.dart"
```

실행기는 `.playground`에 웹 프로젝트를 한 번 만들고 선택한 파일을 `lib/main.dart`로 복사한 뒤 `flutter run -d chrome`을 실행합니다. Chrome 대신 지원되는 기기를 쓰려면 `--device` 옵션을 지정하세요. 예: `--device edge`. `.playground/lib/main.dart`의 수동 수정은 다음 선택 때 덮어써지므로 원본 장 파일을 수정하세요. 실행 중 `q`로 종료한 뒤 다른 장을 선택합니다. Android/iOS는 해당 플랫폼 SDK 설정이 추가로 필요합니다.

## 구문별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [Text & debugPrint](01.%20Text%20%26%20debugPrint/README.md) |
| 02 | [TextField & onChanged](02.%20TextField%20%26%20onChanged/README.md) |
| 03 | [if & else](03.%20if%20%26%20else/README.md) |
| 04 | [switch](04.%20switch/README.md) |
| 05 | [for & collection for](05.%20for%20%26%20collection%20for/README.md) |
| 06 | [while & break & continue](06.%20while%20%26%20break%20%26%20continue/README.md) |
| 07 | [function & return](07.%20function%20%26%20return/README.md) |
| 08 | [final & const & null safety](08.%20final%20%26%20const%20%26%20null%20safety/README.md) |
| 09 | [List & map & where](09.%20List%20%26%20map%20%26%20where/README.md) |
| 10 | [StatelessWidget](10.%20StatelessWidget/README.md) |
| 11 | [StatefulWidget & setState](11.%20StatefulWidget%20%26%20setState/README.md) |
| 12 | [Row & Column & Expanded](12.%20Row%20%26%20Column%20%26%20Expanded/README.md) |
| 13 | [ListView.builder & ValueKey](13.%20ListView.builder%20%26%20ValueKey/README.md) |
| 14 | [Form & TextFormField & validator](14.%20Form%20%26%20TextFormField%20%26%20validator/README.md) |
| 15 | [TextEditingController & dispose](15.%20TextEditingController%20%26%20dispose/README.md) |
| 16 | [Navigator.push & Navigator.pop](16.%20Navigator.push%20%26%20Navigator.pop/README.md) |
| 17 | [Future & async & await](17.%20Future%20%26%20async%20%26%20await/README.md) |
| 18 | [FutureBuilder](18.%20FutureBuilder/README.md) |
| 19 | [Theme & ThemeData](19.%20Theme%20%26%20ThemeData/README.md) |
| 20 | [LayoutBuilder](20.%20LayoutBuilder/README.md) |
| 21 | [AnimatedContainer](21.%20AnimatedContainer/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 70점 이상만 표시하는 성적 목록을 만들어 보세요. 빈 이름·숫자가 아닌 값·경계값 70을 확인하고, 각 항목 삭제와 합계 계산을 추가하세요. UI 과정에서는 목록 항목의 안정된 key와 상태 소유 위치도 설명하세요.

[공식 문서](https://docs.flutter.dev/learn) · [전체 목차](../../../README.md)
