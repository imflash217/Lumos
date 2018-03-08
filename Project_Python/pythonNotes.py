# ways of closing the python shell
	# closes the python shell and put back the usual terminal
		exit()
		quit()
		# CTRL + D

	# cleans the command prompt while staying inside the Python-shell-interpretor
		# CTRL + C : 

#1 passing arbitrary code as string in bash-shell
	$ python -c 'print("Hello World")'

#2 empty value or NULL datatype
	x = None

#3 Rules for variable naming
	# 1: Variable names must start with a letter or an underscore
		x = True	# OK
		_y = True	# OK
		9x = False	# ERROR
		$y = True	# ERROR
	# 2: The remainder of the variable name may consist of letters, numbers and underscores
		has_0_in_it = True	# OK
	# 3: Names are case sensitive

#4 We can assign multiple values to multiple variables in the same line, but the number of values & variables must be same
	a, b, c = 1, 2.5, 3				# OK
	x, y, z = 7, 'potter'			# ERROR: too few values to unpack
	i, j = 5, 6, 'rus', 56			# ERROR: too many values to unpack; this can be resolved by using '_' as a dummy variable
	i, j, _, _ = 5, 6, 'rus', 56	# OK: i = 5, j = 6
	i, _, j, _ = 5, 6, 'rus', 56	# OK: i = 5, j = 'rus'
	i, j, _ = 5, 6, 'rus', 56		# ERROR: too many variables to unpack

#5 Assigning single value to several variables instantenously
	a = b = c = 2.17

#6 Viewing the list of outdated packages:
#  $ pip list --outdated

#7 Upgrade a specific package:
#  $ pip install [package_name] --upgrade

#8 








