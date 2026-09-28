# next

## 핵심 개념

반복 종료와 다음 반복으로 이동하는 동작을 구별합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
for (n in 1:4) {
  if (n == 3) next
  cat(n, "\n")
}
```

## 예상 결과

```text
1 
2 
4 
```

## 동작 원리와 주의사항

break는 반복을 종료하고 next는 현재 본문의 나머지를 건너뜁니다. R에서는 continue 대신 next를 사용합니다.



## 직접 확인하기

두 키워드를 바꾸어 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../08.%20break/README.md) · [다음](../10.%20function%20%26%20return/README.md)
