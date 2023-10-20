# 한 개의 회의실이 있는데 이를 사용하고자 하는 N 개의 회의에 대하여 회의실 사용표를 만든다.
# 회의 I 는 시작 시간과 끝나는 시간이 공백을 기준으로 주어진다.
# 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 간주
# 최대 사용할 수 있는 회의의 최대 개수를 출력한다.


# N 입력받기
N = int(input())

# 회의 정보 입력받기
conferences = []

for i in range(N):
    conferences.append(list(map(int, input().split())))

# 회의 정렬
conferences.sort(key = lambda x : x[0])
conferences.sort(key = lambda x : x[1])

# 최소 개수 찾기
count = 1
end = conferences[0][1]

# 첫번째 인덱스부터 비교 시작하므로 범위 조심하기
for i in range(1, N):
    if conferences[i][0] >= end:
        count += 1
        end = conferences[i][1]

print(count)