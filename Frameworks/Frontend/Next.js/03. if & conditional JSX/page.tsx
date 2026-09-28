export default function Page() { const score = 80; if (score < 0) return <p>invalid</p>; return <p>{score >= 70 ? "pass" : "retry"}</p>; }
