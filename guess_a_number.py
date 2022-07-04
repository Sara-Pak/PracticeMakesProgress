import random

top_of_range  = input('Type a number: ') 
#random_number = random.randrange(-5, 11) # (start, end)

if top_of_range.isdigit():
    top_of_range = int(top_of_range)

    if top_of_range <= 0:
        print('Please type a number larger than zero next time.')
        quit()
    else:
        print('Please type a number next time.')
        quit()

random_number = random.randint(0, top_of_range) # (bottom range, top range)

while True: # while user_guess != random_number: (another option/method)
    guesses += 1
    user_guess = input("Make a guess: ")
    if user_guess.isdigit():
        user_guess = int(user_guess)
    else:
        print('Please type a number next time.')
        continue
    if user_guess == random_number:
        print("You got it!")
    else:
        if user_guess > random_number:
            print("You were above the number!")
        else:
            print("You were belove the number!")

print("You got it in ", str(guesses) + "guesses")