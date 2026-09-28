"use server";
import { redirect } from "next/navigation";
export async function greet(data: FormData): Promise<void> { const raw = data.get("name"); const name = typeof raw === "string" ? raw.trim().slice(0, 30) : ""; redirect(`/lessons/11?q=${encodeURIComponent(name || "guest")}`); }
