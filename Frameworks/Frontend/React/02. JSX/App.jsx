export default function App() {
  const name = "Alice";
  const active = true;
  return (
    <>
      <h1 className="title">Hello {name}</h1>
      <p style={{ color: "darkgreen" }}>{active ? "활성" : "비활성"}</p>
      <label htmlFor="query">검색</label><input id="query" />
    </>
  );
}
