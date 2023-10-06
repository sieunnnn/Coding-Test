# 괄호 문자열은 두 개의 괄호 기호인 '(' 와 ')' 만으로 구성되어 있는 문자열이다.
# 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열이라고 부른다.
# 한 쌍의 괄호 기호로 된 "()" 문자열은 기본 VPS 라고 부른다. 만일 x 가 VPS 라면 이것을
# 하나의 괄호에 넣은 새로운 문자열 "(x)" 도 VPS 가 된다.
# 그리고 두 VPS x 와 y 를 접합시킨 새로운 문자열 xy 도 VPS 가 된다.

# T 입력받기
T = int(input())

# 테스트 케이스 만큼 문자열 입력받기
for i in range(T) :
    str = input()
    stack = list(str)
    sum = 0

    # 리스트의 문자 확인하고 sum 증감하기
    for j in stack :

        if j == ')' :
            sum -= 1
        elif j == '(' :
            sum += 1

        if sum < 0 :
            print("NO")
            break

    if sum > 0 :
        print("NO")
    elif sum == 0 :
        print("YES")
