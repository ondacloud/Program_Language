# seq·seq_len·rep

## 핵심 개념

규칙적인 값의 나열과 반복을 만듭니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
cat(seq(0, 1, by = 0.5), "\n")
cat(rep(c("a", "b"), times = 2), "\n")
cat(rep(c("a", "b"), each = 2), "\n")
cat(length(seq_len(0)), "\n")
```

## 예상 결과

```text
0 0.5 1 
a b a b 
a a b b 
0 
```

## 동작 원리와 주의사항

times는 전체를 반복하고 each는 각 요소를 반복합니다. 1:0은 빈 벡터가 아니므로 길이 기반 순서는 seq_len으로 만드세요.



## 직접 확인하기

times와 each를 함께 지정해 순서를 예측하세요.

---

[전체 목차](../README.md) · [이전](../11.%20c%20%26%20vector/README.md) · [다음](../13.%20subset%20%26%20which/README.md)
