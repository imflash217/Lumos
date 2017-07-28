class Song(object):
	def __init__(self,lyrics):
		self.lyrics = lyrics

	def sing_me_a_song(self):
		for line in self.lyrics:
			print line

lyrics_bday = """
Happy birthday to you.
I don\'t want to get sued; so I'll stop right there.
Have a great life ahead.
"""

lyrics_parade = """
They rally around the family,
With pockets full of shells.
"""

happy_bday = Song([lyrics_bday])
bulls_on_parade = Song([lyrics_parade])

happy_bday.sing_me_a_song()
bulls_on_parade.sing_me_a_song()