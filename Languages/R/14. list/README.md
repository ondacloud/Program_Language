# list·대괄호·이중 대괄호

## 핵심 개념

list는 타입과 길이가 다른 객체를 묶을 수 있습니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
person <- list(name = "Kim", scores = c(80, 90))
cat(person$name, mean(person[["scores"]]), "\n")
cat(is.list(person["name"]), is.character(person[["name"]]), "\n")
```

## 예상 결과

```text
Kim 85 
TRUE TRUE 
```

## 동작 원리와 주의사항

[는 list 일부를 list로 반환하고 [[는 요소 자체를 꺼냅니다. $는 편리한 이름 접근이지만 프로그래밍으로 이름을 전달할 때는 [[name]] 형태가 명확합니다.



## 직접 확인하기

이름을 변수에 저장하고 [[로 접근하세요.

---

[전체 목차](../README.md) · [이전](../13.%20subset%20%26%20which/README.md) · [다음](../15.%20matrix%20%26%20array/README.md)
