# print·cat

## 핵심 개념

print는 객체 표현을, cat은 값을 연결한 텍스트를 출력합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
print(c(10, 20))
cat("Hello", "R", "\n")
cat(sprintf("value=%.2f", 3.5), "\n")
```

## 예상 결과

```text
[1] 10 20
Hello R 
value=3.50 
```

## 동작 원리와 주의사항

print의 [1]은 첫 원소의 인덱스 표시이며 데이터 자체가 아닙니다. cat은 필요한 줄바꿈을 명시해야 합니다. 함수 반환과 출력은 다르므로 계산 함수를 테스트할 때 값을 반환하도록 작성하세요.



## 직접 확인하기

cat의 sep 인수를 바꾸고 sprintf의 소수 자릿수를 조절하세요.

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20readline%20%26%20scan/README.md)
