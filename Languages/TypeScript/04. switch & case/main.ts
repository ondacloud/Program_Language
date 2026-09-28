function label(code: number): string { switch (code) { case 200: return "ok"; case 404: return "missing"; default: return "other"; } }
console.log(label(404));
export {};
