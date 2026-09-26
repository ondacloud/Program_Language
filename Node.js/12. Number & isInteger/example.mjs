const raw = process.argv[2] ?? "3";
const quantity = Number(raw);
if (raw.trim() === "" || !Number.isInteger(quantity) || quantity < 0) {
  console.error("quantity must be a non-negative integer");
  process.exitCode = 1;
} else {
  console.log(quantity * 1000);
}
