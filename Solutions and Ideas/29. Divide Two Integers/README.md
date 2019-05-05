Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

### Idea:
 1. straight froward: we cannot use the * / mod, so we use the minus. every time we minus the divisor until the dividend is less than the divisor.
 
 2. we can use the binary to find the quotient by doubling divisor and multiplication every time and recurse until dividend < divisor
 
 3. For the overflow, we need to care that:
 
 ```java
Integer.MAX_VALUE = 2^31 -1
Integer.MIN_VALUE = -2^31
Integer.MAX_VALUE + 1 = Integer.MIN_VALUE
since 1111111111111111111111111111111 +1 = 10000000000000000000000000000000
10000000000000000000000000000000 is the Complement code of Integer.MIN_VALUE
For Complement code, 0000 0000 = 0, 1000 0000 = -128
```