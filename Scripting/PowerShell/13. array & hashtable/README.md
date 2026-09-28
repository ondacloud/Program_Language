# 배열과 해시 테이블

## 핵심 개념

배열은 순서 있는 값 목록, 해시 테이블은 키·값 저장소입니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$names = @('Alice', 'Bob')
$scores = @{ Alice = 90; Bob = 80 }
$names.Count
$names[0]
$scores['Bob']
$scores.ContainsKey('Chris')
```

## 예상 결과

```text
2
Alice
80
False
```

## 동작 원리와 주의사항

@(...)는 결과가 0개·1개여도 배열 형태를 유지하는 데 유용합니다. 해시 테이블 순서는 보장하지 않으며 순서가 필요하면 [ordered]@{}를 씁니다. 배열 += 반복은 새 배열 복사 비용이 생길 수 있어 큰 목록은 List[T]를 검토하세요.

## 직접 확인하기

빈 배열, 원소 하나의 배열에서 Count가 각각 0과 1인지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20return%20%26%20TryParse/README.md) · [다음](../14.%20variable%20%26%20type/README.md)
