# for·seq_along

## 핵심 개념

벡터 원소를 차례로 순회합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
values <- c(10, 20, 30)
total <- 0
for (i in seq_along(values)) total <- total + values[i]
cat(total, "\n")
```

## 예상 결과

```text
60 
```

## 동작 원리와 주의사항

R 인덱스는 1부터 시작합니다. 빈 벡터에서 1:length(values)는 빈 순서가 아니므로 seq_along을 사용하세요. 누적 결과를 반복해서 확장하기보다 크기를 미리 할당하거나 벡터 연산을 고려합니다.



## 직접 확인하기

values <- numeric(0)으로 바꾸고 결과를 확인하세요.

---

[전체 목차](../README.md) · [이전](../04.%20switch/README.md) · [다음](../06.%20while/README.md)
