# NA·NaN·NULL·is.na

## 핵심 개념

결측값과 값의 부재를 구별합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
values <- c(1, NA_real_, 3)
cat(is.na(values), "\n")
cat(mean(values, na.rm = TRUE), "\n")
cat(length(NULL), is.na(NaN), is.nan(NA_real_), "\n")
```

## 예상 결과

```text
FALSE TRUE FALSE 
2 
0 TRUE FALSE 
```

## 동작 원리와 주의사항

NA와 비교한 결과는 보통 NA이므로 == NA 대신 is.na를 사용합니다. NULL은 길이 0인 부재이며 NA 원소와 다릅니다. 모든 값을 제거한 집계가 어떤 결과를 내는지도 확인해야 합니다.



## 직접 확인하기

모두 NA인 벡터에서 mean과 sum의 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../17.%20factor/README.md) · [다음](../19.%20lapply%20%26%20vapply/README.md)
