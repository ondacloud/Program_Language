function Set-StudyValue {
    [CmdletBinding(SupportsShouldProcess)]
    param([string]$Name = 'demo')
    if ($PSCmdlet.ShouldProcess($Name, 'Set study value')) {
        "updated:$Name"
    }
}
Set-StudyValue -Name 'sample' -WhatIf
Set-StudyValue -Name 'sample' -Confirm:$false
