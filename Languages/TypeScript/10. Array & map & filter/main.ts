const scores: number[] = [60, 80, 90];
console.log(scores.filter(n => n >= 70).map(n => n + 1).join(","));
export {};
