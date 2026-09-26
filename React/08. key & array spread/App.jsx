import { useState } from "react";

export default function App() {
  const [items, setItems] = useState([
    { id: 1, text: "HTML", done: false },
    { id: 2, text: "React", done: false }
  ]);
  function toggle(id) {
    setItems(previous => previous.map(item => item.id === id ? { ...item, done: !item.done } : item));
  }
  return <ul>{items.map(item => <li key={item.id}>
    <label><input type="checkbox" checked={item.done} onChange={() => toggle(item.id)} />{item.text}</label>
    <span>{item.done ? "완료" : "대기"}</span>
  </li>)}</ul>;
}
