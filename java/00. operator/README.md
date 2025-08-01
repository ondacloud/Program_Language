# Operator

## Data Type
|Data Type|Size|Expression Range Of Values|
|---|---|---|
|정수형|
|char| 1 Byte|-128 ~ 128|
|short|2 Byte|-32,768 이상 32,767 이하|
|int|4 Byte|-2,147,483,648 이상 2,147,483,648 이하|
|long|4 Byte| -2,147,483,648 이상 2,147,483,648 이하|
|long long|8 Byte|-9,223,372,036,854,775,808 이상|
||| 9,223,372,036,854,775,808 이하|
|실수형||
|float|4 Byte|±3.4 x 10^−37 이상 ±3.4 x 10^38 이하|
|double|8 Byte|±1.7 x 10^−307 이상 ±1.7 x 10^308 이하|
|long double| 8 Byte 이상|double 이상의 크기|

<br>

## Arithmetic operator
|Operator|Description|
|---|---|
|+|왼쪽의 피연산자에 오른쪽의 피연산자를 더합니다.|
|-|왼쪽의 피연산자에서 오른쪽의 피연산자를 뺍니다.|
|*|왼쪽의 피연산자에 오른쪽의 피연산자를 곱합니다.|
|/|왼쪽의 피연산자에 오른쪽의 피연산자를 나눕니다.|
|%|왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 얻게 되는 나머지를 반환합니다.|

<br>

## Substitution Operator
|Operator|Description|Complex Connection Equations|Same Operation Formula|
|---|---|---|---|
|=|왼쪽의 피연산자에 오른쪽의 피연산자를 대입합니다.|
|+=|왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입합니다.|a += b|a = a + b|
|-=|왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입합니다.|a -= b|a = a - b|
|*=|왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입합니다.|a *= b|a = a * b|
|/=|왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입합니다.|a /= b|a = a / b|
|%=|왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입합니다.|a %= b|a = a % b|

<br>

## Increasing, Decreasing Operators
|Operator|Description|
|---|---|
|i++|속한 문장을 먼저 진행한 후, 값을 1 증가합니다.|
|i--|속한 문장을 먼저 진행한 후, 값을 1 감소합니다.|
|++i|값을 1 증가 후, 속한 문장의 나머지를 진행합니다.|
|--i|값을 1 감소 후, 속한 문장의 나머지를 진행합니다.|

<br>

## Relational Operator
|Operator|Description|
|---|---|
|<|왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 1을 반환합니다.|
|>|왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 1을 반환합니다.|
|==|왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 1을 반환합니다.|
|!=|왼쪽의 피연산자와 오른쪽의 피연산자가 같지 않으면 1을 반환합니다.|
|<=|왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 1을 반환합니다.|
|>=|왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 1을 반환합니다.|

<br>

## Logical Operator
|Operator|Description|
|---|---|
|&&|논리식이 모두 참이면 1을 반환합니다.|
|\|\||논리식 중에서 하나라도 참이면 1을 반환합니다.|
|!|논리식의 결과가 참이면 0을, 거짓이면 1을 반환합니다.|

<br>

## Bit Operator
|Operator|Description|Example|
|---|---|---|
|&|대응되는 비트가 모두 1이면 1을 반환합니다. (비트 AND 연산)|00001111 & 00010101 -> 00000101|
|\| |대응되는 비트 중에서 하나라도 1이면 1을 반환합니다. (비트 OR 연산)|00001111 | 00010101 -> 00011111
|^|대응되는 비트가 서로 다르면 1을 반환함. (비트 XOR 연산)|00001111 ^ 00010101 -> 00011010|
|~|비트를 1이면 0으로, 0이면 1로 반전시킵니다. (비트 NOT 연산)|~00001111 -> 11110000
|<<|비트 열을 왼쪽으로 이동시킵니다. (left shift 연산) <br> 이동으로 인해서 생기는 오른쪽 빈칸은 0으로 채워지고, 이동으로 인해서 밀려나는 왼쪽 비트들은 소멸됩니다.|00001111<<2 -> 00111100|
|>>|비트 열을 오른쪽으로 이동시킵니다. (right shift 연산) <br> 이동으로 인해서 밀려나는 오른쪽의 비트들은 소멸되고, 이동으로 인해서 생긴 왼쪽의 빈 자리는 0으로 채워집니다.|00001111>>2 -> 00000011|

<br>

## Other Operators
|Operator|Description|
|---|---|
|sizeof|컴파일러의 자료형 별 Byte 크기를 표시합니다.|
|&|주소 연산자|
|*|참조 연산자|