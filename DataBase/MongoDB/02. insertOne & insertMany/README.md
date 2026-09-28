# insertOne & insertMany

컬렉션에는 문서를 저장합니다. _id는 고유 식별자이며 생략하면 보통 ObjectId가 생성됩니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '02. insertOne & insertMany/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.insertOne({_id:4,name:"Ara",score:75}));
printjson(db.students.findOne({_id:4}));
```

[실행 파일](example.js)

## 결과 읽기

삽입 승인 결과와 Ara 문서를 확인할 수 있습니다.

## 주의사항

같은 _id를 두 번 넣으면 중복 키 오류가 납니다. 모든 문서의 필드가 같을 필요는 없지만 일관된 모델이 관리하기 쉽습니다.

## 연습

서로 다른 _id 두 개를 insertMany로 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
