function add(a, b = 1) { return a + b; }
const multiply = (a, b) => a * b;
function sum(...values) { return values.reduce((total, n) => total + n, 0); }
console.log(add(2), add(2, 3), multiply(2, 3));
console.log(sum(), sum(1, 2, 3));
console.log([1, 2].map(n => n * 2).join(","));
