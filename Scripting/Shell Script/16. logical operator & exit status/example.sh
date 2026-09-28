#!/usr/bin/env bash
true && printf 'success
'
false || printf 'fallback
'
if ! false; then printf 'negated
'; fi
false
status=$?
printf 'status=%s
' "$status"
printf 'bits=%s
' "$((5 & 3)) $((5 | 3)) $((5 ^ 3)) $((5 << 1))"
