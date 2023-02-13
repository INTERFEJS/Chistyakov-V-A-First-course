# -- coding: utf-8 --
#Индивидуальное задание №39

import telebot
from telebot import types
from bs4 import BeautifulSoup
import requests

bot = telebot.TeleBot('5997537731:AAEXTlIFpmRSilbQsUQKBRxgU2lkPWckGEI')

url = ''
all_Words = []
forbidden_words = []
w = ''
msg3 = ''
otv = ''
otv1 = ''
top_10 = []


@bot.message_handler(commands=['start'])
def start(message):

    global top_10
    global all_Words
    global forbidden_words
    global w
    all_Words = []
    forbidden_words = []
    top_10 = []
    w = ''

    first_text = f'Привет, <b>{message.from_user.first_name}</b>.'
    sec_text = '👨‍💻 Я считаю 10 самых часто-встречаемых слов на странице и готов организовать список слов, \
которые не учитываются в статистике.'
    bot.send_message(message.chat.id, first_text, parse_mode='html')
    button = types.ReplyKeyboardMarkup(resize_keyboard=True)
    initial_response = types.KeyboardButton('Хорошо, начнём!')
    button.add(initial_response)
    bot.send_message(message.chat.id, sec_text, reply_markup=button)


@bot.message_handler()
def user_text(message):

    if message.text == 'Хорошо, начнём!' or message.text == 'Попробуем ещё раз...'\
or message.text == 'Попробуем другой сайт...':
        button = types.ReplyKeyboardRemove()
        set_link = bot.send_message(message.chat.id, '🌐 Отправьте мне ссылку на страницу.', reply_markup=button)
        bot.register_next_step_handler(set_link,get_url)

def get_url(message):

    try:

        global all_Words
        global url
        url = message.text
        page = requests.get(url, allow_redirects=False)
        if page.status_code == 200 and page.url != 'https://www.youtube.com/':
            soup = BeautifulSoup(page.text, 'html.parser')
            all_Words = soup.findAll()
            msg = bot.send_message(message.chat.id, '✔️ Хорошо! Теперь введите слова, которые вы не \
хотите видеть в статистике. Введите первое слово или закончите ввод символом "-"', parse_mode='html')
            bot.register_next_step_handler(msg, get_first_forbidden_words)
        else:
            button = types.ReplyKeyboardMarkup(resize_keyboard=True)
            initial_response = types.KeyboardButton('Попробуем другой сайт...')
            button.add(initial_response)
            bot.send_message(message.chat.id, '❗ Не удаётся получить прямое подключение с этим \
сайтом :(', reply_markup=button)

    except:
        button = types.ReplyKeyboardMarkup(resize_keyboard=True)
        initial_response = types.KeyboardButton('Попробуем ещё раз...')
        button.add(initial_response)
        bot.send_message(message.chat.id, '❗ Похоже, что вы ввели что-то не то :(', reply_markup=button)


def get_first_forbidden_words(message):

    global w
    global otv1
    w = message.text

    if w != '-':
        msg2 = bot.send_message(message.chat.id, 'А теперь вводите слова с новой строки или \
закончите ввод символом "-"', parse_mode='html')
        forbidden_words.append(w)
        bot.register_next_step_handler(msg2, get_forbidden_words)
    else:
        button = types.ReplyKeyboardMarkup(resize_keyboard=True)
        msg = bot.send_message(message.chat.id, 'В таком случае продолжим без "запретных слов"', parse_mode='html')
        yes = types.KeyboardButton('Да')
        no = types.KeyboardButton('Нет')
        button.add(yes, no)
        bot.send_message(message.chat.id, '?', reply_markup=button)
        otv1 = message.text
        bot.register_next_step_handler(msg, get_vibor2)


def get_vibor2(message):

    button = types.ReplyKeyboardRemove()
    global otv1
    global w
    global forbidden_words
    otv1 = message.text

    bot.send_message(message.chat.id, 'Чтож...', reply_markup=button)
    if otv1 == 'Да':
        forbidden_words.append('.')
        msg = bot.send_message(message.chat.id, '🔟 В таком случае вывожу 10 самых часто-встречаемых слов...', parse_mode='html')
        bot.send_message(message.chat.id, 'Отправьте любой символ, чтобы продолжить.', parse_mode='html')
        bot.register_next_step_handler(msg, general_parsing)
    elif otv1 == 'Нет':
        msg1 = bot.send_message(message.chat.id, 'Тогда введите слова, которые вы не \
хотите видеть в статистике. Введите первое слово или закончите ввод символом "-"', parse_mode='html')
        bot.register_next_step_handler(msg1, get_first_forbidden_words)
    else:
        err_msg = bot.send_message(message.chat.id, '❗ Вы ввели что-то не то...', parse_mode='html')
        w = ''
        bot.send_message(message.chat.id, 'Давайте составим список "запретныз слов" заново. Введите первое слово \
или закончите ввод символом "-"', parse_mode='html')
        bot.register_next_step_handler(err_msg, get_first_forbidden_words)
    

def get_forbidden_words(message):

    global forbidden_words
    global w
    global msg3
    if w != '-':
        w = message.text
        if w != '-':
            msg3 = bot.send_message(message.chat.id, '✏️ Введёте еще слова?', parse_mode='html')
            forbidden_words.append(w)
            bot.register_next_step_handler(msg3, get_vvod)
        else:
            button = types.ReplyKeyboardMarkup(resize_keyboard=True)
            msg1 = bot.send_message(message.chat.id, '✔️ Отлично!', parse_mode='html')
            initial_response = types.KeyboardButton('Ок')
            button.add(initial_response)
            bot.register_next_step_handler(msg1, get_slova)
            bot.send_message(message.chat.id, 'Давайте посмотрем введённые слова:', reply_markup=button)
    else:
        button = types.ReplyKeyboardMarkup(resize_keyboard=True)
        msg1 = bot.send_message(message.chat.id, '✔️ Отлично!', parse_mode='html')
        initial_response = types.KeyboardButton('Ок')
        button.add(initial_response)
        bot.register_next_step_handler(msg1, get_slova)
        bot.send_message(message.chat.id, 'Давайте посмотрем введённые слова:', reply_markup=button)


