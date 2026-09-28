import { useEffect, useState } from "react";

export default function App() {
  const [seconds, setSeconds] = useState(0);
  useEffect(() => {
    const timer = setInterval(() => setSeconds(value => value + 1), 1000);
    return () => clearInterval(timer);
  }, []);
  return <p role="status">seconds={seconds}</p>;
}
