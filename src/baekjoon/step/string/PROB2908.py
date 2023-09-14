# 첫째 줄에 상근이가 칠판에 적은 두 수 A 와 B 가 주어진다. 두 수는 같이 않은 세 자리 수이다.
# 상근이는 두 수를 거꾸로 읽는다.
# 거꾸로 읽은 두 수를 비교해서 더 큰 수를 출력 해야 한다.

A, B = map(str, input().split())

num1 = int(A[::-1])
num2 = int(B[::-1])

if num1 > num2:
    print(num1)
else:
    print(num2)