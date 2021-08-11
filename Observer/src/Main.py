from ChatRoom import *
from Client import *
import time

#could be a lot more interesting with sockets and multiprocessing
#but this gets the point of the pattern across
if __name__ == '__main__':
    cr = ChatRoom()
    alice = Client("Alice",cr)
    bob = Client("Bob",cr)
    ethan = Client("Ethan",cr)
    alice.sendMessage("Hello everyone!")
    bob.printObservation()
    ethan.sendMessage("Hey Alice, what's up?")
    time.sleep(2)
    alice.printObservation()
    alice.sendMessage("Not much, you?")
    time.sleep(3)
    ethan.printObservation()
    bob.sendMessage("I'm having a bit of a rough day...")
    time.sleep(1)
    alice.printObservation()





