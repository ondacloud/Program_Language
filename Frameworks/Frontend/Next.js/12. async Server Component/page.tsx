async function loadStudents() { return [{ id: 1, name: "Mina" }, { id: 2, name: "Jin" }]; }
export default async function Page() { const students = await loadStudents(); return <ul>{students.map(s => <li key={s.id}>{s.name}</li>)}</ul>; }
