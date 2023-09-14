# R : 뒤집기 1,2,3,4 -> 4,3,2,1
# D : 버리기 / 첫번째 수를 버리는 함수이다.


from collections import deque
import sys


# 테스트 케이스 입력받기
T = int(input())

# 결과
result =''

for i in range(T) :
    p = sys.stdin.readline().rstrip()
    n = int(input())
    # , 를 기준으로 자른 문자열을 배열로 만든다.
    arr = sys.stdin.readline().rstrip()[1:-1].split(",")

    # 덱 구현
    dq = deque(arr)

    # reverse 를 얼마나 해야하나?
    reverse = 0

    if n == 0 :
        dq = []

    for j in p :
        if j == 'R' :
            reverse += 1

        elif j == 'D' :
            if not dq :
                print("error")
                break
            else :
                # 반전을 2번 했다면 그대로 이므로 popleft()
                if reverse % 2 == 0 :
                    dq.popleft()

                else :
                    dq.pop()
    else :
        if reverse % 2 == 0 :
            print("[" + ",".join(dq) + "]")

        else :
            dq.reverse()
            print("[" + ",".join(dq) + "]")