# 30 명 중에 과제 안 낸 사람 찾기

import sys

students = []

# 1 - 30 까지의 list
for i in range(1, 31, 1):
    students.append(i)

submits = []

# 제출한 학생 수
for i in range(1, 29):
    submits.append(int(sys.stdin.readline()))

submits.sort()

for student in students:
    if student not in submits:
        print(student, end="\n")