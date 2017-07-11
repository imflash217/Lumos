import name
import cornelltest

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

test_last_name_first()
