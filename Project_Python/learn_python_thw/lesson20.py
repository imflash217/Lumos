from sys import argv

script, input_file = argv

def print_all(f):
	print f.read()

def rewind(f):
	f.seek(0)

def print_a_line(line_count, f):
	print line_count, f.readline()

current_file = open(input_file)

print 'Lets print the whole file:'
print_all(current_file)

print 'Lets rewind like a tape back to the start:'
rewind(current_file)

print 'Lets print each line individually:'
line_no = 1
print_a_line(line_no, current_file)
line_no += 1
print_a_line(line_no, current_file)
line_no += 1
line_no += 1
print_a_line(line_no, current_file)