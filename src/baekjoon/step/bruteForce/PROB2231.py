# 어떤 자연수 N 이 있을 때, 그 자연수 N 의 분해합은 N 과 N 을 이루는 각 자리수의 합을 의미한다.
# 어떤 자연수 M 의 분해합이 N 인 경우, M 을 N 의 생성자라고 한다.
# 어떤 자연수의 경우에는 생성자가 없을 수도 있다. (이때는 0 을 출력한다 .)
# 반대로, 생성자가 여러개인 자연수도 있을 수 있다. (이때는 가장 작은 생성자 출력한다.)


# 자연수 N 입력받기
N = int(input())

for i in range(1, N + 1):
    # 각 자리 숫자를 배열로 변환
    numbers = list(map(int, str(i)))
    # 분해합 구하기
    result = i + sum(numbers)

    # 분해합과 N 이 같다면 i 는 N 의 생성자 이다.
    if result == N :
        print(i)
        break

    # i 와 N 이 같다면 N 의 생성자는 존재하지 않는다.
    if i == N :
        print(0)