#!/usr/bin/env bash
for n in 0 1 2 3; do
  if ((n == 2)); then break; fi
  printf '%s\n' "$n"
done
