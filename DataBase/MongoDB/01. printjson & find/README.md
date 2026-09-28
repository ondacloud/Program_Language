# printjson & find

mongosh의 printjson은 값을 출력합니다. find는 커서를 반환하므로 toArray 또는 순회로 결과를 읽습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '01. printjson & find/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.find({},{_id:0,name:1,score:1}).sort({_id:1}).toArray());
```

[실행 파일](example.js)

## 결과 읽기

Mina 80, Jin 60, Sol 90이 배열로 표시됩니다.

## 주의사항

대량 결과를 toArray로 한 번에 가져오면 메모리를 많이 사용합니다. 출력 함수와 서버 쿼리를 구분하세요.

## 연습

findOne({_id:1})과 find의 반환 형식을 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
