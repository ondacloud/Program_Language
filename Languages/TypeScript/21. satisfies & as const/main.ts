const colors = { ok: "green", fail: "red" } as const satisfies Record<string, string>;
console.log(colors.ok.toUpperCase());
export {};
