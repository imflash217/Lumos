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
    for x in thelist:
        x += 1
    return thelist














