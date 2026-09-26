import { createContext, useContext, useState } from "react";

const ThemeContext = createContext("light");
function Preview() {
  const theme = useContext(ThemeContext);
  return <p>theme={theme}</p>;
}
export default function App() {
  const [theme, setTheme] = useState("light");
  return <ThemeContext.Provider value={theme}>
    <button onClick={() => setTheme(value => value === "light" ? "dark" : "light")}>테마 전환</button>
    <Preview />
  </ThemeContext.Provider>;
}
