import { Suspense } from "react";
async function Slow() { await new Promise(resolve => setTimeout(resolve, 500)); return <p>Loaded</p>; }
export default function Page() { return <Suspense fallback={<p>Loading...</p>}><Slow /></Suspense>; }
