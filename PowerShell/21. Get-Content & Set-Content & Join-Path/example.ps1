$tempFile = [System.IO.Path]::GetTempFileName()
try {
    Set-Content -LiteralPath $tempFile -Value 'Hello file' -Encoding utf8
    (Get-Content -LiteralPath $tempFile -Raw).TrimEnd()
} finally {
    Remove-Item -LiteralPath $tempFile
}
