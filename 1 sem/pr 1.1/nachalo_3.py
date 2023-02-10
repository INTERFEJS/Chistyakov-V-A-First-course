# -- coding: utf-8 --
print ("Сколько вам лет? (от 1 до 75)")
age = input()
age = int(age)
print ("Как вас зовут")
name = input()
name = str(name)
if (age > 0) and (age < 75):
    if name != "Иван" and name != "иван":
        if age >= 16:
            print("Поздравляем вы поступили в ВГУИТ!")
        else:
            print("Сначала нужно окончить школу!")
            print("Осталось учиться лет:", 16 - age)
    else:
        print("Ваше имя не подходит! Вы не поступили :(")        
else:
    print ("Ваш возраст не подходит! Вы не поступили :(")