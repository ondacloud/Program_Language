const counts = new Map([["apple", 2]]);
counts.set("apple", counts.get("apple") + 1);
const unique = new Set([1, 1, 2]);
console.log(counts.get("apple"), counts.has("pear"));
console.log(JSON.stringify([...unique]));
console.log(new Set([{}, {}]).size);
