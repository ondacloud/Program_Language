import { useState } from "react";

export default function App() {
  const [name, setName] = useState("");
  const [message, setMessage] = useState("");
  function handleSubmit(event) {
    event.preventDefault();
    setMessage(name.trim() ? `Hello ${name.trim()}` : "이름을 입력하세요");
  }
  return <form onSubmit={handleSubmit}>
    <label htmlFor="name">이름</label>
    <input id="name" value={name} onChange={event => setName(event.target.value)} />
    <button type="submit">확인</button><p role="status">{message}</p>
  </form>;
}
