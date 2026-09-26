# 문자열, 보간, here-string

## 핵심 개념

작은따옴표 문자열은 리터럴이고 큰따옴표 문자열은 변수·부분 표현식을 확장합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$name = 'Alice'
'Hello $name'
"Hello $name"
"length=$($name.Length)"
'value={0:N0}' -f 1000
```

## 예상 결과

```text
Hello $name
Hello Alice
length=5
value=1,000 (구분자는 로캘에 따라 다를 수 있음)
```

## 동작 원리와 주의사항

큰따옴표 안의 속성·계산은 $()로 감쌉니다. 이스케이프 문자는 역슬래시가 아니라 백틱입니다. here-string은 @" 또는 @' 뒤 줄바꿈으로 시작하고 닫는 표식을 별도 줄에 둡니다. 외부 명령 인수는 문자열 한 덩어리보다 인수 배열로 구성하세요.

## 직접 확인하기

"${name}: ready"로 변수명과 콜론을 명확히 구분해 보세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20variable%20%26%20type/README.md) · [다음](../16.%20comparison%20%26%20logical%20operator/README.md)
