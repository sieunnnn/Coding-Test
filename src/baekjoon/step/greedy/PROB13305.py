# 1 km 당 1 L 의 기름을 사용한다.

# 도시의 개수 입력
city_num = int(input())

# 도로의 길이
roads = list(map(int, input().split()))

# 주유소의 리터당 가격
prices = list(map(int, input().split()))


# 최솟값 구하기
result = 0
min = prices[0]

# 마지막 도시의 가격은 필요 없으므로 -1
for i in range(city_num -1) :
    if prices[i] < min :
        min = prices[i]

    result += min * roads[i]

print(result)