"use client";
import { useState } from "react";
export default function Page() { const [failed, setFailed] = useState(false); if (failed) throw new Error("Practice render error"); return <button onClick={() => setFailed(true)}>Trigger render error</button>; }
