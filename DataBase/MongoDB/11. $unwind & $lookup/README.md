# $unwind & $lookup

배열은 $unwind로 펼치고 다른 컬렉션의 관련 문서는 $lookup으로 연결할 수 있습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '11. $unwind & $lookup/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
db.teams.deleteMany({});
db.teams.insertOne({_id:"A",label:"Alpha"});
printjson(db.students.aggregate([{$lookup:{from:"teams",localField:"team",foreignField:"_id",as:"teamInfo"}},{$project:{_id:0,name:1,teamInfo:1}},{$sort:{name:1}}]).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Mina·Jin의 teamInfo에는 Alpha 문서가 들어가고 Sol에는 빈 배열이 들어갑니다.

## 주의사항

연결 결과는 배열입니다. $unwind의 preserveNullAndEmptyArrays 옵션에 따라 미일치 문서를 유지할 수 있습니다.

## 연습

teamInfo를 $unwind로 펼친 뒤 Sol을 유지하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
