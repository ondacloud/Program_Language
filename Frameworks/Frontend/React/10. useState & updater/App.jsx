import { useState } from "react";
export default function App() {
  const [count, setCount] = useState(0);
  function increment() { setCount(value => value + 1); }
  return <main><h1>이벤트 함수</h1><button onClick={increment}>증가</button><p id="result">{count}</p></main>;
}
