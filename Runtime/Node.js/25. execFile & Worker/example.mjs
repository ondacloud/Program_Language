import { execFile } from "node:child_process";
import { promisify } from "node:util";

const run = promisify(execFile);
const { stdout } = await run(process.execPath, ["-e", "console.log(2 + 3)"], {
  windowsHide: true,
  timeout: 5000
});
console.log(stdout.trim());
