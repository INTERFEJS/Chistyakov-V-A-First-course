a = int(input('Введите a: '))
b = int(input('Введите b: '))
def remaind(a, b):
    return remaind(a-b, b) if a >= b else a
print(remaind(a, b))