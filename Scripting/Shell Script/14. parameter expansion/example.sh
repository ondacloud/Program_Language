#!/usr/bin/env bash
name=''
printf '%s\n' "${name:-guest}"
file='report.txt'
printf '%s\n' "${file%.txt}"
value=$(printf 'hello\n\n')
printf '<%s>\n' "$value"
