import random as rd

N,K = input().split()
N = int(N); K= int(K)

B = list(map(int, input().split()))

A = sorted(A); B= sorted(B)

j = 0
for i in range(K):
    A[i], B[j-1] = B[j-1], A[i]
    j-=1


sum(A)
