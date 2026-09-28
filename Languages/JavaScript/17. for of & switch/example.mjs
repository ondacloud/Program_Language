const values = [1, 2, 3, 4];
let total = 0;
for (const value of values) {
  if (value % 2 !== 0) continue;
  total += value;
}
console.log(total);
switch (total) {
  case 6: console.log("six"); break;
  default: console.log("other");
}
