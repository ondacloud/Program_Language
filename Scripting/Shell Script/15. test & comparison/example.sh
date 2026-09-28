#!/usr/bin/env bash
text='Alice'
n=12
[[ $text == A* ]] && printf 'pattern
'
[[ -n $text && $n -ge 10 ]] && printf 'valid
'
((n >= 10 && n < 20)) && printf 'range
'
[[ -d . ]] && printf 'directory
'
[[ ! -z $text ]] && printf 'not empty
'
