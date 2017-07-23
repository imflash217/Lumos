
def append_list(m_list, m_roof, m_increment):
	i = len(m_list)+1
	# numbers = m_list

	while i < m_roof :
		print 'At the top i is %d' % i 
		m_list.append(i)
		i += m_increment
		print 'Numbers now : ', m_list
		print 'At the bottom i is : %d' % i 

	print 'Finally the m_list[]: '
	for num in m_list:
		print num


m_list = ['a', 'b', 'c']
append_list(m_list, 13, 3)
