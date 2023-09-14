# 두 정수 A 와 B가 주어졌을 때, A 와 B 를 비교하는 프로그램을 작성하시오.

A, B = map(int, input().split())

if (A > B) :
    print(">")
elif (A < B) :
    print("<")
elif (A == B) :
    print("==")