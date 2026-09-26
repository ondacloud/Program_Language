#!/usr/bin/env bash
set -- 'Alice Kim' 'Bob'
printf 'count=%s\n' "$#"
for value in "$@"; do
    printf '<%s>\n' "$value"
done
IFS= read -r line <<< 'a\b c'
printf '%s\n' "$line"
