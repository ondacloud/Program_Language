export default function App() {
  const loggedIn = false;
  const count = 0;
  return <main><h1>조건부 표시</h1>
    <p id="status">{loggedIn ? "환영합니다" : "로그인이 필요합니다"}</p>
    {count > 0 && <p>알림 {count}개</p>}
  </main>;
}
