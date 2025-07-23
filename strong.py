import math

def is_strong_number(num):
    """
    Checks if a given number is a strong number.
    A strong number is a number whose sum of the factorial of its digits is equal to the number itself.
    """
    if num < 0:
        return False
    
    original_num = num
    sum_of_factorials = 0
    
    # Calculate the sum of factorials of digits
    while num > 0:
        digit = num % 10
        sum_of_factorials += math.factorial(digit)
        num //= 10
        
    return sum_of_factorials == original_num

def print_strong_numbers_in_range(start, end):
    """
    Prints all strong numbers within a specified range (inclusive).
    """
    print(f"Strong numbers from {start} to {end}:")
    for number in range(start, end + 1):
        if is_strong_number(number):
            print(number)

# Call the function to print strong numbers from 1 to 5000
print_strong_numbers_in_range(1, 5000)