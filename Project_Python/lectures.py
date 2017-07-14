import name
import cornelltest

###################################################################
# Lecture 6:


def test_last_name_first():
    # 1st test case
    result = name.last_name_first("Rustom Potter")
    cornelltest.assert_equals("Potter, Rustom", result)

    # 2nd test case
    result = name.last_name_first("Rustom    Potter")
    cornelltest.assert_equals("Potter, Rustom", result)
    print ("All test cases passed....NO ERRORS :) ")
    print ("Module \'Name\' is working correctly.")

# test_last_name_first()


###################################################################
# Lecture 9


def function_1(x,y):
    try:
        return function_2(x,y)
    except:
        return float('inf')


def function_2(x,y):
    return function_3(x,y)


def function_3(x,y):
    return x/y

print function_1(12,3)
print function_1(1,0) # crashes here


def exchange(from_c, to_c, amt):
    """
    :param from_c: the parent currency
    :param to_c: the target currency
    :param amt: the amount of money in parent currency
    :return: amt from exchange
    :precondition: amt is an integer
    """
    assert type(amt) == float or type(amt) == int, "amt is neither a float or integer"


def is_float(m_string):
    """
    :param m_string: the input string
    :return: TRUE if m_string is a number
    """
    try:
        x = float(m_string)
        return True
    except:
        return False


def func_first(m_x):
    print 'Starting func_first()'
    try:
        func_second(m_x)
    except:
        print 'Caught at func_first()'
    print 'Ending func_first()'


def func_second(m_x):
    print 'Starting func_second()'
    try:
        func_third(m_x)
    except:
        print 'Caught at func_second()'
    print 'Ending func_second()'


def func_third(m_x):
    print 'Starting func_third()'
    assert m_x < 0
    print 'Ending func_third()'


func_first(1)
print '\n'
func_first(-1)
print '\n'

###################################################################
# Lecture 10:

m_text = "My name is Rustom of house Potter,\n lord of the seven kingdoms and protector of the realm."

m_words = m_text.split()
m_lines = m_text.split('\n')
print '-'.join(m_words)
# print '\n'
print '_'.join(m_lines)
# print '\n'
print '*'.join(m_lines[0].split() + m_lines[1].split())

# the map() function
# To process a list we often want to do the same thing to each item in the list
# One way to do this is to use the map function
# map(<function>, <list>) : call the function once for each item in the list,
#                           with the list item as the argument and put the return values into a list
#                         : function() has to have exactly one parameter, otherwise gets an error


def func_map(func_f, m_x):
    result = []  # empty list
    for y in m_x:
        result.append(func_f(y))
    return result

###################################################################
#  Lecture 11:

# Strings: IMMUTABLE sequence of Characters
# Tuples : IMMUTABLE sequence of ANY Object
#        : Conventionally used for Short seq., heterogeneous seq., fixed-length seq.
#        : Can be used to return multiple values
# Lists  : MUTABLE sequence of ANY Object
#        : Conventionally used for Long seq., homogeneous seq., variable-length seq.
#        : Can be used to return multiple values


def func_dev_rem(x, y):
    return (x/y, x % y)

print func_dev_rem(12, 7)


def func_sum(thelist):
    """
    :param thelist: a list of all numbers (integers or float)
    :return: the sum of all numbers in the list
    Precondition: thelist has to be a list of only floats or integers
    """
    # Create a variable to hold result
    result = 0  # Accumulator

    # Add each list element to the variable
    for x in thelist:
        result += x

    # Return the variable
    return result



# The filter function:
# filter(<boolean_function>, <list>) :
#   * Function must :
#       * have exactly one parameter
#       * return a boolean
#   * Returns a new list
#   * Returns elements of <list> for which <boolean_function> returns True


def func_num_ints(thelist):
    """
    :param thelist: a <list> of any mix of types
    :return: number of integers in the list
    """

    # Create a variable to hold result
    result = 0

    # for every element in the <list>
    #   check if its an integer
    #   if(yes) then add 1 to the variable
    for x in thelist:
        if type(x) == int:
            result += 1

    # Return the variable
    return result


