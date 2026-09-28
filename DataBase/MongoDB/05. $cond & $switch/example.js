db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.aggregate([{$project:{_id:0,name:1,grade:{$cond:[{$gte:["$score",70]},"pass","retry"]}}},{$sort:{name:1}}]).toArray());
