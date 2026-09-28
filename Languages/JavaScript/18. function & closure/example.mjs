function makeCounter(start = 0) {
  let count = start;
  return () => ++count;
}
const next = makeCounter();
console.log(next(), next());
const add = (...values) => values.reduce((sum, value) => sum + value, 0);
console.log(add(1, 2, 3));
