import { basename, extname } from "node:path";
import { fileURLToPath } from "node:url";

const file = fileURLToPath(new URL("./sample.txt", import.meta.url));
console.log(basename(file), extname(file));
const url = new URL("/search", "https://example.com");
url.searchParams.set("q", "hello world");
console.log(url.pathname, url.searchParams.get("q"));
