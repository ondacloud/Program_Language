# 출력 — Write-Output과 문자열 형식

## 핵심 개념

PowerShell의 출력은 텍스트만이 아니라 객체 스트림입니다. 출력할 객체와 화면 표시를 구분합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$name = 'Alice'
Write-Output "Hello $name"
'count={0:D2}' -f 3
$values = @(Write-Output 10 20)
$values.Count
$values -join ','
```

## 예상 결과

```text
Hello Alice
count=03
2
10,20
```

## 동작 원리와 주의사항

Write-Output은 성공 스트림에 객체를 보내며 단순 표현식도 출력될 수 있습니다. Write-Host는 사용자 화면 메시지에 쓰이므로 함수 데이터 반환용과 구별합니다. -f는 복합 서식 연산자입니다. Format-Table 이후에는 원래 데이터 객체가 아니므로 데이터 처리가 끝난 뒤 서식을 적용하세요.



## 직접 확인하기

값을 변수에 저장한 뒤 Get-Member로 타입을 확인하고 문자열 형식과 객체 출력의 차이를 설명하세요.

---

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20Read-Host%20%26%20ReadLine/README.md)
