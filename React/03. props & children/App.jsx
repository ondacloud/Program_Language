function Card({ title, children }) {
  return <section><h2>{title}</h2>{children}</section>;
}

function Greeting({ name = "guest" }) {
  return <p>Hello {name}</p>;
}

export default function App() {
  return <Card title="사용자"><Greeting name="Alice" /><Greeting /></Card>;
}
