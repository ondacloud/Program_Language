const user = { name: "Alice", settings: { theme: "light" } };
const { name, age = 20 } = user;
const copy = { ...user, name: "Bob" };
copy.settings.theme = "dark";
console.log(name, age, copy.name);
console.log(user.settings.theme);
