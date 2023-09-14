# 셀프넘버: 숫자에 각 자리수를 더하는 함수
# d(75) = 75 + 7 + 5 = 87

numbers = set(range(1, 10001))
is_generated_numbers = set()

for i in range(1, 10001):   # i = 75
    for j in str(i):    # j = 7, 5
        i += int(j)     # i = 75 + 7 + 5
    is_generated_numbers.add(i)

self_numbers = sorted(numbers - is_generated_numbers)
for i in self_numbers:
    print(i)
