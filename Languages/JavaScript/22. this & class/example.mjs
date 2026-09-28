class Counter {
  #value = 0;
  increment() { this.#value += 1; return this.#value; }
}
const counter = new Counter();
const increment = counter.increment.bind(counter);
console.log(increment(), increment());
