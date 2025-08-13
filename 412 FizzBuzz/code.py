

def fizz_buzz(n: int):
    if not isinstance(n, int):
        print("Type must be Integer")

    answer = []

    for i in range(1, n):
        divisibleBy3 = i % 3 == 0
        divisibleBy5 = i % 5 == 0

        currStr = ""

        if divisibleBy3:
            currStr += "Fizz"
        if divisibleBy5:
            currStr += "Buzz"
        if not currStr:
            currStr += str(i)
        answer.append(currStr)

    return answer


"""
    Time Complexity = O(n)
    Space Complexity = O(1)
"""


print(fizz_buzz(16))
