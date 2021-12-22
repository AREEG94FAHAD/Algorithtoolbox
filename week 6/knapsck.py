import numpy as np
first_line = input()
#  convert first line to weight and number of gold
first_lineToarray = first_line.split(' ')
w = int(first_lineToarray[0])
nw = int(first_lineToarray[1])

arr = np.zeros((nw, w+1))

second_line = input().split(' ')
weights = [int(x)for x in second_line]

weights.sort(reverse=True)

value = 0
for i in range(nw):
    for j in range(1, w+1):
        if weights[i] <= j:
            value = weights[i]
            valuerem = j-weights[i]
            arr[i][j] = max(value+arr[i-1][valuerem], arr[i-1][j])


print(int(arr[-1][-1]))
