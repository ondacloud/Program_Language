$names = @('Alice', 'Bob')
$names -contains 'Bob'
'Bob' -in $names
'report.txt' -like '*.txt'
'item42' -match '^item(\d+)$'
$Matches[1]
$value = $null
$null -eq $value
$value ?? 'fallback'
($true ? 'yes' : 'no')
