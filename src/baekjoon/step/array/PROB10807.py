# 총 N 개의 정수가 주어졌을 때, 정수 v 가 몇 개 인지 구하는 프로그램을 작성하시오.
import sys

N = int(input())
lst = list(map(int, sys.stdin.readline().split()))
v = int(input())
print(lst.count(v))