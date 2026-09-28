console.log("start");
const task = Promise.resolve(3).then(value => {
  console.log("then");
  return value * 2;
});
console.log("sync");
console.log(await task);
