# updateOne & upsert

upsert는 조건에 맞는 문서가 없을 때 새 문서를 삽입합니다. $setOnInsert는 삽입 경로에서만 적용됩니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '13. updateOne & upsert/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.updateOne({_id:4},{$set:{score:75},$setOnInsert:{name:"Ara"}},{upsert:true}));
printjson(db.students.findOne({_id:4}));
```

[실행 파일](example.js)

## 결과 읽기

_id 4, name Ara, score 75 문서가 생성됩니다.

## 주의사항

경쟁하는 upsert의 중복을 막으려면 조회 키에 적절한 고유 인덱스가 필요합니다.

## 연습

동일 upsert를 한 번 더 실행해 matchedCount 변화를 관찰하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
