import { Readable, Transform, Writable } from "node:stream";
import { pipeline } from "node:stream/promises";

let output = "";
const upper = new Transform({
  transform(chunk, encoding, callback) {
    callback(null, chunk.toString("utf8").toUpperCase());
  }
});
const sink = new Writable({
  write(chunk, encoding, callback) { output += chunk.toString(); callback(); }
});
await pipeline(Readable.from(["hello ", "node"]), upper, sink);
console.log(output);
