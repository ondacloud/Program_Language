# 그룹 집계·표 결합

## 핵심 개념

그룹별 값을 계산하고 공통 키로 표를 결합합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
data <- data.frame(team = c("A", "A", "B"), score = c(10, 20, 40))
totals <- aggregate(score ~ team, data = data, FUN = sum)
labels <- data.frame(team = c("A", "B"), label = c("alpha", "beta"))
result <- merge(totals, labels, by = "team", sort = TRUE)
cat(result$label, "\n")
cat(result$score, "\n")
```

## 예상 결과

```text
alpha beta 
30 40 
```

## 동작 원리와 주의사항

merge의 기본은 내부 결합입니다. 키가 중복이면 행 수가 늘어날 수 있습니다. aggregate 수식 인터페이스의 결측 처리와 직접 함수 호출의 결측 처리가 같은지 확인하세요.



## 직접 확인하기

없는 팀·중복 팀을 넣고 all.x=TRUE의 결과를 비교하세요.

---

[전체 목차](../README.md) · [이전](../22.%20mean%20%26%20median%20%26%20sd/README.md) · [다음](../24.%20plot%20%26%20pdf/README.md)
