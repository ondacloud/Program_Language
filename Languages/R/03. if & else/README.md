# if·else if·else

## 핵심 개념

길이 1이고 NA가 아닌 논리 조건으로 분기합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
score <- 85
if (score >= 90) {
  cat("A\n")
} else if (score >= 80) {
  cat("B\n")
} else {
  cat("C\n")
}
```

## 예상 결과

```text
B
```

## 동작 원리와 주의사항

else는 앞 닫는 중괄호와 같은 줄에 두면 콘솔 입력에서도 의도대로 해석하기 쉽습니다. if에 여러 요소의 벡터나 NA를 넣지 마세요. 요소별 선택에는 ifelse를 검토하지만 타입 변환에도 주의하세요.



## 직접 확인하기

79·80·90 및 NA 조건을 시험하세요.

---

[전체 목차](../README.md) · [이전](../02.%20readline%20%26%20scan/README.md) · [다음](../04.%20switch/README.md)
