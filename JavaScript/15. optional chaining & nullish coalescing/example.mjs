console.log(0 === "0");
console.log(0 || 10, 0 ?? 10);
const user = null;
console.log(user?.name ?? "guest");
console.log(Boolean([]), Boolean(""));
