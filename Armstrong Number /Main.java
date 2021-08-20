n = int(input())
def armstrong(n):
    number = str(n)
    n = len(number)
    output = 0
    for i in number:
      output = output+int(i)**n
    if output == int(number):
        return("Armstrong Number")
    else:
          return("Not a Armstrong Number")
      
print(armstrong(n))