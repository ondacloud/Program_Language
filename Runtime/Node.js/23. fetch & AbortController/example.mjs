const controller = new AbortController();
controller.abort();
try {
  await fetch("data:application/json,%7B%22ok%22%3Atrue%7D", {
    signal: controller.signal
  });
} catch (error) {
  console.log(error.name);
}
const response = await fetch("data:application/json,%7B%22ok%22%3Atrue%7D");
if (!response.ok) throw new Error(`HTTP ${response.status}`);
console.log((await response.json()).ok);
