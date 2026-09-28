# factor·levels

## 핵심 개념

범주형 값을 정해진 수준과 내부 정수 코드로 표현합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
grade <- factor(c("B", "A", "B"), levels = c("A", "B", "C"))
cat(levels(grade), "\n")
cat(as.character(grade), "\n")
cat(as.integer(grade), "\n")
```

## 예상 결과

```text
A B C 
B A B 
2 1 2 
```

## 동작 원리와 주의사항

factor를 숫자로 바꾸면 표시된 값이 아니라 내부 코드가 나옵니다. 수준에 없는 값을 넣으면 NA가 될 수 있습니다. 순서 범주는 ordered=TRUE로 의도를 명시합니다.



## 직접 확인하기

숫자처럼 보이는 범주의 as.numeric 결과를 비교하세요.

---

[전체 목차](../README.md) · [이전](../16.%20data.frame/README.md) · [다음](../18.%20is.na%20%26%20NULL/README.md)
