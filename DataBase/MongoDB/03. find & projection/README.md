# find & projection

조회 필터와 projection은 각각 어떤 문서와 어떤 필드를 가져올지 정합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '03. find & projection/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.find({team:"A"},{_id:0,name:1}).sort({name:1}).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Jin, Mina의 name만 반환됩니다.

## 주의사항

projection은 일반적으로 포함 1과 제외 0을 섞지 않습니다. _id 제외는 예외입니다.

## 연습

score 필드도 포함하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
