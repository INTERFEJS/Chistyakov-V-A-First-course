import requests

url = 'https://www.gosuslugi.ru'
headers = {'user-agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36'}
r = requests.get(url, headers=headers)
for i, each in enumerate(r.history, 1):
    print(f'{i} {each.status_code} {each.url}')