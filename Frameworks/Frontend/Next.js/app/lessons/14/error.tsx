"use client";
export default function ErrorPage({ reset }: { error: Error & { digest?: string }; reset: () => void }) { return <><p>Could not render this lesson.</p><button onClick={reset}>Retry</button></>; }
