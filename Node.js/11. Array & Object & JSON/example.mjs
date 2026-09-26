const text = '[{"name":"A","price":10},{"name":"B","price":20}]';
const items = JSON.parse(text);
const names = items.filter(({ price }) => price >= 15).map(({ name }) => name);
const [first] = items;
const copy = { ...first, price: first.price + 1 };
console.log(names.join(","));
console.log(first.price, copy.price);
console.log(JSON.stringify(copy));
