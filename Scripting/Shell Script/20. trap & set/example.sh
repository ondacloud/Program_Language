#!/usr/bin/env bash
set -u
set -o pipefail
trap 'printf "cleanup\n"' EXIT
if false; then
    printf 'unexpected\n'
else
    printf 'handled\n'
fi
printf 'finished\n'
