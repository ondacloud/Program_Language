# 함수·메서드·문법 빠른 찾기

이 폴더는 내장 함수, 메서드, 연산자와 선언 문법을 함께 찾아보는 참고 자료입니다. 모두가 함수인 것은 아닙니다. 각 항목에서 반환값, 원본 변경, 빈 입력과 오류 조건을 확인하세요.

| 항목 | 용도 |
|---|---|
| [f-string](00.%20f-string/README.md) | 표현식을 문자열에 삽입합니다. |
| [input](01.%20input/README.md) | 한 줄을 읽어 끝의 줄바꿈을 뺀 str을 반환합니다. |
| [str.split](02.%20split/README.md) | 구분자로 문자열을 나누어 새 list[str]을 반환합니다. |
| [map](03.%20map/README.md) | 함수를 각 원소에 지연 적용하는 iterator를 반환합니다. |
| [range](04.%20range/README.md) | 정수 범위를 간결하게 표현하는 불변 시퀀스입니다. |
| [len](05.%20len/README.md) | 길이를 지원하는 객체의 원소 수를 반환합니다. |
| [del](06.%20del/README.md) | 이름 바인딩이나 컬렉션 항목을 제거하는 문입니다. |
| [set.add](07.%20add/README.md) | 집합에 hashable 원소 하나를 추가합니다. |
| [remove](08.%20remove/README.md) | list는 첫 일치 원소, set은 지정 원소를 제거합니다. |
| [pop](09.%20pop/README.md) | 원소를 제거하고 그 원소의 값을 반환합니다. |
| [clear](10.%20clear/README.md) | 변경 가능한 컬렉션의 모든 항목을 제거합니다. |
| [얕은 복사 — copy](11.%20copy/README.md) | 바깥 컨테이너만 새로 만들고 내부 원소의 참조를 복사합니다. |
| [list.append](12.%20append/README.md) | 리스트 끝에 객체 하나를 추가합니다. |
| [list.extend](13.%20extend/README.md) | iterable의 원소를 하나씩 리스트 끝에 추가합니다. |
| [list.insert](14.%20insert/README.md) | 지정 인덱스 앞에 원소 하나를 삽입합니다. |
| [index](15.%20index/README.md) | 처음 일치하는 원소나 부분 문자열의 인덱스를 반환합니다. |
| [str.rindex](16.%20rindex/README.md) | 부분 문자열의 가장 오른쪽 시작 인덱스를 반환합니다. |
| [list.reverse](17.%20reverse/README.md) | 리스트 자체의 원소 순서를 뒤집습니다. |
| [count](18.%20count/README.md) | 일치하는 항목 또는 겹치지 않는 부분 문자열의 개수를 셉니다. |
| [min](19.%20min/README.md) | 가장 작은 원소를 반환합니다. |
| [max](20.%20max/README.md) | 가장 큰 원소를 반환합니다. |
| [sum](21.%20sum/README.md) | 수치 iterable을 누적해 합계를 반환합니다. |
| [str.replace](22.%20replace/README.md) | 부분 문자열을 치환한 새 문자열을 반환합니다. |
| [list.sort와 sorted](23.%20sort/README.md) | sort는 원본 리스트를, sorted는 새 리스트를 정렬합니다. |
| [str.join](24.%20join/README.md) | 문자열 iterable을 구분자로 연결합니다. |
| [str.zfill](25.%20zfill/README.md) | 최소 너비까지 왼쪽을 0으로 채웁니다. |
| [str.find](26.%20find/README.md) | 첫 부분 문자열 위치를 찾고 없으면 -1을 반환합니다. |
| [str.rfind](27.%20rfind/README.md) | 가장 오른쪽 부분 문자열 위치를 찾고 없으면 -1을 반환합니다. |
| [in — 포함 검사](28.%20in/README.md) | 컬렉션에 값이 포함되는지 판단하는 연산자입니다. |
| [filter](29.%20filter/README.md) | 조건을 만족하는 원소만 꺼내는 iterator를 반환합니다. |
| [dict.setdefault](30.%20setdefault/README.md) | 키가 없을 때만 기본값을 넣고 해당 키의 값을 반환합니다. |
| [dict.items](31.%20items/README.md) | 키와 값 쌍을 제공하는 동적 view입니다. |
| [dict.popitem](32.%20popitem/README.md) | 마지막에 삽입한 키·값 쌍을 제거해 튜플로 반환합니다. |
| [dict.update](33.%20update/README.md) | 다른 매핑이나 키·값 쌍으로 원본을 갱신합니다. |
| [dict.get](34.%20get/README.md) | 키의 값을 읽고 없으면 기본값을 반환합니다. |
| [dict.keys](35.%20keys/README.md) | 키를 제공하는 동적 view를 반환합니다. |
| [dict.values](36.%20values/README.md) | 값을 제공하는 동적 view를 반환합니다. |
| [str.format](37.%20format/README.md) | 자리 표시자를 치환한 문자열을 만듭니다. |
| [str.ljust](38.%20ljust/README.md) | 왼쪽 정렬을 위해 오른쪽에 채움 문자를 붙입니다. |
| [str.rjust](39.%20rjust/README.md) | 오른쪽 정렬을 위해 왼쪽에 채움 문자를 붙입니다. |
| [str.center](40.%20center/README.md) | 가운데 정렬을 위해 양쪽에 채움 문자를 붙입니다. |
| [str.lstrip](41.%20lstrip/README.md) | 왼쪽 끝에서 공백 또는 지정한 문자 집합을 제거합니다. |
| [str.rstrip](42.%20rstrip/README.md) | 오른쪽 끝에서 공백 또는 지정한 문자 집합을 제거합니다. |
| [str.strip](43.%20strip/README.md) | 양쪽 끝의 공백 또는 지정한 문자 집합을 제거합니다. |
| [str.upper](44.%20upper/README.md) | 대문자로 변환한 새 문자열을 반환합니다. |
| [str.lower](45.%20lower/README.md) | 소문자로 변환한 새 문자열을 반환합니다. |
| [str.maketrans](46.%20maketrans/README.md) | 문자별 변환·삭제 규칙을 담은 테이블을 만듭니다. |
| [str.translate](47.%20translate/README.md) | 변환 테이블을 적용한 새 문자열을 만듭니다. |
| [dict.fromkeys](48.%20fromkeys/README.md) | 여러 키에 같은 기본값을 갖는 새 dict를 만듭니다. |

---

[언어 목차](../README.md) · [이전](../14.%20try/README.md) · [다음](../16.%20open%20file/README.md)
