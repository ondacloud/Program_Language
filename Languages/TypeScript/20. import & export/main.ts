import { sum } from "./math.js";
import type { Pair } from "./math.js";
const values: Pair = [2, 3];
console.log(sum(...values));
export {};
