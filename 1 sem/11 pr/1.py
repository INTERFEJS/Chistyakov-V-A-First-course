from tkinter import*
import requests
def func():
    def logic():
        with open("11 pr\\Chistyacov.txt", "w") as file:
            username = txt.get()
            url = f"https://api.github.com/users/{username}"
            user_data = requests.get(url).json()
            keys = ['company', 'created_at', 'email', 'id', 'name', 'url']
            data = user_data.keys()
            for i in data:
                if i in keys:
                    file.write(f"{i}:{user_data[i]}" + '\n')
        lbl.configure(text = 'Данные записаны в файл Chistyacov.txt')
        btn.grid_remove()
        txt.grid_remove()
    root = Tk()
    root.title('Чистяков Виктор Андреевич У-223(1)')
    root.geometry('800x400')
    lbl = Label(root,text = 'Введите имя пользователя github чтобы получить данные   ' \
    ,font = ('Times New Roman',14))
    lbl.grid(column=0,row=0)
    btn = Button(root,text = 'Поиск',command = logic)
    lbl1 = Label(root,text = '  ')
    lbl1.grid(column=3,row=0)
    lbl.grid(column=1,row=0)
    btn.grid(column=4,row=0)
    txt = Entry(root,width=10)
    txt.grid(column=2,row=0)
    root.mainloop()
func()