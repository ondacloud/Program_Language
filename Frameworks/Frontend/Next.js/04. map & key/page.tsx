export default function Page() { const students = [{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]; return <ul>{students.map(s => <li key={s.id}>{s.name}</li>)}</ul>; }
