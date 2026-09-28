# $cond & $switch

집계 표현식 $cond와 $switch는 조건에 따른 값을 만듭니다. 문서 조회 조건과 집계 식의 문법을 구분하세요.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '05. $cond & $switch/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.aggregate([{$project:{_id:0,name:1,grade:{$cond:[{$gte:["$score",70]},"pass","retry"]}}},{$sort:{name:1}}]).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Jin retry, Mina pass, Sol pass입니다.

## 주의사항

"$score"는 필드 참조입니다. 일반 문자열 score와 다릅니다.

## 연습

여러 등급을 $switch의 branches로 표현하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
