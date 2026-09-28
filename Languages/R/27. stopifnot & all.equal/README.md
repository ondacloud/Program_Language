# stopifnot·all.equal·sessionInfo

## 핵심 개념

계산 결과의 가정과 경계값을 검증합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
add <- function(a, b) a + b
stopifnot(add(2, 3) == 5, add(-1, 1) == 0)
stopifnot(isTRUE(all.equal(0.1 + 0.2, 0.3)))
cat("checks passed\n")
```

## 예상 결과

```text
checks passed
```

## 동작 원리와 주의사항

all.equal은 같으면 TRUE, 다르면 차이 설명을 반환하므로 조건문에서는 isTRUE로 감쌉니다. 부동소수점에 항상 ==를 쓰지 마세요. sessionInfo()로 재현 환경을 기록할 수 있습니다.



## 직접 확인하기

틀린 기대값을 넣어 실패를 확인하고 빈 입력·NA 테스트를 추가하세요.

---

[전체 목차](../README.md) · [이전](../26.%20set.seed%20%26%20sample/README.md)
