try {
    $value = [int]'invalid'
    $value
} catch {
    'invalid number'
} finally {
    'cleanup'
}
