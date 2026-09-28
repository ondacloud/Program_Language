# data.frame·행과 열 선택

## 핵심 개념

열마다 서로 다른 타입을 가질 수 있는 표 형태의 데이터입니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
people <- data.frame(name = c("Kim", "Lee"), age = c(20, 30), stringsAsFactors = FALSE)
cat(people$name, "\n")
cat(people[people$age >= 25, "name"], "\n")
cat(nrow(people), ncol(people), "\n")
```

## 예상 결과

```text
Kim Lee 
Lee 
2 2 
```

## 동작 원리와 주의사항

행 조건과 열 선택을 쉼표로 구분합니다. 열 하나를 선택하면 벡터가 될 수 있어 표를 유지하려면 drop=FALSE를 사용하세요. 새 열을 대입할 때 길이가 맞는지 확인합니다.



## 직접 확인하기

age가 NA일 때 행 선택 결과를 확인하고 !is.na 조건을 추가하세요.

---

[전체 목차](../README.md) · [이전](../15.%20matrix%20%26%20array/README.md) · [다음](../17.%20factor/README.md)
