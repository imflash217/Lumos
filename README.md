# Python

* `Python` is a **Dynamically Typed** as well as **Strongly Typed** Language.

* `Dynamically Typed` : *Type* tracking is done automatically instead of manually typing the object types (like in `C++`)

* `Strongly Typed` : An object of a particular *type* can only do operations linked to that type (a *string* can only perform string-operations not *list*-operations)

* `Modules` are just packages of additional tools that we `import` to use.

* `strings` are sequences of one-character strings.

* Other more general sequence types include: `lists` and `tuples`.

* In Python, we can also index backwards from end. Positive indexes counts from the left while Negative indexes counts backwards from the right.

* **Immutable Objects** : `numbers`, `strings`, `tuples`

* **Mutable Objects** : `lists`, `dictionaries`, `sets`.

### Numeric Literals:

* In **Python 2.X** :
	* Two `integer` types : 
		* `normal`	: 32 bits
		* `long`	: unlimited precison
	* Python automatically converts up to `long` integer type when extra precision is needed

* In **Python 3.X** : 
	* Only 1 `integer` type: unlimited precision

* `is` operator tests object identity (i.e. address in memory)

* `lambda` creates un-named functions.

``` Python
# Python Expression Operators and Precedence

yield x 			# Generator function send protocol
lambda args : expression 	# Anonymous function generation

x if y else z			# Ternary selection (x is evaluated only if y is True)

x or y 				# Logical OR (y is evaluated only if x is False)
x and y 			# Logical AND (y is evaluated only if x is True)
not x 				# Logical Negation

x in y 				# Membership (iterables, sets)
x not in y 			# Membership (iterables, sets)

x is y 				# Object identity tests
x is not y 			# Object identity test

```

* `Polymorphism` : Meaning of an operation depends on the type of the `object` being operated on.

* **Variables** : 
	* Variables are created when they are first assigned values
	* Variables are replaced with values when they are first used in expressions
	* Variables must be assigned before they can be used in expressions
	* **Variables refer to objects and are never declared ahead of time**

* `Classic Division ( X / Y )` : In `Python 2.X`, Truncating results for `integers` and keeping the remainders (i.e. fractional parts) for the `floating-point numbers`

* `True Division ( X / Y )` : In `Python 3.X`, ALWAYS keeping remainders in floating-point results regardless of the types.

* `Floor Division ( X // Y )` : In `Python 2.X & 3.X`, Always truncates fractional remainders down to their floors regardless of the types. Its result type depends on the type of its operands

* `Decimal` are _fixed-precision_ floating point values

* 




