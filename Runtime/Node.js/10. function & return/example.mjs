function total(values) {
  let result = 0;
  for (const value of values) {
    if (!Number.isFinite(value)) throw new TypeError("finite number required");
    if (value < 0) continue;
    result += value;
  }
  return result;
}
console.log(total([10, -2, 20]));
console.log(total([]));
try { total([NaN]); } catch (error) { console.log(error.message); }
