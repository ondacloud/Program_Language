# sort & limit & skip

sort로 정렬하고 limit으로 개수를 제한합니다. skip은 앞의 결과를 건너뜁니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '06. sort & limit & skip/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.find({},{_id:0,name:1,score:1}).sort({score:-1,_id:1}).limit(2).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Sol 90, Mina 80 순입니다.

## 주의사항

큰 skip은 많은 데이터를 건너뛰어 비용이 커질 수 있습니다. 고유 정렬 키를 이용한 범위 페이지네이션을 검토하세요.

## 연습

skip(1).limit(1) 결과를 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
