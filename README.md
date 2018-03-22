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

```python
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

* For optimization, Python internally _caches_ and reuses certain kinds f unchangeable objects, such as small integers and strings.

* Each `object` has two standard header fields : 1. `type designator` & 2. `reference counter`.

* Names have no types. Types live with `objects` not names.

* `object` know what they are; each object contains a header field (refernece counter) that points to the `type` of the object. B'coz objects know what type they are, variables don't have to. Variables just point to the objects.

```python
import copy
X1 = copy.copy(Y)		# Makes top-level "shallow" copy of the object Y
X2 = copy.deepcopy(Y)		# MAkes deep-copy of the object Y : copies all nested parts


X == Y 				# tests whether the values in objects referenced by X, Y are same or not
X is Y 				# tests whether the objects(not just values) referenced by X, Y are same or not

```

* `weakref` : Weak-refernce is a reference to an object that doesnot by itself prevent the object from **garbage collected**. If the last remaining reference to an object are weak-reference then the object is automatically garbage collected and the weak-references are deleted (or otherwise notified).

* Python's `string` serve the same role as character-arrays in languages like C/C++, but they 

* Objects that are `iterable` return results one at a time, not in a physical list.

* `List comprehension` is not the same as `for` loops because it makes new list object.

* `List comprehensions` run much faster than equivalent `for` loop statements b'coz their iterations are performed at `C`-language speed inside the interpreter rather than with manual python code.

* `readlines()` method loads the `file` object into a list of line strings all at once.

* Any tool that employs the iteration protocol will automatically work on any built-in type or user-defined class that provides it.

* Every built-in tool that scans from left-to-right across objects, uses the iteration protocol.

| Command | Deatils | `return` value |
|--- | --- | --- |
| `sorted` | sorts items in an iterable | It returns an actual `list` instead of an iterable (in 3.X)
| `zip` | combines items from iterable | Returns iterable objects (in 3.X).
* `enumerate`	: pairs items in an iterable with their relative positions. Returns iterable objects (in 3.X).
* `filter`		: selects items for which a function is `True`. Returns iterable objects (in 3.X).
* `reduce`		: runs pair of items in an iterable through a function. Returns iterable objects (in 3.X).

```python
A = zip(*zip(X,Y))		# unzip a zip
```

* Fundamental changes in 3.X than in 2.X :
	* 3.X puts stronger emphasis on `iterators`
	* Unicode model
	* 3.x's mandated new-style classes

* 


