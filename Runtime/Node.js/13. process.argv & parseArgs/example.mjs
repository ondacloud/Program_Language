import { parseArgs } from "node:util";
const { values } = parseArgs({
  options: { name: { type: "string", default: "guest" } },
  allowPositionals: false
});
console.log(`Hello ${values.name}`);
