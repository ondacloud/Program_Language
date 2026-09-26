import { mkdtemp, writeFile, readFile, unlink, rmdir } from "node:fs/promises";
import { join } from "node:path";
import { tmpdir } from "node:os";

const directory = await mkdtemp(join(tmpdir(), "node-study-"));
const file = join(directory, "sample.txt");
try {
  await writeFile(file, "Hello file", { encoding: "utf8", flag: "wx" });
  console.log(await readFile(file, "utf8"));
} finally {
  await unlink(file).catch(error => { if (error.code !== "ENOENT") throw error; });
  await rmdir(directory);
}
