#!/usr/bin/env bash
if IFS= read -r name; then
    printf 'Hello %s\n' "$name"
else
    printf 'no input\n' >&2
    exit 1
fi
