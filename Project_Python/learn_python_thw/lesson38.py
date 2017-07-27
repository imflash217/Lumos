ten_things = 'Apples Oranges Pomogranate Banana Teeth Happiness Success Wellbeing Greatness'
print 'Waint!! There isn\'t 10 things in the list. Let\'s fix this'
stuff = ten_things.split(' ') 

more_stuff = ['Day', 'Night', 'Song', 'Fribie', 'Laptop', 'Sugar']

while len(stuff) != 10:
	next_item = more_stuff.pop()
	print 'Adding: ', next_item
	stuff.append(next_item)
	print 'There are %d items in the list now.' % len(stuff)

print 'There we go: ', stuff
print 'Let\'s do some things with the \'stuff\''

print stuff[1]
print stuff[-1]
print stuff.pop()
print stuff
print '-'.join(stuff)
print '#'.join(stuff[3:8])
print stuff


