import { createInterface } from "node:readline";
const reader = createInterface({ input: process.stdin, crlfDelay: Infinity });
let received = false;
try {
  for await (const line of reader) {
    received = true;
    console.log(`Hello ${line}`);
    break;
  }
  if (!received) {
    console.error("no input");
    process.exitCode = 1;
  }
} finally {
  reader.close();
}
