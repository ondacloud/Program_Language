import test from "node:test";
import assert from "node:assert/strict";

function average(values) {
  if (values.length === 0) throw new RangeError("empty values");
  return values.reduce((sum, value) => sum + value, 0) / values.length;
}
test("average and empty input", () => {
  assert.equal(average([2, 4]), 3);
  assert.equal(average([5]), 5);
  assert.throws(() => average([]), RangeError);
});
