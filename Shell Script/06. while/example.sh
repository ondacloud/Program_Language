#!/usr/bin/env bash
n=0
while ((n < 3)); do
  printf '%s\n' "$n"
  ((n += 1))
done
