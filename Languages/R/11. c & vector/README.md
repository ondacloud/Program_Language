# c·원자 벡터

## 핵심 개념

같은 기본 타입의 값을 하나의 벡터로 묶습니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
values <- c(10, 20, 30)
cat(length(values), values[2], "\n")
cat(values + 1, "\n")
cat(typeof(c(1, "a")), "\n")
```

## 예상 결과

```text
3 20 
11 21 31 
character 
```

## 동작 원리와 주의사항

원자 벡터에 여러 타입을 섞으면 공통 타입으로 변환됩니다. c(1,"a")는 문자 벡터입니다. 여러 타입을 그대로 보관하려면 list를 사용하세요.



## 직접 확인하기

logical·integer·double·character를 섞어 typeof를 확인하세요.

---

[전체 목차](../README.md) · [이전](../10.%20function%20%26%20return/README.md) · [다음](../12.%20seq%20%26%20rep/README.md)
