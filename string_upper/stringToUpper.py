__author__ = 'khalid'

import time

start = time.time()
for x in range(0, 100000):
    f = open('text', 'r')
    f2 = open('text2', 'w')

    for line in f:
        newline = line.upper()
        f2.write(newline)

    f.close()
    f2.close()

end = time.time()

print end - start
