# foreach

## 핵심 개념

컬렉션의 요소를 순서대로 변수에 넣어 반복합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
foreach ($name in @('Alice', 'Bob')) {
  "Hello $name"
}
```

## 예상 결과

```text
Hello Alice
Hello Bob
```

## 동작 원리와 주의사항

foreach 문과 파이프라인의 ForEach-Object 명령은 사용 형태가 다릅니다. 빈 배열이면 본문이 실행되지 않습니다.



## 직접 확인하기

빈 배열과 요소 한 개의 배열을 시험하세요.

---

[전체 목차](../README.md) · [이전](../05.%20for/README.md) · [다음](../07.%20while/README.md)
