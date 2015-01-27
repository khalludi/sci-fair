__author__ = 'khalid'

import time

start = time.time()


def calc_pi():
    counter = 1L
    Ret = 0.0
    i = 1

    while counter <= 1000000000:
        if counter % 2 != 0:
            Ret += 4.0 / i
        else:
            Ret -= 4.0 / i

        counter += 1
        i += 2

    return Ret

print "The calculated value of pi is ... \n"
print calc_pi()

end = time.time()

print "\n"
print end - start

