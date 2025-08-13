
def number_of_steps(num: int):
  if not isinstance(num, int):
    print("Type must be Integer")
  
  steps = 0
  while num > 0 :
    if num%2 == 0:
      num /=2
    else:
      num -=1
    
    steps += 1
  
  return steps

"""
  Time Complexity = O(logn)
  Space Complexity = O(1)
"""


print(number_of_steps(15))



# Bitwise Approach

def number_of_steps_bitwise(num: int):
  if not isinstance(num, int):
    print("Type must be Integer")
  
  steps = 0
  while num > 0 :
    if (num & 1) == 0:
      num >>= 1
    else:
      num -=1
    
    steps += 1
  
  return steps

"""
  Time Complexity = O(logn)
  Space Complexity = O(1)
"""

print(number_of_steps_bitwise(32))
