import Link from 'next/link';
import './globals.css';
export const metadata = { title: 'Next.js course' };
export default function RootLayout({ children }: { children: React.ReactNode }) { return <html lang="ko"><body><main><header><h1>Next.js 구문별 실습</h1><Link href="/">전체 예제</Link></header><hr />{children}</main></body></html>; }
