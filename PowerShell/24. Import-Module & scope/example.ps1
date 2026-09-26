$module = New-Module -Name StudyModule -ScriptBlock {
    function Get-StudyName { 'Study' }
    Export-ModuleMember -Function Get-StudyName
}
Import-Module $module
try {
    Get-StudyName
} finally {
    Remove-Module StudyModule
}
