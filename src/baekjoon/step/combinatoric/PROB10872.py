# 팩토리얼을 재귀함수로 짜보자


# 재귀함수
def factorial(N):
    if N == 0:
        return 1

    return N * factorial(N-1)

# N 을 입력받자
N = int(input())

# 결과를 출력해보자
print(factorial(N))
