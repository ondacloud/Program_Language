db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
db.students.insertMany([{_id:4,name:"Ara",score:null},{_id:5,name:"Noa"}]);
printjson(db.students.find({score:null},{_id:1}).sort({_id:1}).toArray());
printjson(db.students.find({score:{$exists:false}},{_id:1}).toArray());
