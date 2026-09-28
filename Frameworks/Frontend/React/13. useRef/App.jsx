import { useRef } from "react";

export default function App() {
  const inputRef = useRef(null);
  return <main>
    <label>이름<input ref={inputRef} /></label>
    <button onClick={() => inputRef.current?.focus()}>입력으로 이동</button>
  </main>;
}
