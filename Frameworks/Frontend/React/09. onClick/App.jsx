import { useState } from "react";

export default function App() {
  const [message, setMessage] = useState("준비");
  function handleClick() { setMessage("클릭 완료"); }
  return <main><button type="button" onClick={handleClick}>실행</button><p role="status">{message}</p></main>;
}