def get_vvod(message):

    global w
    global forbidden_words
    global msg3
    w = message.text

    if w != '-':
        forbidden_words.append(w)
        bot.register_next_step_handler(msg3, get_forbidden_words)
    else:
        button = types.ReplyKeyboardMarkup(resize_keyboard=True)
        msg1 = bot.send_message(message.chat.id, '✔️ Отлично!', parse_mode='html')
        initial_response = types.KeyboardButton('Ок')
        button.add(initial_response)
        bot.register_next_step_handler(msg1, get_slova)
        bot.send_message(message.chat.id, 'Давайте посмотрем введённые слова:', reply_markup=button)


def get_slova(message):

    global otv
    button = types.ReplyKeyboardRemove()
    bot.send_message(message.chat.id, 'Список:', reply_markup=button)

    for w in forbidden_words:
        bot.send_message(message.chat.id, w, parse_mode='html')

    button = types.ReplyKeyboardMarkup(resize_keyboard=True)
    yes = types.KeyboardButton('Да')
    res = types.KeyboardButton('Пересоздать список')
    add = types.KeyboardButton('Добавить в список')
    button.add(yes, res, add)
    bot.send_message(message.chat.id, 'Вас устраивают введённые слова', reply_markup=button)
    msg4 = bot.send_message(message.chat.id, '?', parse_mode='html')
    otv = message.text
    bot.register_next_step_handler(msg4, get_vibor)


def get_vibor(message):

    global otv
    global w
    otv = message.text
    button = types.ReplyKeyboardRemove()
    bot.send_message(message.chat.id, 'Чтож...', reply_markup=button)

    if otv == 'Да':
        msg = bot.send_message(message.chat.id, '🔟 В таком случае вывожу 10 самых часто-встречаемых слов...', parse_mode='html')
        bot.send_message(message.chat.id, 'Отправьте любой символ, чтобы продолжить.', parse_mode='html')
        bot.register_next_step_handler(msg, general_parsing)
    elif otv == 'Пересоздать список':
        msg1 = bot.send_message(message.chat.id, '🔠 Хорошо, пересоздаём список...', parse_mode='html')
        bot.send_message(message.chat.id, 'Отправьте любой символ, чтобы продолжить.', parse_mode='html')
        bot.register_next_step_handler(msg1, get_res)
    elif otv == 'Добавить в список':
        w = ''
        msg2 = bot.send_message(message.chat.id, '🆕 Тогда давайте добавим слова в список', parse_mode='html')
        bot.send_message(message.chat.id, 'Вводите слова, которые хотите добавить в список.', parse_mode='html')
        bot.register_next_step_handler(msg2, get_forbidden_words)
    else:
        err_msg = bot.send_message(message.chat.id, '❗ Вы ввели что-то не то...', parse_mode='html')
        bot.send_message(message.chat.id, 'Отправьте любой символ, чтобы вернкться к проверке списка.', parse_mode='html')
        bot.register_next_step_handler(err_msg, get_slova)


def get_res(message):

    msg = bot.send_message(message.chat.id, '🚮 Очищаю список...', parse_mode='html')
    global forbidden_words
    forbidden_words.clear()
    bot.register_next_step_handler(msg, get_first_forbidden_words)
    bot.send_message(message.chat.id, 'Введите первое слово или закончите ввод символом "-"', parse_mode='html')

def general_parsing(message):

    global all_Words
    i = 0
    g = -1
    filtered_Words = []
    cash_text = []

    for data in all_Words:
        i+=1
        g+=1
        if (data.find() is not None) and (i==1):
            cash_text.append(data.text)
            filtered_Words.append(data.text)
        else:
            try:
                if (data.find() is not None) and (cash_text[g-1] != cash_text[g]):
                    filtered_Words.append(data.text)
                    cash_text.append(data.text)
            except:
                cash_text.append(data.text)
            
    filtered_Words = str(filtered_Words).replace("\n", " ")
    filtered_Words = filtered_Words.replace(",", "").replace(".", "").replace("?", "").replace("!", "").replace(r"\n", " ")\
    .replace(r"\r","").replace(r"\t","").replace("«", "").replace("»", "").replace("=", "").replace("-","")\
    .replace("_", "").replace("0","").replace("1","").replace("2","").replace("3","").replace("4","").replace("5","")\
    .replace("6","").replace("7","").replace("8","").replace("9","").replace("/","").replace(":","").replace("+", "")\
    .replace("—", "").replace("↑", "").replace(r"\xa", "").replace("%", "")
    filtered_Words = filtered_Words.lower()
    words = filtered_Words.split()
    words.sort()

    for word in words:
        for w in forbidden_words:
            try:
                words.remove(w)
            except:
                continue

    word_counter = {}

    for w in forbidden_words:
        for word in words:
            if word in word_counter:
                word_counter[word] += 1
            else:
                word_counter[word] = 1
    
    popular_words = sorted(word_counter, key = word_counter.get, reverse = True)
    top_10 = popular_words[:10]
    bot.send_message(message.chat.id, '✅ 10 самых часто-встречаемых слов на странице:')
    bot.send_message(message.chat.id, '\n'.join(top_10))
    bot.send_message(message.chat.id, 'Если хотите попробовать еще раз, то введите комманду "/start"')

bot.polling()