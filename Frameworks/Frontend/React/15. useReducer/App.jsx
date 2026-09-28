import { useReducer } from "react";

function reducer(state, action) {
  switch (action.type) {
    case "increment": return { count: state.count + 1 };
    case "reset": return { count: 0 };
    default: throw new Error("Unknown action");
  }
}
export default function App() {
  const [state, dispatch] = useReducer(reducer, { count: 0 });
  return <main><p>{state.count}</p>
    <button onClick={() => dispatch({ type: "increment" })}>증가</button>
    <button onClick={() => dispatch({ type: "reset" })}>초기화</button>
  </main>;
}
