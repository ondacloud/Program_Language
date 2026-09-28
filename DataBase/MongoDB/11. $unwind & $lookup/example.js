db = db.getSiblingDB("course_lab");
db.students.deleteMany({});
db.students.insertMany([{_id:1,name:"Mina",team:"A",score:80,tags:["sql","web"]},{_id:2,name:"Jin",team:"A",score:60,tags:["web"]},{_id:3,name:"Sol",team:"B",score:90,tags:["db"]}]);
db.teams.deleteMany({});
db.teams.insertOne({_id:"A",label:"Alpha"});
printjson(db.students.aggregate([{$lookup:{from:"teams",localField:"team",foreignField:"_id",as:"teamInfo"}},{$project:{_id:0,name:1,teamInfo:1}},{$sort:{name:1}}]).toArray());
