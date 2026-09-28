# PowerShell 학습 가이드

분류용 상위 폴더 없이 실제 문법·함수 이름을 번호순으로 배치했습니다. 폴더에서 README와 실행 파일을 바로 확인하세요.

## 실행 환경

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 입력 장은 실행 후 값을 입력합니다.

## 목차

| 번호 | 문법·함수 | 설명 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 산술·대입·증감 연산자 |
| 01 | [Write-Output](01.%20Write-Output/README.md) | 출력 — Write-Output과 문자열 형식 |
| 02 | [Read-Host & ReadLine](02.%20Read-Host%20%26%20ReadLine/README.md) | 입력 — Read-Host와 ReadLine |
| 03 | [if & elseif & else](03.%20if%20%26%20elseif%20%26%20else/README.md) | if / elseif / else |
| 04 | [switch](04.%20switch/README.md) | switch |
| 05 | [for](05.%20for/README.md) | for |
| 06 | [foreach](06.%20foreach/README.md) | foreach |
| 07 | [while](07.%20while/README.md) | while |
| 08 | [do & while & until](08.%20do%20%26%20while%20%26%20until/README.md) | do / while / until |
| 09 | [break](09.%20break/README.md) | break |
| 10 | [continue](10.%20continue/README.md) | continue |
| 11 | [function & param](11.%20function%20%26%20param/README.md) | 함수와 매개변수 검증 |
| 12 | [return & TryParse](12.%20return%20%26%20TryParse/README.md) | 타입 변환·함수 출력·배열 |
| 13 | [array & hashtable](13.%20array%20%26%20hashtable/README.md) | 배열과 해시 테이블 |
| 14 | [variable & type](14.%20variable%20%26%20type/README.md) | 변수, 타입, null |
| 15 | [string & format](15.%20string%20%26%20format/README.md) | 문자열, 보간, here-string |
| 16 | [comparison & logical operator](16.%20comparison%20%26%20logical%20operator/README.md) | 비교·논리·비트 연산자 |
| 17 | [contains & like & match](17.%20contains%20%26%20like%20%26%20match/README.md) | 포함·와일드카드·정규식·null |
| 18 | [comparison operator](18.%20comparison%20operator/README.md) | 연산자와 조건문 |
| 19 | [PSCustomObject & Where-Object](19.%20PSCustomObject%20%26%20Where-Object/README.md) | 객체 파이프라인 |
| 20 | [try & catch & throw](20.%20try%20%26%20catch%20%26%20throw/README.md) | 예외와 오류 스트림 |
| 21 | [Get-Content & Set-Content & Join-Path](21.%20Get-Content%20%26%20Set-Content%20%26%20Join-Path/README.md) | 경로와 파일 입출력 |
| 22 | [ConvertFrom-Json & Export-Csv](22.%20ConvertFrom-Json%20%26%20Export-Csv/README.md) | JSON과 CSV 변환 |
| 23 | [LASTEXITCODE & native command](23.%20LASTEXITCODE%20%26%20native%20command/README.md) | 외부 프로그램과 종료 코드 |
| 24 | [Import-Module & scope](24.%20Import-Module%20%26%20scope/README.md) | 모듈, 범위, 재사용 |
| 25 | [ShouldProcess & WhatIf](25.%20ShouldProcess%20%26%20WhatIf/README.md) | WhatIf와 검증 가능한 자동화 |
| 26 | [pwsh & Get-Command](26.%20pwsh%20%26%20Get-Command/README.md) | PowerShell 실행과 도움말 |

## 공식 참고 자료

- [PowerShell 문서](https://learn.microsoft.com/en-us/powershell/)
- [파이프라인](https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_pipelines)
- [따옴표 규칙](https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_quoting_rules)

[전체 과정](../../README.md)
