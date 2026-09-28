type Student = { name: string; score: number };
const patch: Partial<Student> = { score: 90 };
const summary: Pick<Student, "name"> = { name: "Mina" };
const counts: Record<string, number> = { A: 2 };
console.log(summary.name, patch.score, counts["A"]);
export {};
