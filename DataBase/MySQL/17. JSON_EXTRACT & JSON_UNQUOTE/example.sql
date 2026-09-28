SELECT JSON_UNQUOTE(JSON_EXTRACT('{"name":"Mina","score":80}', '$.name')) AS name;
