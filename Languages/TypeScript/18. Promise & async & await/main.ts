async function loadScore(): Promise<number> { return 80; }
const [a, b] = await Promise.all([loadScore(), loadScore()]);
console.log(a + b);
export {};
