"use client";
import { usePathname, useRouter } from "next/navigation";
export default function Page() { const router = useRouter(); const path = usePathname(); return <><p>{path}</p><button onClick={() => router.push("/lessons/00")}>Go</button></>; }
