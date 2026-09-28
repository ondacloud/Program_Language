import Image from "next/image";
export const metadata = { title: "Image lesson" };
export default function Page() { return <Image src="/course.svg" alt="Blue course card" width={240} height={120} unoptimized />; }
