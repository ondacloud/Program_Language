import { useState } from "react";
export default function App() {
  const [form, setForm] = useState({ quantity: "2" });
  const amount = Number(form.quantity);
  const valid = form.quantity.trim() !== "" && Number.isInteger(amount) && amount >= 0;
  return <main><h1>수량 입력</h1>
    <label>수량 <input value={form.quantity} onChange={event => setForm({ ...form, quantity: event.target.value })} /></label>
    <p id="result">{valid ? `${amount * 1000}원` : "수량을 확인하세요"}</p>
  </main>;
}
