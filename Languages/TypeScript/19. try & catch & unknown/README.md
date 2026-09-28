# try & catch & unknown

## 개념과 사용 시점

예외 값은 반드시 Error 인스턴스라는 보장이 없습니다. catch에서 타입을 좁혀 메시지를 읽습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **TypeScript 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
npm run example -- "19. try & catch & unknown/main.ts"
```

## 코드 읽기

```typescript
try { throw new Error("invalid score"); } catch (error: unknown) { console.log(error instanceof Error ? error.message : String(error)); }
export {};
```

[실행 파일](main.ts)

## 예상 결과

invalid score

## 주의사항

오류를 무시하고 성공값처럼 처리하면 원인을 숨깁니다. 처리하거나 상위로 전달하세요.

## 연습

문자열을 throw했을 때도 처리해 보세요.

[과정 목차](../README.md)
