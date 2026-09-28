"use client";
import { useState } from "react";
export default function Page() { const [name, setName] = useState(""); return <><label>Name <input value={name} onChange={e => setName(e.target.value)} /></label><p>Hello, {name.trim() || "guest"}</p></>; }
