import test from "node:test";
import assert from "node:assert/strict";

async function readScore(text) {
  const value = Number(text);
  if (text.trim() === "" || !Number.isFinite(value)) throw new TypeError("invalid score");
  return value;
}

test("valid score", async () => {
  assert.equal(await readScore("90"), 90);
});
test("invalid score", async () => {
  await assert.rejects(readScore("abc"), TypeError);
  await assert.rejects(readScore(""), TypeError);
});
