import { greet } from "./actions";
export default function Page() { return <form action={greet}><label>Name <input name="name" required maxLength={30} /></label><button>Greet on server</button><p>결과는 검색 예제의 Query에 표시됩니다.</p></form>; }
