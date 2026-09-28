import { setTimeout as delay } from "node:timers/promises";
function apply(value, transform) { return transform(value); }
async function doubleLater(value) {
  await delay(1);
  return value * 2;
}
console.log(apply(3, n => n + 1));
console.log(await doubleLater(3));
console.log("done");
