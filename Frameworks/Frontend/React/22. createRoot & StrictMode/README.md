# 프로젝트 구성과 다음 단계

## 핵심 개념

학습용 단일 컴포넌트에서 시작해 기능·상태 소유권·데이터 경계를 기준으로 파일을 나눕니다.

## 실행 방법

[실습 프로젝트](../playground/README.md)를 준비하고 이 폴더의 `App.jsx`를 프로젝트의 `src/App.jsx`에 복사하세요. 각 장의 App은 독립 예제이며 한 파일에 합치지 않습니다.

[실습 파일](App.jsx)

## 실행 예제

```jsx
function LessonCard({ title, description }) {
  return <article><h2>{title}</h2><p>{description}</p></article>;
}
export default function App() {
  return <main><h1>학습 대시보드</h1>
    <LessonCard title="기초" description="컴포넌트와 상태" />
    <LessonCard title="확장" description="라우팅과 데이터 로딩" />
  </main>;
}
```

## 예상 결과

기초와 확장 카드 두 개가 표시됩니다.

## 동작 원리와 주의사항

학습 앱의 다음 단계에는 라우팅, 로딩·오류 경계, 데이터 캐시, 배포 경로, 테스트가 있습니다. 컴포넌트 함수만으로 URL 라우팅이 자동 생기지는 않습니다. 공개 브라우저 번들에 들어가는 환경 변수는 비밀로 취급할 수 없습니다. 서버 렌더링·Server Components가 필요하면 지원 프레임워크의 구조를 함께 선택하세요.

## 권장 분리 예시

```text
src/
  App.jsx
  components/LessonCard.jsx
  hooks/useLessons.js
  services/lessons.js
  styles.css
```

폴더 이름보다 역할이 중요합니다. API 응답 검증은 services, 재사용 상태 로직은 hooks, 표현은 components 등으로 분리할 수 있습니다. 프레임워크가 정한 라우트·서버 파일 규칙이 있다면 그 규칙을 우선 학습하세요.

## 빌드와 배포 확인

`npm run build`는 배포용 파일을 dist에 생성합니다. `npm run preview`는 로컬 점검용이며 운영 서버를 대신하지 않습니다. SPA 경로 새로고침 처리와 하위 경로 base 설정은 실제 호스팅 환경에서 별도로 확인합니다.

## 직접 확인하기

LessonCard를 별도 파일로 export하고 import로 연결하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20test%20%26%20aria/README.md)
