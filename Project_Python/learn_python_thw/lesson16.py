from sys import argv

script, filename = argv

print 'We are going to erase the following file: %s' % filename
print ' If you don\'t want this then press\'CTRL+C\' else hit ENETER.'
raw_input('?')

print 'Opening the file......'
m_file = open(filename, 'w')

print 'Truncating the file......'
# m_file.truncate()		# Not necessary when we are opening a file with 'w' argument in open(..., 'w') function

print 'Now we will write custom content in the same truncated file....Write it:'
m_line1 = raw_input("> ")
m_line2 = raw_input('> ')
m_line3 = raw_input('> ')

print 'Writing to the file......'
m_file.write(m_line1)
m_file.write('\n')
m_file.write(m_line2)
m_file.write('\n')
m_file.write(m_line3)

print 'Writing finished.....'
m_input = raw_input("Want to see the contents of the file? Y/N? :")

if m_input == 'Y' or 'y':
	m_file = open(filename)
	print m_file.read()
	print 'Now we are closing the file....'
	m_file.close()
elif m_input == 'N' or 'n':
	print 'Ok we are closing the file....'
	m_file.close()

