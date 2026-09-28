# 함수·메서드·문법 빠른 찾기

이 폴더는 내장 함수, 메서드, 연산자와 선언 문법을 함께 찾아보는 참고 자료입니다. 모두가 함수인 것은 아닙니다. 각 항목에서 반환값, 원본 변경, 빈 입력과 오류 조건을 확인하세요.

| 항목 | 용도 |
|---|---|
| [변수 선언](00.%20variable/README.md) | var와 :=는 변수를 선언합니다. |
| [상수와 iota](01.%20const/README.md) | const는 컴파일 시 결정되는 상수를 정의합니다. |
| [fmt.Scan](02.%20scan/README.md) | 공백으로 구분된 입력을 읽습니다. |
| [len](03.%20len/README.md) | 문자열·배열·slice·map·channel 등의 길이를 반환합니다. |
| [cap](04.%20cap/README.md) | 배열·slice의 용량 또는 channel 버퍼 용량을 반환합니다. |
| [make](05.%20make/README.md) | slice, map, channel을 초기화합니다. |
| [new](06.%20new/README.md) | 타입의 zero value를 위한 공간을 만들고 *T를 반환합니다. |
| [append](07.%20append/README.md) | slice 끝에 원소를 추가한 slice를 반환합니다. |
| [copy](08.%20copy/README.md) | slice 원소를 복사하고 복사한 개수를 반환합니다. |
| [delete](09.%20delete/README.md) | map에서 키를 제거합니다. |
| [strings.Split](10.%20strings%20split/README.md) | 구분자로 문자열을 나눠 []string을 반환합니다. |
| [strings.Join](11.%20strings%20join/README.md) | []string을 구분자로 연결합니다. |
| [strings.ReplaceAll](12.%20strings%20replaceall/README.md) | 모든 일치 부분 문자열을 치환한 문자열을 반환합니다. |
| [strings.Contains](13.%20strings%20contains/README.md) | 부분 문자열 포함 여부를 bool로 반환합니다. |
| [strings.Index](14.%20strings%20index/README.md) | 첫 일치 위치를 바이트 인덱스로 반환합니다. |
| [strings.ToUpper](15.%20strings%20toupper/README.md) | Unicode 문자를 대문자로 변환합니다. |
| [strings.ToLower](16.%20strings%20tolower/README.md) | Unicode 문자를 소문자로 변환합니다. |
| [strconv.Atoi](17.%20strconv%20atoi/README.md) | 10진 문자열을 int로 변환합니다. |
| [strconv.Itoa](18.%20strconv%20itoa/README.md) | int를 10진 문자열로 변환합니다. |
| [sort.Ints](19.%20sort%20ints/README.md) | []int를 오름차순으로 제자리 정렬합니다. |
| [sort.Strings](20.%20sort%20strings/README.md) | []string을 사전식 오름차순으로 정렬합니다. |
| [min / max](21.%20min%20max/README.md) | Go 1.21 이상에서 순서 비교 가능한 인수들의 최소·최대값을 구합니다. |

---

[언어 목차](../README.md) · [이전](../14.%20error/README.md) · [다음](../16.%20open%20file/README.md)
