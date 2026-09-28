#!/usr/bin/env bash
n=0
until ((n >= 3)); do
  printf '%s\n' "$n"
  ((n += 1))
done
