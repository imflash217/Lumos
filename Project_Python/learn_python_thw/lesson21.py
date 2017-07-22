def add(a,b):
	print 'ADDING: %d + %d' % (a,b)
	return a+b

def subtract(a,b):
	print 'SUBTRACTING: %d - %d ' % (a,b)
	return a-b

def multiply(a,b):
	print 'MULTIPLY: %d * %d ' % (a,b)
	return a*b

def divide(a,b):
	print 'DIVIDE: %d / %d ' % (a,b)
	return a/b


print 'Lets do some math with functions:'

age = add(20, 6)
height = subtract(200, 25)
weight = multiply(30, 2)
iq = divide(100, 2)

print 'AGE: %d, HEIGHT: %d, WEIGHT: %d, IQ: %d' % (age, weight, height, iq)
print "Here is a puzzle:"

what = add(age, subtract(height, multiply(weight, divide(iq, 2))))
print 'That becomes: %r. Can you do that by hand?!!' % what
print 'WOW that becomes:', what, 'Can you do it yourself!!!'



