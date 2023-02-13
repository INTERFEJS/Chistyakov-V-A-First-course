from bs4 import BeautifulSoup
import requests


url ='https://text.ru/seo'
page = requests.get(url)
all_Words = []
forbidden_words = []
soup = BeautifulSoup(page.text, 'html.parser')
all_Words = soup.findAll()


def get_forbidden_words():

    w = input('запр слова')
    forbidden_words.append(w)
    while w!='stop':
        if w != 'stop':
            w = input('запретные слова через этр: ')
            forbidden_words.append(w)
        else:
            break

get_forbidden_words()


def general_parsing():

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
    .replace(r"\r","").replace(r"\t","").replace("«", "").replace("»", "").replace("-", "")
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
    print(top_10)
    
general_parsing()