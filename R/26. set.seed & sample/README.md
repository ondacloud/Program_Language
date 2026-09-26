# set.seed·sample·난수 재현

## 핵심 개념

난수 시드를 고정하면 같은 환경에서 계산을 재현하기 쉽습니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
set.seed(42)
first <- sample(1:10, 3, replace = FALSE)
set.seed(42)
second <- sample(1:10, 3, replace = FALSE)
cat(identical(first, second), length(unique(first)), "\n")
```

## 예상 결과

```text
TRUE 3 
```

## 동작 원리와 주의사항

난수 알고리즘과 R 버전이 바뀌면 시드만으로 모든 버전의 동일 결과를 보장하지는 못합니다. replace는 복원 추출 여부입니다. 재현에는 코드·데이터·버전·시드를 함께 기록하세요.



## 직접 확인하기

시드를 바꾸고 복원 추출로 중복 가능성을 확인하세요.

---

[전체 목차](../README.md) · [이전](../25.%20lm%20%26%20predict/README.md) · [다음](../27.%20stopifnot%20%26%20all.equal/README.md)
