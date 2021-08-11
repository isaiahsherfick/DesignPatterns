from datetime import datetime
class Message:
    def __init__(self, sender, msg):
        self.sender = sender
        self.msg = msg
        self.timestamp = datetime.now().strftime("%H:%M:%S")
    def getSender(self):
        return self.sender
    def getMsg(self):
        return self.msg
    def getTimestamp(self):
        return self.timestamp
    def __str__(self):
        return str(self.timestamp) + " " + self.sender + ": " + self.msg
