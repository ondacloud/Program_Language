$users = @(
    [pscustomobject]@{ Name = 'Alice'; Score = 90 }
    [pscustomobject]@{ Name = 'Bob'; Score = 70 }
)
$users |
    Where-Object Score -ge 80 |
    Sort-Object Score -Descending |
    Select-Object -ExpandProperty Name
