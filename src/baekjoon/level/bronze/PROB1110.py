# 먼저 주어진 수가 10 보다 작다면 앞에 0 을 붙여 두자리 수로 만들고, 각 자리의 숫자를 더한다.
# 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리수를 이어 붙이면
# 새로운 수를 만들 수 있다.

# 시간초과 나온 코드
# N =input()
# new = N
# count = 0
#
# while(True):
#     new = new[-1] + str(int(new[0]) + int(new[1]))[-1]
#     count += 1
#
#     if(new == N):
#         print(count)
#         break

N = int(input())
temp = N
count = 0

while(True):
    a = temp // 10 # 소수점 버리고 정수부분만 취한다.
    b = temp % 10
    c = (a + b) % 10
    temp = (b * 10) + c

    count += 1
    if(temp == N):
        print(count)
        break