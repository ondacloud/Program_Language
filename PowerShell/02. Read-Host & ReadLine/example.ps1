$name = [Console]::ReadLine()
if ($null -eq $name) {
    Write-Error 'no input'
    exit 1
}
"Hello $name"
