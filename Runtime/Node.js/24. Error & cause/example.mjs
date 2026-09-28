function parsePort(text) {
  const value = Number(text);
  if (!Number.isInteger(value) || value < 1 || value > 65535) {
    throw new RangeError("invalid port");
  }
  return value;
}
try {
  parsePort("70000");
} catch (cause) {
  const error = new Error("configuration failed", { cause });
  console.log(error.message);
  console.log(error.cause.message);
}
