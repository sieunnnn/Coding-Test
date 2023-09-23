# 제일 작은 종말의 수 : 666
# 종말의 수 : 어떤 수에 6이 적어도 3개 이상 들어가는 수
# N 은 10000 보다 작거나 같은 수이다.


# N 입력받기
N = int(input())

# N 번째로 작은 종말의 숫자 구하기
number = 666
count = 0

while True :
    if "666" in str(number) :
        count += 1

    if count == N :
        print(number)
        break

    number = number + 1