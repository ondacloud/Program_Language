function first<T>(items: readonly T[]): T | undefined { return items[0]; }
console.log(first([10, 20]), first<string>([]));
export {};
