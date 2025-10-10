import random

def get_range(range):

numbers = []
for i in range(10):
    numbers.append(random.int(1, 50))
print("Random list", numbers)

def get_length (length):
length = 0
for _ in numbers:
    length += 1
print("Length", length)


def get_sum(sum):
even_sum = 0
for i in range(0, length, 2):
    even_sum += numbers[i]
print("Sum of even positions", even_sum)


def get_odd(odd):
odd_sum = 0
for i in range(1, length, 2):
    odd_sum += numbers[i]
print("Sum of odd positions", odd_sum)

def get_multiple(multiple):
third_mult = 1
for i in range(2, length, 3):
    third_mult *= numbers[i]
print("Product of every third position", third_mult)

def get_total(total):
total = 0
for num in numbers:
    total += num
average = total / length
print("Average", average)