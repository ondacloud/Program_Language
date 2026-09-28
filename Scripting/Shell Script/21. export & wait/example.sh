#!/usr/bin/env bash
export STUDY_MODE='demo'
bash -c 'printf "%s\n" "$STUDY_MODE"'
( STUDY_MODE='child'; printf '%s\n' "$STUDY_MODE" )
printf '%s\n' "$STUDY_MODE"
printf 'background\n' &
job_pid=$!
wait "$job_pid"
printf 'joined\n'
