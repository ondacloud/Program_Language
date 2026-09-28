export default function App() {
  const price = 1000;
  const quantity = 3;
  const discount = quantity >= 3 ? 500 : 0;
  const total = price * quantity - discount;
  return <main><h1>가격 계산</h1><p id="result">합계: {total}원</p></main>;
}
