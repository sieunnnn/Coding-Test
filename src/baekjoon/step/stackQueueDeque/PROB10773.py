# 재현이는 잘못된 수를 부를 때마다 0 을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 한다.
# 재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다.
# 재민이를 도와주자!


import sys

# 수의 개수 입력받기
K = int(input())

# 스택 리스트 생성
stack =[]

# 수의 개수만큼 재현이가 외친 수 입력받기
for i in range(K) :
    num = int(sys.stdin.readline())

    if num == 0 :
        stack.pop()
    else :
        stack.append(num)

print(sum(stack))