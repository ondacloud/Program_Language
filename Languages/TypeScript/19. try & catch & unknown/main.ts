try { throw new Error("invalid score"); } catch (error: unknown) { console.log(error instanceof Error ? error.message : String(error)); }
export {};
