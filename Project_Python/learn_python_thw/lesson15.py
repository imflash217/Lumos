from sys import argv

# script, filename = argv

# txt = open(filename)

# print 'Here is your file %s' % filename
# print txt.read()

print 'Type your file name again:'
file_again = raw_input('> ')	# returns a 'string' and stores in a variable

txt_again = open(file_again)	# Returns a file() object

print txt_again.read()			# prints the content of the file in text format

txt_again.close()				# Close the file once it is done done reading and printing
# print txt_again.read()		# Once the file is closed, its content can't be accessed