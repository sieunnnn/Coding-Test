# 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
# 여러개 존재하는 경우에는 ? 를 출력한다.

words = input().upper()

# set() 함수를 이용 하여 입력받은 문자열의 중복값을 제거한다.
uniq_words = list(set(words))

# 각 단어가 몇번 나왔는지 저장하는 리스트
cnt_lst = []

for x in uniq_words :
    cnt = words.count(x)
    cnt_lst.append(cnt)

# count 값의 중복 여부를 판단하는 조건문
# 값이 중복이라면
if cnt_lst.count(max(cnt_lst)) > 1 :
    print('?')
# 값이 중복이 아니라면
else :
    max_index = cnt_lst.index(max(cnt_lst))
    print(uniq_words[max_index])