# $exists & null

필드가 없는 문서와 명시적으로 null을 저장한 문서를 구분해야 합니다. $exists는 필드 존재 여부를 검사합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '04. $exists & null/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
db.students.insertMany([{_id:4,name:"Ara",score:null},{_id:5,name:"Noa"}]);
printjson(db.students.find({score:null},{_id:1}).sort({_id:1}).toArray());
printjson(db.students.find({score:{$exists:false}},{_id:1}).toArray());
```

[실행 파일](example.js)

## 결과 읽기

첫 조회는 id 4와 5, 두 번째는 id 5입니다.

## 주의사항

{score:null}은 null과 누락 필드에 모두 일치합니다. SQL IS NULL과 기계적으로 치환하지 마세요.

## 연습

{$type:10}으로 명시적 null만 찾아보세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
