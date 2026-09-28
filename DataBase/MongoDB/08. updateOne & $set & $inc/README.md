# updateOne & $set & $inc

updateOne은 처음 일치하는 한 문서를 갱신합니다. $set은 필드 지정, $inc는 숫자 증감에 사용합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '08. updateOne & $set & $inc/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.updateOne({_id:2},{$set:{team:"B"},$inc:{score:5}}));
printjson(db.students.findOne({_id:2}));
```

[실행 파일](example.js)

## 결과 읽기

Jin의 team이 B, score가 65가 됩니다.

## 주의사항

단일 문서 쓰기는 원자적입니다. 여러 문서의 변경을 모두 한 번에 확정하는 것과는 다릅니다.

## 연습

updateMany로 A팀 전원에 1점을 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
