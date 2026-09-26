#!/usr/bin/env bash
n=0
if ((n > 0)); then printf 'positive\n'
elif ((n == 0)); then printf 'zero\n'
else printf 'negative\n'; fi
