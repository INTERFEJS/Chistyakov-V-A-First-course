def get_words_dict(words):
    words_dict = dict()
 
    for word in words:
        if word in words_dict:
            words_dict[word] = words_dict[word] + 1
        else:
            words_dict[word] = 1
    return words_dict


#words_dict = get_words_dict(words)
#print(f"Кол-во слов: {len(words)}")
#print(f"Кол-во уникальных слов: {len(words_dict)}")
print("Все использованные слова:")
#for word in words_dict:
#    print(word.ljust(20), words_dict[word])