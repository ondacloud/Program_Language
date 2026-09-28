# Dart 학습 가이드

연산자 → 출력 → 입력 → 조건문 → 반복문 → 변수·함수 → 컬렉션·타입 → 클래스 → 예외·비동기·파일 순으로 배치했습니다. 폴더명은 실제 문법·함수 이름을 사용합니다.

## 준비와 실행

학습 문법 기준은 **Dart 3.4 이상**입니다. Dart SDK 또는 Flutter에 포함된 Dart SDK가 필요합니다. 콘솔·파일 예제는 VM에서 실행하며 Flutter·브라우저 프로젝트가 필요하지 않습니다.

다음 명령은 **Dart 과정 루트**에서 실행합니다. SDK 실행 파일을 PATH에 추가하세요. Python 검증기는 선택 사항이며 Python 3.10 이상이 필요합니다.

```powershell
dart --version
dart pub get
dart analyze
dart run "00. operator/main.dart"
python verify.py
```

[Dart SDK 설치](https://dart.dev/get-dart). Flutter를 학습할 때는 이 언어 기초를 먼저 익힌 뒤 [Flutter 과정](../../Frameworks/Mobile/Flutter/README.md)으로 이어가세요.

입력 예제는 터미널에서 값을 입력하고 Enter를 누릅니다. 파일 처리 예제는 직접 생성한 임시 디렉터리만 사용한 뒤 정리합니다. `verify.py`는 30개 프로그램을 각각 실행하여 정상 입력의 표준 출력과 예상 결과를 비교합니다. SDK 미설치 시 준비 안내를 표시합니다.

## 문법·함수별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [print](01.%20print/README.md) |
| 02 | [stdin.readLineSync](02.%20stdin.readLineSync/README.md) |
| 03 | [if & else](03.%20if%20%26%20else/README.md) |
| 04 | [switch & case](04.%20switch%20%26%20case/README.md) |
| 05 | [for](05.%20for/README.md) |
| 06 | [for in](06.%20for%20in/README.md) |
| 07 | [while](07.%20while/README.md) |
| 08 | [do while](08.%20do%20while/README.md) |
| 09 | [break & continue](09.%20break%20%26%20continue/README.md) |
| 10 | [var & final & const](10.%20var%20%26%20final%20%26%20const/README.md) |
| 11 | [int.tryParse & double.parse](11.%20int.tryParse%20%26%20double.parse/README.md) |
| 12 | [function & return](12.%20function%20%26%20return/README.md) |
| 13 | [List & add & spread](13.%20List%20%26%20add%20%26%20spread/README.md) |
| 14 | [Map & Set](14.%20Map%20%26%20Set/README.md) |
| 15 | [where & map & fold](15.%20where%20%26%20map%20%26%20fold/README.md) |
| 16 | [null safety & optional access](16.%20null%20safety%20%26%20optional%20access/README.md) |
| 17 | [class & constructor](17.%20class%20%26%20constructor/README.md) |
| 18 | [get & set](18.%20get%20%26%20set/README.md) |
| 19 | [extends & override](19.%20extends%20%26%20override/README.md) |
| 20 | [abstract interface class & implements](20.%20abstract%20interface%20class%20%26%20implements/README.md) |
| 21 | [mixin & with](21.%20mixin%20%26%20with/README.md) |
| 22 | [enum & switch expression](22.%20enum%20%26%20switch%20expression/README.md) |
| 23 | [generic](23.%20generic/README.md) |
| 24 | [records & patterns](24.%20records%20%26%20patterns/README.md) |
| 25 | [try & on & catch & finally](25.%20try%20%26%20on%20%26%20catch%20%26%20finally/README.md) |
| 26 | [Future & async & await](26.%20Future%20%26%20async%20%26%20await/README.md) |
| 27 | [Stream & async for & yield](27.%20Stream%20%26%20async%20for%20%26%20yield/README.md) |
| 28 | [File & Directory](28.%20File%20%26%20Directory/README.md) |
| 29 | [import & export](29.%20import%20%26%20export/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 목록에 저장하고, 70점 이상 목록·평균·최고 점수를 출력하세요. 빈 이름, 숫자가 아닌 입력, 0·70·100 경계값, 빈 목록을 처리합니다. 클래스 또는 record로 데이터를 표현한 뒤 파일 저장과 비동기 읽기를 추가해 보세요.

[공식 언어 문서](https://dart.dev/language) · [언어 목차](../README.md) · [전체 목차](../../README.md)
