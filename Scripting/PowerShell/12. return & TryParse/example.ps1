function Get-Double {
  param([int]$Value)
  return ($Value * 2)
}
$value = 0
[int]::TryParse('12', [ref]$value)
Get-Double -Value $value
$items = @(Get-Double 2; Get-Double 3)
$items.Count
$items -join ','
$person = @{ Name = 'Kim'; Age = 20 }
$person['Name']
