const original = [3, 1, 2];
const sorted = [...original].sort((a, b) => a - b);
const doubled = original.map(value => value * 2);
console.log(JSON.stringify(original));
console.log(JSON.stringify(sorted));
console.log(JSON.stringify(doubled.filter(value => value >= 4)));
