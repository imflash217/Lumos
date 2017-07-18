# greetings.py
# PUT YOUR NAME AND NETID HERE
# Feb, 2017
# Skeleton by Profs Erik Andersen and Lillian Lee

"""Library of functions producing greetings"""

import random


def multi_hi(name, num):
    """Returns a string of the form: "hi " repeated <num> times, followed by
    <name>, followed by "!".
    Preconditions (i.e., assumptions this function makes about its input):
        name is a string
        num is a positive int
        """    
    return "hi "*num + name + "!"


def rand_hi(name):
    """SEE LAB HANDOUT.
    Precondition: name is a string"""
    # reps = 0 # ***placeholder: replace as instructed***
    reps = random.randint(1, 100)
    return multi_hi(name, reps)


def natural_hi():
    """SEE LAB HANDOUT"""
    # input_name = raw_input('Please enter your name: ')    # raw_input() is deprecated from Python 3.0
    input_name = input('Please enter your name: ')          # renamed version of raw_input() from Python 3.0
    # print (rand_hi(input_name))
    return rand_hi(input_name)
