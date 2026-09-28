# C# 학습 가이드

연산자 → 출력 → 입력 → 조건문 → 반복문 → 변수·함수 → 컬렉션·타입 → 클래스 → 예외·비동기·파일 순으로 배치했습니다. 폴더명은 실제 문법·함수 이름을 사용합니다.

## 준비와 실행

학습 기준은 **C# 12 / .NET 8 SDK**입니다. .NET Runtime만 설치하면 빌드 도구가 없으므로 SDK를 설치하세요. 각 장은 독립적인 콘솔 프로젝트입니다. ASP.NET Core·Unity 등 프레임워크는 포함하지 않습니다.

다음 명령은 **C# 과정 루트**에서 실행합니다. SDK 실행 파일을 PATH에 추가하세요. Python 검증기는 선택 사항이며 Python 3.10 이상이 필요합니다.

```powershell
dotnet --info
dotnet run --project "00. operator/Example.csproj"
python verify.py
```

[.NET SDK 설치](https://learn.microsoft.com/en-us/dotnet/core/install/). 폴더 이름은 `C#`이고 Markdown 링크에서는 `C%23`으로 표기합니다. 예제는 최상위 문을 사용하므로 명시적인 Program.Main 없이 실행됩니다. 각 프로젝트를 따로 실행하고 여러 Program.cs를 한 프로젝트에 합치지 마세요.

입력 예제는 터미널에서 값을 입력하고 Enter를 누릅니다. 파일 처리 예제는 직접 생성한 임시 디렉터리만 사용한 뒤 정리합니다. `verify.py`는 30개 프로그램을 각각 실행하여 정상 입력의 표준 출력과 예상 결과를 비교합니다. SDK 미설치 시 준비 안내를 표시합니다.

## 문법·함수별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [Console.WriteLine & Console.Write](01.%20Console.WriteLine%20%26%20Console.Write/README.md) |
| 02 | [Console.ReadLine & TryParse](02.%20Console.ReadLine%20%26%20TryParse/README.md) |
| 03 | [if & else](03.%20if%20%26%20else/README.md) |
| 04 | [switch & case](04.%20switch%20%26%20case/README.md) |
| 05 | [for](05.%20for/README.md) |
| 06 | [foreach](06.%20foreach/README.md) |
| 07 | [while](07.%20while/README.md) |
| 08 | [do while](08.%20do%20while/README.md) |
| 09 | [break & continue](09.%20break%20%26%20continue/README.md) |
| 10 | [var & const & readonly](10.%20var%20%26%20const%20%26%20readonly/README.md) |
| 11 | [method & return](11.%20method%20%26%20return/README.md) |
| 12 | [array & Length](12.%20array%20%26%20Length/README.md) |
| 13 | [List & Add & Remove](13.%20List%20%26%20Add%20%26%20Remove/README.md) |
| 14 | [Dictionary & HashSet](14.%20Dictionary%20%26%20HashSet/README.md) |
| 15 | [nullable & null coalescing](15.%20nullable%20%26%20null%20coalescing/README.md) |
| 16 | [class & constructor & property](16.%20class%20%26%20constructor%20%26%20property/README.md) |
| 17 | [virtual & override & base](17.%20virtual%20%26%20override%20%26%20base/README.md) |
| 18 | [interface & class](18.%20interface%20%26%20class/README.md) |
| 19 | [record & with](19.%20record%20%26%20with/README.md) |
| 20 | [enum & switch expression](20.%20enum%20%26%20switch%20expression/README.md) |
| 21 | [generic & where](21.%20generic%20%26%20where/README.md) |
| 22 | [Where & Select & Aggregate](22.%20Where%20%26%20Select%20%26%20Aggregate/README.md) |
| 23 | [Func & Action & event](23.%20Func%20%26%20Action%20%26%20event/README.md) |
| 24 | [try & catch & finally](24.%20try%20%26%20catch%20%26%20finally/README.md) |
| 25 | [using & IDisposable](25.%20using%20%26%20IDisposable/README.md) |
| 26 | [Task & async & await](26.%20Task%20%26%20async%20%26%20await/README.md) |
| 27 | [IAsyncEnumerable & yield return](27.%20IAsyncEnumerable%20%26%20yield%20return/README.md) |
| 28 | [File & Directory](28.%20File%20%26%20Directory/README.md) |
| 29 | [namespace & using](29.%20namespace%20%26%20using/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 목록에 저장하고, 70점 이상 목록·평균·최고 점수를 출력하세요. 빈 이름, 숫자가 아닌 입력, 0·70·100 경계값, 빈 목록을 처리합니다. 클래스 또는 record로 데이터를 표현한 뒤 파일 저장과 비동기 읽기를 추가해 보세요.

[공식 언어 문서](https://learn.microsoft.com/en-us/dotnet/csharp/) · [언어 목차](../README.md) · [전체 목차](../../README.md)
