db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
printjson(db.students.updateOne({_id:4},{$set:{score:75},$setOnInsert:{name:"Ara"}},{upsert:true}));
printjson(db.students.findOne({_id:4}));
