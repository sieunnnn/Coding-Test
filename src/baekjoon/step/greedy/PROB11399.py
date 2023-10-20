# 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램 작성


# 사람의 수
N = int(input())

# 사람 당 걸리는 시간 입력받기
times = list(map(int, input().split()))

times.sort()


sum = 0

for i in range(N):
    for j in range(i + 1):
        sum += times[j]

print(sum)