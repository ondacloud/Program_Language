# createIndex & explain

createIndex로 검색용 인덱스를 만들고 explain으로 계획을 확인합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '12. createIndex & explain/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.createIndex({score:1}));
printjson(db.students.find({score:{$gte:80}}).explain("executionStats"));
```

[실행 파일](example.js)

## 결과 읽기

인덱스 이름과 실행 통계가 나옵니다. 작은 데이터에서는 계획이 달라질 수 있습니다.

## 주의사항

인덱스는 쓰기·저장 공간 비용이 듭니다. 삭제한 문서와 달리 인덱스는 다음 실행에도 남습니다.

## 연습

totalDocsExamined와 nReturned를 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