def func_add_one(thelist):
    """

    :param thelist: a <list> of integer values
    :return: add 1 to every integer in the <list> and returns the <list>
    """
    # myCopy = [] # the accumulator
    size = len(thelist)

    for x in range(size):
        # x += 1
        # myCopy.append(x)    # Appending the incremented value to the copy list
        thelist[x] += 1
    # return myCopy
    return thelist

print func_add_one([1,31,4,5])

# Range() function:
#       * range(x): Returns a list of integers from 0 to x-1
#       * range(a,b) : Returns the list of integers from a to b-1


###################################################################
# Lecture 14
# <list> can hold any <object>
# <list> themselves are <object>, so a <list> can hold other <list>

list_a = [1, 2]
list_b = [4, 8, 9]
list_c = [10, 21, list_b, 52]
list_x = [list_a, list_b, list_c]

print list_b
print list_b
print list_c
print list_x

# Ragged lists : Rows w/ different length

# Data Wrangling: Transpose (converting rows to columns & vice-versa)


def func_transpose(table):
    """

    :param table: a non-ragged 2D <list>
    :return: returns a copy of table with rows and columns swapped
    """

    no_rows = len(table)
    no_cols = len(table[0]) # All rows have same no of columns in a non-ragged 2D list
    result = []     # Accumulator

    for m in range(no_cols):
        row = []    # Row accumulator, stores elements of the new row
        for n in range(no_rows):
            row.append(table[n][m])     # appends the col elements of previous table as rows of new table
        result.append(row)      # Add the new row into the resultant table
    return result

print func_transpose([[1, 2],[3, 4], [5, 6], [7, 8]])


###################################################################
# Lecture 15:

# Fibonacci sequence

def func_fibonacci(n):
    if n <= 1:
        return 1
    return (func_fibonacci(n-1) + func_fibonacci(n-2))


print func_fibonacci(-1)

# Divide and Conquer


def func_num_es(m_string):
    """
    :param m_string: a string
    :return: the number of 'e's in the string
    """
    # Handle small data
    if m_string == '':
        return 0
    elif len(m_string) == 1:
        return 1 if m_string[0] == 'e' else 0

    # Break into two parts
    m_left_part = func_num_es(m_string[0])
    m_right_part = func_num_es(m_string[1:])

    # Combine the results
    return m_left_part + m_right_part

print func_num_es('My name is Rustom Potter!')

###################################################################
# Lecture 16:


def func_is_palindrome(m_string):
    if len(m_string) < 2:
        return True

    ends = (m_string[0] == m_string[-1])
    middle = func_is_palindrome(m_string[1:-1])

    return (ends and middle)

print func_is_palindrome('Rustom Potter')
print func_is_palindrome('abba')


###################################################################
# Lecture 18:

class Point3(object):
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z

    def __str__(self):
        return '( {m_x}, {m_y}, {m_z})'.format(m_x=self.x, m_y=self.y, m_z=self.z)

    def __repr__(self):
        return str(self.__class__) + str(self)


p = Point3()
p2 = Point3()
print p, p2     # Prints in the same line
print (str(p))  # str() function
print repr(p)       # repr() function or Backquotes
print str('Rustom Potter')
print repr('Rustom Potter')


class Fraction(object):

    def __init__(self, n=0, d=1):
        self.numerator = n
        self.denominator = d
        # return '{m_num}/{m_deno}'.format(m_num=self.numerator, m_deno=self.denominator)

    def __add__(self, other):
        assert type(other) == Fraction
        top = (self.numerator * other.denominator) + (self.denominator * other.numerator)
        bottom = self.denominator * other.denominator
        return Fraction(top, bottom)

    def __mul__(self, other):
        assert type(other) == Fraction
        top = self.numerator * other.numerator
        bottom = self.denominator * other.denominator
        return Fraction(top, bottom)


a = Fraction(1,2)
b = Fraction(3,4)
c = Fraction(9,7)

print (a+b*c).numerator
print (a+b*c).denominator











