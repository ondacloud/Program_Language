# lm·coef·predict

## 핵심 개념

수식으로 선형 모형을 지정하고 계수와 예측값을 확인합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
data <- data.frame(x = 1:4, y = c(3, 5, 7, 9))
fit <- lm(y ~ x, data = data)
cat(round(unname(coef(fit)), 6), "\n")
cat(round(unname(predict(fit, newdata = data.frame(x = 5))), 6), "\n")
```

## 예상 결과

```text
1 2 
11 
```

## 동작 원리와 주의사항

이 데이터는 설명용으로 정확히 선형입니다. 실제 분석에서는 잔차·가정·불확실성·학습 범위 밖 예측을 검토해야 합니다. 회귀 계수만으로 인과관계를 주장할 수 없습니다.



## 직접 확인하기

y에 작은 변화를 주고 계수와 잔차를 비교하세요.

---

[전체 목차](../README.md) · [이전](../24.%20plot%20%26%20pdf/README.md) · [다음](../26.%20set.seed%20%26%20sample/README.md)
