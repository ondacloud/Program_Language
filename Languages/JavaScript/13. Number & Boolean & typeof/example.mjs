const raw = "12";
const value = Number(raw);
console.log(typeof raw, typeof value, value + 1);
console.log(Number(""), Number.isNaN(Number("bad")));
console.log(Boolean("false"), Boolean(0));
let name = "outer";
{ const name = "inner"; console.log(name); }
console.log(name);
