export default function App() {
  const items = [{ id: "a", name: "사과", stock: 2 }, { id: "b", name: "배", stock: 0 }];
  return <main><h1>재고 목록</h1><ul>
    {items.filter(item => item.stock > 0).map(({ id, name, stock }) =>
      <li key={id}>{name}: {stock}</li>)}
  </ul></main>;
}
