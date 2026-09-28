# stop·warning·tryCatch·on.exit

## 핵심 개념

오류를 발생시키고 호출 경계에서 처리합니다. 자원 정리는 on.exit로 함수 종료에 연결할 수 있습니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
positive <- function(x) {
  if (length(x) != 1L || is.na(x) || x <= 0) stop("positive required")
  x * 2
}
result <- tryCatch(positive(-1), error = function(e) conditionMessage(e))
cat(result, "\n")
cat(positive(3), "\n")
```

## 예상 결과

```text
positive required 
6 
```

## 동작 원리와 주의사항

stop은 오류, warning은 경고를 발생시킵니다. tryCatch로 무조건 삼키기보다 맥락을 남기세요. 연결을 연 함수에서는 on.exit(close(con), add=TRUE) 같은 정리 패턴을 사용할 수 있습니다.



## 직접 확인하기

0·NA·길이 2 입력을 시험하세요.

---

[전체 목차](../README.md) · [이전](../20.%20read.csv%20%26%20write.csv/README.md) · [다음](../22.%20mean%20%26%20median%20%26%20sd/README.md)
