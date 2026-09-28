function get<T, K extends keyof T>(obj: T, key: K): T[K] { return obj[key]; }
console.log(get({ name: "Mina", score: 80 }, "score"));
export {};
