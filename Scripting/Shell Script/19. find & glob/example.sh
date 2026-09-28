#!/usr/bin/env bash
work_dir=$(mktemp -d) || exit 1
cleanup() {
    rm -f -- "$work_dir/a file.txt"
    rmdir -- "$work_dir"
}
trap cleanup EXIT
printf 'hello\n' > "$work_dir/a file.txt"
shopt -s nullglob
for file in "$work_dir"/*.txt; do
    printf '%s\n' "${file##*/}"
done
