$user = [pscustomobject]@{
    Name = 'Alice'
    Tags = @('reader', 'writer')
}
$json = $user | ConvertTo-Json -Depth 5 -Compress
$restored = $json | ConvertFrom-Json
$restored.Name
$restored.Tags.Count
