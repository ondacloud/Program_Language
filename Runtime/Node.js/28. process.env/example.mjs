function loadConfig(env) {
  const port = Number(env.PORT ?? "3000");
  if (!Number.isInteger(port) || port < 1 || port > 65535) throw new Error("invalid PORT");
  return { port, mode: env.APP_MODE ?? "development" };
}
const config = loadConfig({ PORT: "4000", APP_MODE: "test" });
console.log(JSON.stringify(config));
