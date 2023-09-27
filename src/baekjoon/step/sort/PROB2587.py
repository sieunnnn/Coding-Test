# 다섯개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
import math

# 수를 담을 배열 생성
numbers = []

# 다섯개의 자연수 입력받기
for i in range(5) :
    numbers.append(int(input()))

print(math.floor(sum(numbers) / 5))
print(sorted(numbers)[2])