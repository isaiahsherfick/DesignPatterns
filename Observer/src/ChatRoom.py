from IObservable import *
class ChatRoom(IObservable):
    def __init__(self):
        self.observerList = []
        self.chatList = []
    def add(self, observer):
        self.observerList = self.observerList + [observer]
    def remove(self, observer):
        target = -1
        for i in range(len(self.observerList)):
            if self.observerList[i] == observer:
                target = i
        if target != -1:
            del self.observerList[target]
    def getState(self):
        return self.chatList
    def notify(self):
        for o in self.observerList:
            o.update()
    def receiveMessage(self, msg):
        self.chatList = self.chatList + [msg]
        self.notify()
