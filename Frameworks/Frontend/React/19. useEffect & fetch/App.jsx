import { useEffect, useState } from "react";

function loadUser(id) {
  return new Promise(resolve => setTimeout(() => resolve({ name: id === "1" ? "Alice" : "Bob" }), 50));
}

export default function App() {
  const [id, setId] = useState("1");
  const [result, setResult] = useState({ status: "loading", name: "" });
  useEffect(() => {
    let ignore = false;
    setResult({ status: "loading", name: "" });
    loadUser(id).then(user => {
      if (!ignore) setResult({ status: "success", name: user.name });
    }).catch(() => {
      if (!ignore) setResult({ status: "error", name: "" });
    });
    return () => { ignore = true; };
  }, [id]);
  return <main>
    <label>사용자<select value={id} onChange={event => setId(event.target.value)}><option value="1">1</option><option value="2">2</option></select></label>
    <p role="status">{result.status === "success" ? result.name : result.status}</p>
  </main>;
}
