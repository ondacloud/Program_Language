import { setTimeout as delay } from "node:timers/promises";
console.log("start");
const task = delay(10).then(() => "ready");
console.log("other work");
console.log(await task);
