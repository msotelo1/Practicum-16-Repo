# Instructions  

## Practicum 16 - Short-Circuit Evaluation of Boolean Operators<br>

### BACKGROUND<br>

**Short-Circuit or "Lazy" Evaluation**<br>
Logical-and from mathematics requires that both parts of the Boolean expression
`A and B` be true in order for the Boolean expression to be true, e.g.,
<br><br>
`age > 65 and married`
<br><br>
Here, if the current value of `age` is 67 and Boolean variable
`married` is true, then the Boolean expression is true, otherwise
it is false.
<br><br>
Some programming languages will be "clever" and not consider
the right side of a logical operator if it can determine the
value of a Boolean expression from the left side alone. 
In this example, if `age` is equal to 62, then the Boolean (sub)expression `age > 65` is false, and therefore the Boolean expression `age > 65 and married` cannot be true.
<br><br>
This might at first seem inconsequentiual, whether both sides
of a Boolean operator are evaluated or not. However, consider
the following situation,
<br><br>
`int[] nums = new int[10];`<br>
`// asssume nums array populated with values`<br>
`if(i < 10 && nums[i] > 0)`
<br><br>
The Java if statement is checking if the ith value of array `nums`
is greater than 0, but it is first checks if `i` is not 
out-of-bounds for the array size (with index values 0-9). **This
will only work if** `nums[i] > 0` **is not checked if** 
`i < 10` **is false**. If `nums[i] > 0` is checked even if
`i < 10` if false (i.e., when i > = 10) then the program will
terminate with an array out-of-bounds error.
<br><br>
Java has *two* different logical-and operators allowing the
programming to control how Boolean expression are evaluated. 
The `&&` operator performs *short-ciruit* or "lazy" evaluation, and
will only evaluate the right side of logical expression `A && B`
if the left side is true. The alternate logical-and operator `&`
always evaluates both sides of an expression `A & B` no matter
what the value of the left-side is.
<br><br>
There are a corresponding set of logical-or operators in Java. Logical-or operator `||` does short-circuit evaluation, and 
therefore, only evaluates the right-side of the an expression
`A || B` if the left side is false. The alternate logical-or
operator `|` evaluates both sides of an expression `A | B` no matter what the value of the left-side is.
<br><br>
### WHAT TO DO<br>
Rewrite the code given so that the first if statement is,<br><br>
`if(denominator != 0)`
<br>
followed by if statements that chedk for whether a fraction is 
proper or improper.
