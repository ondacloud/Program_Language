# repeat

## 핵심 개념

반복 본문 안에서 종료 시점을 정합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
n <- 0
repeat {
  n <- n + 1
  if (n >= 3) break
}
cat(n, "\n")
```

## 예상 결과

```text
3 
```

## 동작 원리와 주의사항

repeat 자체에는 조건식이 없습니다. break나 함수 return 등으로 빠져나가는 경로가 필요합니다. R에는 C식 do-while 문장이 없습니다.



## 직접 확인하기

종료 조건을 바꾸고 최소 한 번 실행되는 흐름을 설명하세요.

---

[전체 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)
