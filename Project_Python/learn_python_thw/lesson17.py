from sys import argv
from os.path import exists

script, from_file, to_file = argv

print 'copying from %s to %s' % (from_file, to_file)

in_file = open(from_file); in_data = in_file.read()			# using ; in a single line is interpreted as a line breaker

print 'The input file is %d bytes long.' % len(in_data)
print 'Does the output file exist? %r' % exists(to_file)
print 'Ready, hit ENTER to continue. \'CTRL+C\' to abort.'

raw_input()

out_file = open(to_file, 'w')
out_file.write(in_data)

print 'Alright all is done.'

out_file.close()
in_file.close()


