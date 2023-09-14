# 두 정수 A 와 B 를 입력받은 다음, A+B 를 출력하는 프로그램을 작성하세요.

T = int(input())


for i in range(1, T + 1):
    A, B = map(int, input().split())
    print(A +  B)
