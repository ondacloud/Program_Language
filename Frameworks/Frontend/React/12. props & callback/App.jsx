import { useState } from "react";

function Editor({ value, onChange }) {
  return <label>공유 이름<input value={value} onChange={event => onChange(event.target.value)} /></label>;
}

export default function App() {
  const [name, setName] = useState("Alice");
  return <main><Editor value={name} onChange={setName} /><p>Hello {name}</p></main>;
}
