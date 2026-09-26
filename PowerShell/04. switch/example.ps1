$command = 'save'
switch -Exact ($command) {
  'save' { 'saved'; break }
  'open' { 'opened'; break }
  default { 'unknown' }
}
