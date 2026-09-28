export default function Page() { const score = 80; return <p>{score + 5} / {score >= 70 ? "pass" : "retry"}</p>; }
