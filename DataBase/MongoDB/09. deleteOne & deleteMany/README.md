# deleteOne & deleteMany

deleteOne은 한 문서를, deleteMany는 조건에 맞는 문서 모두를 지웁니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MongoDB '09. deleteOne & deleteMany/example.js'
```

## 예제

```javascript
db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.deleteOne({_id:3}));
printjson(db.students.countDocuments({}));
```

[실행 파일](example.js)

## 결과 읽기

deletedCount는 1, 남은 학생 수는 2입니다.

## 주의사항

빈 필터 {}를 deleteMany에 주면 컬렉션의 모든 문서가 삭제됩니다. 이 실습은 전용 course_lab만 사용합니다.

## 연습

삭제 전 find로 대상이 정확히 한 문서인지 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
