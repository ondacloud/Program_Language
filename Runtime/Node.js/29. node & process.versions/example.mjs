import { platform } from "node:os";
console.log("Hello Node.js");
console.log(process.versions.node.split(".")[0]);
console.log(platform());
console.log(typeof document);
