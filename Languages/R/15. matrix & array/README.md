# matrix·array·행렬 연산

## 핵심 개념

행렬은 차원 속성을 가진 같은 타입의 데이터입니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
m <- matrix(1:6, nrow = 2)
cat(m[1, 2], "\n")
cat(rowSums(m), "\n")
cat(dim(m), "\n")
cat(as.vector(matrix(c(1, 2), nrow = 1) %*% matrix(c(3, 4), ncol = 1)), "\n")
```

## 예상 결과

```text
3 
9 12 
2 3 
11 
```

## 동작 원리와 주의사항

기본 채우기 순서는 열 우선이며 byrow=TRUE로 행 우선을 지정합니다. *는 요소별 곱, %*%는 행렬 곱입니다. 한 행·열 선택 시 drop=FALSE를 주면 차원을 유지합니다.



## 직접 확인하기

byrow를 바꾸고 결과를 예측하세요.

---

[전체 목차](../README.md) · [이전](../14.%20list/README.md) · [다음](../16.%20data.frame/README.md)
