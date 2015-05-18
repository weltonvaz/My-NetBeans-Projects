import os

if os.name == "nt":
    os.system("cls")
else:
    os.system("clear")

def somanumeros(a,b):
    return a + b

print somanumeros(2,5)
