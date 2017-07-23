the_count = [1, 2, 3, 4, 5]
fruits = ['apples', 'oranges', 'pomogranate', 'banana', 'grapes']
change = [1, 'pennies', 2, 'dimes', 3, 'quaters']

for number in the_count:
	print 'The count is %d.' % number

for fruit in fruits:
	print 'This is %s.' % fruit

for i in change:
	print 'I got %r.' % i

elements = []

for i in range(0,6):
	print 'Adding %d to the list.' % i 
	elements.append(i)

for i in elements:
	print 'The element is : %d' % i 

