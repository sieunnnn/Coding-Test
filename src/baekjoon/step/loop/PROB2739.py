# N 을 입력 받은 뒤, 구구단 N 단을 출력하는 프로그램을 작성하시오.

N = int(input())

for i in range(1, 10):
    print("{0} * {1} = {2}".format(N, i, (N * i)))

