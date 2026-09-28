interface Named { name: string }
class Student implements Named { constructor(public name: string, private score: number) {} summary() { return `${this.name}: ${this.score}`; } }
console.log(new Student("Mina", 80).summary());
export {};
