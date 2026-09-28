import { useState } from "react";

export default function App() {
  const [count, setCount] = useState(0);
  function addThree() {
    setCount(value => value + 1);
    setCount(value => value + 1);
    setCount(value => value + 1);
  }
  return <main><p role="status">{count}</p><button onClick={addThree}>3 증가</button></main>;
}
