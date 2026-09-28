#!/usr/bin/env bash
name='guest'
while getopts ':n:' option; do
    case "$option" in
        n) name=$OPTARG ;;
        *) printf 'usage: %s [-n name]\n' "$0" >&2; exit 2 ;;
    esac
done
shift "$((OPTIND - 1))"
printf 'Hello %s\n' "$name"
