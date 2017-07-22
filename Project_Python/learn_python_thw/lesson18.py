def print_two(*args):
	arg1, arg2 = args
	print 'arg1 = %r and arg2 = %r' % (arg1, arg2)

def print_two_again(arg1, arg2):
	print 'arg1 = %r and arg2 = %r' % (arg1, arg2)

def print_one(arg):
	print 'arg = %r' % arg

def print_none():
	print 'I got nothing.....'


print_two('Rustom', 'Potter')
print_two_again('Vinay', 'Kumar')
print_one('Prithvi')
print_none()