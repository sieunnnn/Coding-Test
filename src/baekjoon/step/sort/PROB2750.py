# N 개의 수가 주어졌을때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오


# N 입력받기
N = int(input())

# 수를 담을 리스트 생성
numbers = []

# N 만큼의 수를 리스트에 더하기
for i in range(N) :
    numbers.append(int(input()))

print(*sorted(numbers), sep='\n')