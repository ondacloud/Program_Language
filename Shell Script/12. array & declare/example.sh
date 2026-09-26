#!/usr/bin/env bash
names=('Alice Kim' 'Bob')
names+=('Chris')
printf 'count=%s\n' "${#names[@]}"
printf '%s\n' "${names[@]}"
declare -A scores=([Alice]=90 [Bob]=80)
printf 'Alice=%s\n' "${scores[Alice]}"
