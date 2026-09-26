import { useMemo, useState } from "react";

const lessons = ["HTML", "CSS", "JavaScript", "React"];
export default function App() {
  const [query, setQuery] = useState("");
  const filtered = useMemo(() => lessons.filter(name => name.toLowerCase().includes(query.toLowerCase())), [query]);
  return <main><label>검색<input value={query} onChange={event => setQuery(event.target.value)} /></label>
    <ul>{filtered.map(name => <li key={name}>{name}</li>)}</ul>
  </main>;
}
