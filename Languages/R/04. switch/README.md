# switch

## 핵심 개념

문자열 이름에 대응하는 표현식을 선택합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
command <- "save"
result <- switch(command,
  open = "opened",
  save = "saved",
  "unknown"
)
cat(result, "\n")
```

## 예상 결과

```text
saved 
```

## 동작 원리와 주의사항

문자열 선택은 이름을, 숫자 선택은 위치를 사용하므로 입력 타입을 명확히 하세요. 마지막 이름 없는 항목을 기본값으로 사용할 수 있습니다. switch는 벡터 전체에 적용하는 분기 함수가 아닙니다.



## 직접 확인하기

command를 open과 없는 이름으로 바꾸세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20else/README.md) · [다음](../05.%20for/README.md)
