#!/usr/bin/env bash
while IFS= read -r line; do
    printf '<%s>\n' "$line"
done <<'DATA'
Alice Kim
Bob
DATA
printf 'Alice 90\nBob 80\n' | awk '{ total += $2 } END { print total }'
