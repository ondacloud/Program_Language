$runtimePath = (Get-Process -Id $PID).Path
& $runtimePath -NoProfile -Command 'exit 3'
$exitCode = $LASTEXITCODE
"exit=$exitCode"
if ($exitCode -ne 0) {
    'handled failure'
}
