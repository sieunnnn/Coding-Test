# 첫 줄에 테스트 케이스의 개수 T 가 주어진다. A + B 를 한 줄에 하나씩 순서대로 출력한다.

import sys

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)
