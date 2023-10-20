# 준규가 가지고 있는 동전은 총 N 종류이고, 각각의 동전을 매우 많이 가지고 있다.
# 동전을 적절히 사용해서 그 가치의 합을 K  로 만들려고 한다. 이때 필요한 동전 개수의
# 최솟값을 구하는 프로그램을 작성하시오.
# 입력의 둘째 줄 부터 동전의 가치가 오름차순으로 주어진다.

# N 과 K 을 공백을 기준으로 입력받는다.
N, K = map(int, input().split())

# 동전의 가치 입력 받기
coins = []
for i in range(N):
    coins.append(int(input()))

# K 를 만들기 위해 필요한 동전 개수의 최솟값 구하기
coins.sort(reverse = True)
count = 0

for coin in coins:
    count += K // coin
    K %= coin

    if (K // coin < 1):
        continue

print(count)