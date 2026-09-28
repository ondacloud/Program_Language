function show(value: string | number): string { return typeof value === "number" ? value.toFixed(1) : value.toUpperCase(); }
console.log(show(3), show("hi"));
export {};
