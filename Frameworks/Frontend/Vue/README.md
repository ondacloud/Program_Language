# Vue

실제 문법·함수·파일 규칙 이름을 번호순으로 배치했습니다. 기초 연산 → 출력 → 입력 → 조건 → 반복 → 함수·자료구조 → 해당 기술의 주요 기능 순서로 학습합니다. 프레임워크에서는 언어 문법과 UI·라우팅 API의 역할을 구분합니다.

## 준비와 실행

학습 기준: Vue 3.5, Composition API, `<script setup>`, Vite 7, Node.js 22.12 이상. JavaScript·HTML·CSS 기초를 먼저 학습하세요.

```powershell
npm ci
npm run dev
npm run build
```

터미널에 표시된 로컬 주소를 열고 목차에서 장을 고릅니다. 각 `Example.vue`를 공통 실행 프로젝트가 불러옵니다. 장을 바꾸면 예제 상태가 초기화됩니다. `npm run build`는 모든 예제를 함께 검사합니다.

## 구문별 목차

| 번호 | 문법·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [interpolation & v-text](01.%20interpolation%20%26%20v-text/README.md) |
| 02 | [v-model](02.%20v-model/README.md) |
| 03 | [v-if & v-else](03.%20v-if%20%26%20v-else/README.md) |
| 04 | [v-show](04.%20v-show/README.md) |
| 05 | [v-for & key](05.%20v-for%20%26%20key/README.md) |
| 06 | [ref](06.%20ref/README.md) |
| 07 | [reactive](07.%20reactive/README.md) |
| 08 | [computed](08.%20computed/README.md) |
| 09 | [watch](09.%20watch/README.md) |
| 10 | [v-on & event modifiers](10.%20v-on%20%26%20event%20modifiers/README.md) |
| 11 | [v-bind & class & style](11.%20v-bind%20%26%20class%20%26%20style/README.md) |
| 12 | [defineProps](12.%20defineProps/README.md) |
| 13 | [defineEmits](13.%20defineEmits/README.md) |
| 14 | [slot](14.%20slot/README.md) |
| 15 | [onMounted & onUnmounted](15.%20onMounted%20%26%20onUnmounted/README.md) |
| 16 | [template ref & nextTick](16.%20template%20ref%20%26%20nextTick/README.md) |
| 17 | [provide & inject](17.%20provide%20%26%20inject/README.md) |
| 18 | [composable](18.%20composable/README.md) |
| 19 | [Transition](19.%20Transition/README.md) |
| 20 | [RouterLink & RouterView](20.%20RouterLink%20%26%20RouterView/README.md) |

## 종합 연습

학생 이름과 점수를 입력받아 70점 이상만 표시하는 성적 목록을 만들어 보세요. 빈 이름·숫자가 아닌 값·경계값 70을 확인하고, 각 항목 삭제와 합계 계산을 추가하세요. UI 과정에서는 목록 항목의 안정된 key와 상태 소유 위치도 설명하세요.

[공식 문서](https://vuejs.org/guide/introduction.html) · [전체 목차](../../../README.md)
