# lab03.py
# PUT YOUR NAME AND NETID HERE
# PUT THE DATE YOU LAST CHANGED THIS FILE HERE
# Skeleton by Walker M. White (wmw2), Lillian Lee (LJL2), Feb 2017


"""Lab 03 module:
        
        * potentially initially erroneous function for students to test 

        * skeleton of function needed for Assignment 1
"""

def replace_first(word,target,rep):
    ####
    #### THIS FUNCTION MAY HAVE BUGS 
    ####
    """Returns: a copy of word with the FIRST instance of target replaced by rep

    Example: replace_first('crane','a','o') returns 'crone'
    Example: replace_first('poll','ll','p') returns 'pop'

    Parameter word: The string to copy and replace
    Precondition: word is a string

    Parameter target: The substring to find in word
    Precondition: target is a nonempty valid substring of word

    Parameter rep: The substring to use in place of target
    Precondition: rep is a string
    """
    pos = word.rfind(target) # <pos> should be where the first target starts
    before = word[:pos] # <before> should be the part of word up to but not including
                        # the first occurrence of target
    after  = word[pos+1:] # <after> should be the part of word after the first
                          # occurrence of target
    result = before + rep + after # <result> should be the desired output.
    return result



def first_in_double_quotes(s):
    """Returns: The first substring of s between two double-quote characters

    Example: If s is 'A "B C" D', this function returns 'B C'
    Example: If s is 'Aaa "B C" D "E F" G', this function still returns 'B C'
       because it only picks the first such substring.
    Example: If s is 'A "   B C" D', this function returns '   B C'

    Parameter s: a string to search
    Precondition: s contains at least two double-quote characters
    """
    return ""  # PLACEHOLDER - REPLACE WITH YOUR REAL CODE







    
