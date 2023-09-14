# 단어가 몇개의 크로아티아 알파벳으로 이루어져 있는지 출력
# 아래는 특수한 형태의 알파벳이고, 나머지는 영어 알파벳과 같다.

croatia_alphabet = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

word = input()

for i in croatia_alphabet:
    word = word.replace(i, '#')

print(len(word))
