import { useState } from "react";

function Draft({ user }) {
  const [text, setText] = useState("");
  return <label>{user}의 메모<input value={text} onChange={event => setText(event.target.value)} /></label>;
}
export default function App() {
  const [user, setUser] = useState("Alice");
  return <main>
    <button onClick={() => setUser(value => value === "Alice" ? "Bob" : "Alice")}>사용자 변경</button>
    <Draft key={user} user={user} />
  </main>;
}
