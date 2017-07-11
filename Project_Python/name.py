# name.py
# Walker M. White (wmw2)
# August 30, 2015
"""Module with a single, non-working function.

The function in this module has a bug (in the sense that it does not satisfy
its specification). This allows us to show off debugging."""

def last_name_first(n):
    """Returns: copy of n but in the form 'last-name, first-name'
    
    Parameter n: the person's name
    Precondition: n is in the form 'first-name last-name'
    with one or more blanks between the two names no spaces
    in <first-name> or <last-name>"""
    
    space_index = n.find(' ')   
    first = n[:space_index]  
    last = n[space_index+1:]
    return last+', '+first

