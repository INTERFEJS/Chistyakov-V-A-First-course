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

@bot.message_handler(commands=['start'])
def start(message):
    first_text = f'Привет, <b>{message.from_user.first_name}</b>.'
    sec_text = '👨‍💻 Я считаю 10 самых часто встречаемых слов на странице и готов организовать список слов, \
которые не учитываются в статистике.'
    bot.send_message(message.chat.id, first_text, parse_mode='html')
    button = types.ReplyKeyboardMarkup(resize_keyboard=True)
    initial_response = types.KeyboardButton('Хорошо, начнём!')
    button.add(initial_response)
    bot.send_message(message.chat.id, sec_text, reply_markup=button)


@bot.message_handler()
def user_text(message):
    if message.text == 'Хорошо, начнём!' or message.text == 'Попробуем еще раз...':
        button = types.ReplyKeyboardRemove()
        set_link = bot.send_message(message.chat.id, '🌐 Отправьте мне ссылку на страницу.', reply_markup=button)
        bot.register_next_step_handler(set_link,get_url)

def get_url(message):

    global all_Words
    global url
    global all
    all = ['aaa', 'aedds', 'fdfdfr']
    url = message.text
    page = requests.get(url)
    soup = BeautifulSoup(page.text, 'html.parser')
    all_Words = soup.findAll()
    bot.send_message(message.chat.id, test, parse_mode='html')
    #bot.register_next_step_handler(msg, test)


def test(message):
    for i in all: 
        bot.send_message(message.chat.id, i, parse_mode='html')

        #try:
          #  url = message.text
           # page = requests.get(url)
        #except:
         #   button = types.ReplyKeyboardMarkup(resize_keyboard=True)
          #  initial_response = types.KeyboardButton('Хорошо, начнём!')
           #bot.send_message(message.chat.id, 'Похоже, что вы ввели что-то не то :(', reply_markup=button)


bot.polling()