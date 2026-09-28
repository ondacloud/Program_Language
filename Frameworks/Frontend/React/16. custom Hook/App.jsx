import { useState } from "react";

function useToggle(initial = false) {
  const [value, setValue] = useState(initial);
  function toggle() { setValue(previous => !previous); }
  return [value, toggle];
}
function Toggle({ name }) {
  const [enabled, toggle] = useToggle();
  return <button onClick={toggle}>{name}:{enabled ? "on" : "off"}</button>;
}
export default function App() {
  return <main><Toggle name="A" /><Toggle name="B" /></main>;
}
