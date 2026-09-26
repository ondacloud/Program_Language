function divide(a, b) {
  if (b === 0) throw new RangeError("zero divisor");
  return a / b;
}
try {
  console.log(divide(10, 0));
} catch (error) {
  console.log(error.name, error.message);
} finally {
  console.log("cleanup");
}
