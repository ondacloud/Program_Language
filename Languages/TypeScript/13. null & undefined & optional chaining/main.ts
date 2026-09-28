function city(user?: { address?: { city: string } }): string { return user?.address?.city ?? "unknown"; }
console.log(city(), city({ address: { city: "Seoul" } }));
export {};
