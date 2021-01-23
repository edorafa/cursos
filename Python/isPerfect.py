def getFactors(x):

    num_factors = []
    max = int(x/2) + 1
    for i in range(1, max):
        if (x % i == 0):
            num_factors.append(i)
    return num_factors

def isPrime(x):
    return len(getFactors(x)) == 2

def isComposite(x):
    return False if isPrime(x) else True

def isPerfect(x):
    if sum(getFactors(x)) == ((x)):
        return True
    else:
        return False

def main():

    playing = True

    while playing == True:

        num_input = input('Give me a number from 1 to 10000.  Type -1 to exit. ')

        try:
            num = int(num_input)

            if (num == -1):
                playing = False
                continue

            if (num <= 0 or num > 10000):
                continue

            factors = getFactors(num)
            print("The factors of", num, "are", factors)

            if isPrime(num):
                print(str(num) + ' is prime')
            if isComposite(num):
                print(str(num) + ' is composite')
            if isPerfect(num):
                print(str(num) + ' is perfect')

        except ValueError:
            print('Sorry, the input is not an int.  Please try again.')

main()