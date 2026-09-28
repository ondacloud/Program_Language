const priceText = "1000";
const price = Number(priceText);
let quantity = 2;
quantity += 1;
const total = price * quantity;
console.log(typeof priceText, typeof price);
console.log(total, quantity >= 3 ? "discount" : "normal");
console.log(total > 0 && Number.isFinite(total));
