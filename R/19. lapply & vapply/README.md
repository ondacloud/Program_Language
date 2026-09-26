# lapply·vapply

## 핵심 개념

각 요소에 함수를 적용하고 결과 형태를 선택합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
values <- list(1:3, 4:5)
result <- lapply(values, sum)
cat(unlist(result), "\n")
cat(vapply(values, length, integer(1)), "\n")
```

## 예상 결과

```text
6 9 
3 2 
```

## 동작 원리와 주의사항

lapply는 list를 반환합니다. vapply는 기대하는 반환 타입·길이를 검사합니다. sapply는 결과 모양을 자동 단순화하므로 입력에 따라 타입이 바뀔 수 있습니다.



## 직접 확인하기

각 원소 평균을 vapply와 numeric(1)로 계산하세요.

---

[전체 목차](../README.md) · [이전](../18.%20is.na%20%26%20NULL/README.md) · [다음](../20.%20read.csv%20%26%20write.csv/README.md)
