# React 공통 실습 프로젝트

각 장의 App.jsx를 이 프로젝트의 src/App.jsx에 복사하여 독립적으로 실행합니다. 기본 App은 3씩 증가하는 상태 예제입니다.

## 준비와 실행

Node.js 버전을 `node --version`으로 확인합니다. 고정한 Vite 8.3.0의 요구사항은 Node `^20.19.0 || >=22.12.0`입니다. 이 프로젝트는 React와 React DOM 19.3.0을 사용합니다. 최신 버전 추정 대신 package.json과 lockfile의 고정 버전을 기준으로 재현하세요.

이 폴더에서 실행합니다.

```sh
npm ci
npm run dev
```

터미널에 표시되는 로컬 주소를 브라우저에서 여세요. 종료는 Ctrl+C입니다. 의존성은 npm 레지스트리에서 다운로드되며 node_modules는 저장소에 커밋하지 않습니다. lockfile을 의도적으로 변경할 때는 npm install 후 변경 이유를 검토합니다.

## 예제 교체

기존 src/App.jsx 내용을 선택한 장의 App.jsx 전체로 교체합니다. 각 예제는 필요한 Hook import를 포함합니다. 두 개의 default export를 한 파일에 합치지 마세요. JSX는 브라우저에 원문 그대로 넣는 코드가 아니라 Vite가 변환하는 소스입니다.

## 빌드

```sh
npm run build
npm run preview
```

build는 dist에 파일을 만들고 preview는 결과를 로컬에서 확인합니다. 실습 개발 서버·미리보기 서버는 운영용 서버 구성과 구분합니다. StrictMode의 개발 검사 때문에 Effect 설정·정리가 추가 실행되어도 정리 코드가 올바르게 동작해야 합니다.

[React 목차](../README.md)
