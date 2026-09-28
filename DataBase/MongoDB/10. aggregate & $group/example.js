db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.aggregate([{$match:{score:{$gte:60}}},{$group:{_id:"$team",count:{$sum:1},average:{$avg:"$score"}}},{$sort:{_id:1}}]).toArray());
