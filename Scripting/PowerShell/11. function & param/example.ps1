function Get-Greeting {
    [CmdletBinding()]
    param(
        [Parameter(Mandatory)]
        [ValidateNotNullOrEmpty()]
        [string]$Name
    )
    "Hello $Name"
}
Get-Greeting -Name 'Alice'
