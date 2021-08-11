from IObserver import *
from Message import *
import sys
class Client(IObserver):
    def __init__(self,name,chatRoom):
        self.name = name
        self.chatRoom = chatRoom
        self.chatList = []
        chatRoom.add(self)
    def update(self):
        self.chatList = self.chatRoom.getState()
    def sendMessage(self, message:str):
        msg = Message(self.name, message)
        self.chatRoom.receiveMessage(msg)
    def printObservation(self):
        print(self.name + " sees:")
        for c in self.chatList:
            print(c)
        print("")

