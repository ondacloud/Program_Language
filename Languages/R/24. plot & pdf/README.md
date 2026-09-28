# plot·pdf·dev.off

## 핵심 개념

그래픽 장치를 열어 그림을 그리고 닫아 파일을 완성합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
path <- tempfile(fileext = ".pdf")
pdf(path)
plot(1:4, c(1, 4, 9, 16), type = "b", xlab = "x", ylab = "x squared")
invisible(dev.off())
cat(file.exists(path), file.info(path)$size > 0, "\n")
unlink(path)
```

## 예상 결과

```text
TRUE TRUE 
```

## 동작 원리와 주의사항

이 예제는 임시 PDF를 만들고 확인 후 삭제합니다. 보관하려면 path에 새 파일 이름을 지정하고 마지막 unlink를 제거하세요. 오류가 날 수 있는 함수에서는 on.exit로 장치 닫기를 보장하는 패턴을 사용합니다. 그래프 의미와 축 범위를 설명하세요.



## 직접 확인하기

점·선 종류를 바꾸어 보고 제목을 추가하세요.

---

[전체 목차](../README.md) · [이전](../23.%20aggregate%20%26%20merge/README.md) · [다음](../25.%20lm%20%26%20predict/README.md)
