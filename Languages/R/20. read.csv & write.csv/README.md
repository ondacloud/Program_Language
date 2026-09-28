# CSV 읽기·쓰기

## 핵심 개념

표 데이터를 CSV로 읽고 씁니다. 파일 이름과 열 타입을 확인합니다.

## 실행 방법

R 4.1 이상을 설치하고 이 폴더에서 `Rscript --vanilla main.R`로 실행합니다. R 콘솔에서는 작업 폴더를 이 폴더로 맞춘 뒤 `source("main.R")`로 실행할 수 있습니다. 외부 패키지는 필요하지 않습니다.

[실습 파일](main.R)

## 실행 예제

```r
data <- read.csv("sample.csv", stringsAsFactors = FALSE)
cat(sum(data$score), "\n")
path <- tempfile(fileext = ".csv")
write.csv(data, path, row.names = FALSE)
copy <- read.csv(path, stringsAsFactors = FALSE)
cat(identical(data, copy), "\n")
unlink(path)
```

## 예상 결과

```text
170 
TRUE 
```

## 동작 원리와 주의사항

row.names=FALSE로 의도치 않은 인덱스 열 생성을 피합니다. 여기서는 자신이 만든 임시 파일만 삭제합니다. 날짜·선행 0 식별자·결측값은 자동 타입 추론만 믿지 말고 colClasses·na.strings·인코딩을 명시할 필요가 있습니다.

입력 파일: [sample.csv](sample.csv)

## 직접 확인하기

sample.csv에 결측값을 넣고 집계 정책을 정하세요.

---

[전체 목차](../README.md) · [이전](../19.%20lapply%20%26%20vapply/README.md) · [다음](../21.%20tryCatch%20%26%20stop/README.md)
