#!/usr/bin/env bash
double() {
  local value=${1:-}
  [[ $value =~ ^[0-9]+$ ]] || return 2
  printf '%s
' "$((10#$value * 2))"
}
if result=$(double 12); then printf 'value=%s
' "$result"; fi
double bad
printf 'status=%s
' "$?"
