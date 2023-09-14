# A 와 B 를 입력받은 다음, A + B 를 출력하는 프로그램을 작성하시오.

while(True):
    A, B = map(int, input().split())

    if A == 0 and B == 0:
        break

    print(A + B)