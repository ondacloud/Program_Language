import { createInterface } from "node:readline/promises";
import { stdin, stdout } from "node:process";
const rl = createInterface({ input: stdin, output: stdout });
try { const name = await rl.question("Name: "); console.log(`Hello, ${name.trim() || "guest"}`); } finally { rl.close(); }
export {};
