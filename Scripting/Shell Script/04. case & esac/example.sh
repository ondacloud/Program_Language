#!/usr/bin/env bash
command='run'
case "$command" in
  start|run) printf 'starting\n' ;;
  stop) printf 'stopping\n' ;;
  *) printf 'unknown\n' ;;
esac
