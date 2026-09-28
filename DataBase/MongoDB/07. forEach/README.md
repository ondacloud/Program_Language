# forEach

커서는 forEach로 순회할 수 있습니다. 이것은 mongosh 클라이언트의 반복이며 서버 집계와 다릅니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '07. forEach/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
db.students.find({}).sort({_id:1}).forEach(doc => print(doc.name + ": " + doc.score));
```

[실행 파일](example.js)

## 결과 읽기

Mina: 80, Jin: 60, Sol: 90을 출력합니다.

## 주의사항

집계 가능한 계산은 aggregate로 서버에서 처리할 수 있습니다. 반복마다 원격 쿼리를 보내면 왕복이 늘어납니다.

## 연습

70점 이상 문서만 순회하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
