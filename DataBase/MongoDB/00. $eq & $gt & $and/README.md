# $eq & $gt & $and

MongoDB의 조회 조건은 SQL 문자열 대신 BSON 문서로 표현합니다. $gte 같은 연산자는 필드 값과 조건을 비교합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '00. $eq & $gt & $and/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.find({$and:[{score:{$gte:80}},{team:{$in:["A","B"]}}]},{_id:0,name:1}).sort({name:1}).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Mina, Sol 문서가 반환됩니다.

## 주의사항

같은 객체에 동일한 필드 키를 중복 작성하지 마세요. 드라이버 입력에서도 허용된 필드·연산자를 검증해야 합니다.

## 연습

점수가 70 미만인 학생을 $lt로 찾으세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
