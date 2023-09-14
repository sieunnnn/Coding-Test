# 두 정수 A 와 B 를 입력받은 다음, A + B 를 출력하는 프로그램을 작성하시오.
# 첫째 줄에 테스트 케이스의 개수  T 가 주어진다.
# 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A 와 B 가 주어진다.
# 출력 : "Case #x: A + B = C" (번호는 1 부터 시작한다.)

import sys

T = int(input())

for i in range(1,T + 1):
    A, B = map(int, sys.stdin.readline().split())
    print("Case #{0}: {1} + {2} = {3}".format(i, A, B, A + B))
