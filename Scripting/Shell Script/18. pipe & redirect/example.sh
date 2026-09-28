#!/usr/bin/env bash
printf 'banana\napple\nbanana\n' | sort | uniq
printf 'warning\n' >&2
if printf 'hello\n' | grep -q '^hello$'; then
    printf 'found\n'
fi
