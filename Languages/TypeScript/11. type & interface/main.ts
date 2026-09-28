interface Student { name: string; score?: number }
type Team = "A" | "B";
const student: Student = { name: "Mina" };
const team: Team = "A";
console.log(student.name, student.score ?? 0, team);
export {};
