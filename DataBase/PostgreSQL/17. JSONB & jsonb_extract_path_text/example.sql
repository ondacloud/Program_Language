SELECT jsonb_extract_path_text('{"name":"Mina","score":80}'::jsonb, 'name') AS name;
