def check_fibonacci(number):
    first_number = 0
    second_number = 1
    while(first_number<=number):
        if(number == second_number or number == first_number):
            print("It's a fibonacci number")
            return None
        temp = second_number
        second_number = first_number+second_number
        first_number = temp
    print("Not Fibonacci number")
    return None


n = int(input("Input a Number : "))
check_fibonacci(n)