# verify_shell_location.py
# Prof Erik Andersen, Prof Lillian Lee, and Molly Feldman
# Feb 2017; update Feb 7 7pm, removing directory check (too system-dependent)

"""Existence of this script helps check if students have correct working
directory for the command shell (i.e., that the command shell is viewing the
correct folder) for this lab"""

# Technically, this script checks whether students have the lab files they need
# in the current working directory

import os
# import sys
# import platform

### PROBLEM Feb 6: Phillips 381 HOME was set to "C:\".  
# if platform.system() == "Windows":
#     desired_dir = os.path.expanduser("~\Desktop\lab02")     
# else:
#     desired_dir = os.path.expanduser("~/Desktop/lab02")
# 
# 
# if os.getcwd() != desired_dir:
#     print
#     print "WARNING: your working directory is not what the lab instructions specify:"
#     print "  instead of " + desired_dir
#     print "  your working dir is " + os.getcwd()
#     print
#     check = raw_input("Do you want to continue (Y/N)? If you're a CS1110 student, say 'N'. ")
#     if check == "N" or check == "No" or check == "no" or check == "n":
#         print
#         print "*** Ask a staff member for help with this part. ***"
#         sys.exit()



filesnames = ["verify_shell_location.py",
              "greetings.py",
              "test_rand_hi.py",
              "finally.py",
              "run_multi_hi.py"]
test_results = []
for f in filesnames:
    test_results.append(os.path.isfile(f))

if all(test_results):

    print()
    print ('The command shell\'s working directory contains the files for this lab.')
    print ("Hurrah!")

else:
    print ("Something is wrong: please ask a staff member for help.""")
    print ("Diagnostic info: ")
    for i in range(len(filesnames)):
        print (filesnames[i] + ": " + ("found" if test_results[i] else "not found"))
