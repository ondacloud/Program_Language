const text = "가A";
const data = Buffer.from(text, "utf8");
console.log(text.length, data.length);
console.log(data.toString("utf8"));
const view = data.subarray(0, 3);
console.log(view.toString("utf8"));
