import { useState } from "react";

export default function App() {
  const [accepted, setAccepted] = useState(false);
  return <main>
    <label><input type="checkbox" checked={accepted} onChange={event => setAccepted(event.target.checked)} />약관 동의</label>
    <button disabled={!accepted}>계속</button>
    <p role="status">{accepted ? "진행 가능" : "동의 필요"}</p>
  </main>;
}
