# 입력받은 식에 괄호를 적절히 쳐서 식의 값을 최소로 만들기


# 문자열 입력받기
str = input().split('-')

# 숫자 저장하는 배열
numbers = []

# + 가 포함된 요소를 찾아서 나누고 덧셈 처리 하기
for i in str:
    number = 0
    temp = i.split('+')

    for j in temp:
        number += int(j)

    numbers.append(number)

# 완성된 리스트에서 0 번째 수에서 나머지 빼주기
result = numbers[0]

for i in range(1, len(numbers)):
    result -= numbers[i]

print(result)