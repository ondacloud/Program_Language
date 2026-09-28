import { notFound } from "next/navigation";
export default async function Page({ params }: { params: Promise<{ id: string }> }) { const { id } = await params; if (id !== "1") notFound(); return <p>Mina</p>; }
