
def append_list(m_list, m_roof):
	i = len(m_list)+1
	numbers = m_list

	while i < m_roof :
		print 'At the top i is %d' % i 
		numbers.append(i)
		i += 1
		print 'Numbers now : ', numbers
		print 'At the bottom i is : %d' % i 

	print 'Finally the number[]: '
	for num in numbers:
		print num


m_list = ['a', 'b', 'c']
append_list(m_list, 13)
