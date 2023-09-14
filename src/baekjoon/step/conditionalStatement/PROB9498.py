# 시험 점수를 입력받아 90~100 점은 A, 80~89 점은 B, 70~79 점은 C, 60~69 점은 D,
# 나머지 점수는 F 를 출력하는 프로그램을 작성하시오.

score = int(input())

if (90 <= score <= 100) :
    print("A")
elif (80 <= score < 90) :
    print("B")
elif (70 <= score < 80) :
    print("C")
elif (60 <= score < 70) :
    print("D")
else :
    print("F")