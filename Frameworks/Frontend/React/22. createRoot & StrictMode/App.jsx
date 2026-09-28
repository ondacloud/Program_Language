function LessonCard({ title, description }) {
  return <article><h2>{title}</h2><p>{description}</p></article>;
}
export default function App() {
  return <main><h1>학습 대시보드</h1>
    <LessonCard title="기초" description="컴포넌트와 상태" />
    <LessonCard title="확장" description="라우팅과 데이터 로딩" />
  </main>;
}
