# aggregate & $group

집계 파이프라인은 단계별로 문서를 변환합니다. $match로 줄이고 $group으로 요약합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '10. aggregate & $group/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.aggregate([{$match:{score:{$gte:60}}},{$group:{_id:"$team",count:{$sum:1},average:{$avg:"$score"}}},{$sort:{_id:1}}]).toArray());
```

[실행 파일](example.js)

## 결과 읽기

A팀 count 2 average 70, B팀 count 1 average 90입니다.

## 주의사항

단계의 순서가 결과와 비용에 영향을 줍니다. $group은 원래 각 문서를 유지하지 않습니다.

## 연습

평균 75 이상 그룹만 뒤의 $match로 선택하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
