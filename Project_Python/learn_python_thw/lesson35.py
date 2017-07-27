from sys import exit

def gold_room():
	print 'This room is full of gold. How much do you take?'
	next = raw_input("> ")
	if "0" in next or "1" in next:
		how_much = int(next)
	else:
		dead('That\'s not a number.')

	if how_much < 50:
		print 'Nice!! You are not greedy. You win!!!'
		exit(0)
	else:
		dead('You greedy fellow... :P ;)')

def bear_room():
	print 'There is a bear here.\nThe bear has a bunch of honey.\nThe fat bear is in front of another door.\nHow are you going to move the bear.'
	bear_moved = False

	while True:
		next = raw_input('> ')
		if next == 'Take honey':
			dead('The bear looks at you and then slaps your face off.')
		elif next == 'Taunt bear' and not bear_moved:
			print 'The bear has moved from the door. You can go now.'
			bear_moved = True
		elif next == 'Taunt bear' and bear_moved:
			print 'The bear gets pissed off and chews your leg off.'
		elif next == 'Open door' and bear_moved:
			gold_room()
		else:
			print 'I got no idea what that means.'

def cthulhu_room():
	print """
	Here you see the great evil Cthulhu.
	He, it, whatever stares at you and you go insane.
	DO you flee for your life or eat your head?
	"""

	next = raw_input('> ')
	if 'flee' in next:
		start()
	elif 'head' in next:
		print 'Well that was tasty.'
	else:
		cthulhu_room()

def dead(why):
	print why, 'Good job'
	exit(0)


def start():
	print"""
	You are in a dark room.
	There is a door on left and right.
	Which do you take??
	"""

	next = raw_input('> ')
	if next == 'left':
		bear_room()
	elif next == 'right':
		cthulhu_room()
	else:
		print 'You stumble around the room until you starve yourself to death.'

########################

start()
