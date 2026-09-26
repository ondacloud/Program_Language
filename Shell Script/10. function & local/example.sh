#!/usr/bin/env bash
greet() {
    local name=${1:-guest}
    printf 'Hello %s\n' "$name"
}
is_positive() {
    (( $1 > 0 ))
}
message=$(greet Alice)
printf '%s\n' "$message"
if is_positive 3; then
    printf 'valid\n'
fi
