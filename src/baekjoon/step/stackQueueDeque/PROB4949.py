# 문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.
# 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
# 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
# 모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
# 모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
# 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.


import sys

while True :
    # 문자열 입력받기
    str = sys.stdin.readline().rstrip()

    # str 검사하면서 stack 리스트에 괄호 넣기
    stack = []

    if str == "." :
        break

    for i in str :
        if i == '(' or i == '[' :
            stack.append(i)

        elif i == ')' :
            if len(stack) != 0 and stack[-1] == '(' :
                stack.pop()

            else :
                stack.append(i) # stack 의 길이가 0 이 되는 것을 방지
                break

        elif i == ']':
            if len(stack) != 0 and stack[-1] == '[' :
                stack.pop()

            else:
                stack.append(i)
                break

    if len(stack) == 0 :
        print("yes")
    else :
        print("no")