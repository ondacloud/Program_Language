# R 학습 가이드

R 설치 후 각 예제 폴더에서 `Rscript --vanilla main.R`로 실행합니다. 대화형 콘솔에서는 해당 폴더를 작업 폴더로 맞추고 `source("main.R")`를 사용합니다. 추가 CRAN 패키지를 설치하지 않아도 됩니다. 02장은 Rscript에서 동봉 입력 파일을, 콘솔에서는 readline을 사용합니다.

## 목차

| 번호 | 문법·함수 | 내용 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 연산자·대입·자료형 |
| 01 | [print & cat](01.%20print%20%26%20cat/README.md) | print·cat |
| 02 | [readline & scan](02.%20readline%20%26%20scan/README.md) | readline·scan |
| 03 | [if & else](03.%20if%20%26%20else/README.md) | if·else if·else |
| 04 | [switch](04.%20switch/README.md) | switch |
| 05 | [for](05.%20for/README.md) | for·seq_along |
| 06 | [while](06.%20while/README.md) | while |
| 07 | [repeat](07.%20repeat/README.md) | repeat |
| 08 | [break](08.%20break/README.md) | break |
| 09 | [next](09.%20next/README.md) | next |
| 10 | [function & return](10.%20function%20%26%20return/README.md) | function·return·기본 인수 |
| 11 | [c & vector](11.%20c%20%26%20vector/README.md) | c·원자 벡터 |
| 12 | [seq & rep](12.%20seq%20%26%20rep/README.md) | seq·seq_len·rep |
| 13 | [subset & which](13.%20subset%20%26%20which/README.md) | 인덱싱·논리 선택·which |
| 14 | [list](14.%20list/README.md) | list·대괄호·이중 대괄호 |
| 15 | [matrix & array](15.%20matrix%20%26%20array/README.md) | matrix·array·행렬 연산 |
| 16 | [data.frame](16.%20data.frame/README.md) | data.frame·행과 열 선택 |
| 17 | [factor](17.%20factor/README.md) | factor·levels |
| 18 | [is.na & NULL](18.%20is.na%20%26%20NULL/README.md) | NA·NaN·NULL·is.na |
| 19 | [lapply & vapply](19.%20lapply%20%26%20vapply/README.md) | lapply·vapply |
| 20 | [read.csv & write.csv](20.%20read.csv%20%26%20write.csv/README.md) | CSV 읽기·쓰기 |
| 21 | [tryCatch & stop](21.%20tryCatch%20%26%20stop/README.md) | stop·warning·tryCatch·on.exit |
| 22 | [mean & median & sd](22.%20mean%20%26%20median%20%26%20sd/README.md) | 기초 요약 통계 |
| 23 | [aggregate & merge](23.%20aggregate%20%26%20merge/README.md) | 그룹 집계·표 결합 |
| 24 | [plot & pdf](24.%20plot%20%26%20pdf/README.md) | plot·pdf·dev.off |
| 25 | [lm & predict](25.%20lm%20%26%20predict/README.md) | lm·coef·predict |
| 26 | [set.seed & sample](26.%20set.seed%20%26%20sample/README.md) | set.seed·sample·난수 재현 |
| 27 | [stopifnot & all.equal](27.%20stopifnot%20%26%20all.equal/README.md) | stopifnot·all.equal·sessionInfo |

## 학습 방법

값을 바꾸기 전에 결과를 예측하고 정상·빈 입력·경계값·잘못된 입력을 확인하세요. 먼저 번호순으로 문법을 익힌 뒤 아래 종합 실습으로 연결합니다.

[종합 실습](PRACTICE.md)

## 공식 참고 자료

- [R 설치](https://cran.r-project.org/)
- [R 매뉴얼 모음](https://cran.r-project.org/manuals.html)
- [R Introduction](https://stat.ethz.ch/R-manual/R-devel/doc/manual/R-intro.html)

[전체 목차](../../README.md)
