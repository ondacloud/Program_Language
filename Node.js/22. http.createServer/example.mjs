import { createServer } from "node:http";

const server = createServer((request, response) => {
  const url = new URL(request.url ?? "/", "http://localhost");
  if (request.method === "GET" && url.pathname === "/health") {
    response.writeHead(200, { "content-type": "application/json; charset=utf-8" });
    response.end(JSON.stringify({ ok: true }));
    return;
  }
  response.writeHead(404, { "content-type": "text/plain; charset=utf-8" });
  response.end("not found");
});

await new Promise((resolve, reject) => {
  server.once("error", reject);
  server.listen(0, "127.0.0.1", resolve);
});
try {
  const response = await fetch(`http://127.0.0.1:${server.address().port}/health`);
  console.log(response.status, await response.text());
} finally {
  await new Promise((resolve, reject) => server.close(error => error ? reject(error) : resolve()));
}
