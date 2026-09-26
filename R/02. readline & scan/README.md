# readline·scan

## 핵심 개념

대화형 한 줄 입력과 파일·연결에서 값을 읽는 입력을 구별합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
if (interactive()) {
  name <- readline("Name: ")
} else {
  name <- scan("input.txt", what = character(), nmax = 1, quiet = TRUE)
}
if (length(name) != 1L || !nzchar(name)) stop("name required")
cat("Hello", name, "\n")
values <- scan(text = "10 20 30", quiet = TRUE)
cat(sum(values), "\n")
```

## 예상 결과

```text
Hello Alice 
60 
```

## 동작 원리와 주의사항

Rscript는 비대화형이므로 이 예제는 input.txt에서 이름을 읽습니다. R 콘솔의 source 실행에서는 readline 프롬프트에 Alice를 입력합니다. readline은 문자열을 반환하므로 숫자 입력은 변환·NA 검사가 필요합니다. scan은 기본적으로 숫자를 읽으며 문자열에는 what을 지정합니다.

배치 실행에 사용하는 [input.txt](input.txt)를 함께 제공합니다. interactive 분기는 실제 R 콘솔에서 확인하세요.

## 직접 확인하기

input.txt를 빈 파일로 바꾸고 오류를 확인하세요. 숫자가 아닌 토큰을 scan에 넣어 보세요.

---

[전체 목차](../README.md) · [이전](../01.%20print%20%26%20cat/README.md) · [다음](../03.%20if%20%26%20else/README.md)
