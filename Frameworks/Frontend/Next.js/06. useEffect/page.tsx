"use client";
import { useEffect, useState } from "react";
export default function Page() { const [seconds, setSeconds] = useState(0); useEffect(() => { const timer = setInterval(() => setSeconds(n => n + 1), 1000); return () => clearInterval(timer); }, []); return <p>{seconds} seconds</p>; }
