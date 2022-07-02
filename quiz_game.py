print("Hey, welcome to my PC game!")

play = input("Do you want to play? ")
if play != "yes": #if the user does not want to play then
    quit() #quit the game
print("cool, Let's play.")
score = 0

ans = input("What does GPU stands for? ")
if ans.lower() == "graphics processing unit": #.lower() can be applied to user's input
    print("Yas, Correct!")
    score += 1
else:
    print("Sorry, WRONG!")

ans = input("What does RAM stands for? ").lower() # .lower() can also be applied after input()
if ans == "random access memory":
    print("Yas, Correct!")
    score += 1
else:
    print("Sorry, Wrong!")

ans = input("What does PSU stands for? ")
if ans == "power supply unit":
    print("Yas, Correct!")
    score += 1
else:
    print("Sorry, Game Over")

print("You got " + str(score) + " questions correct!") # the number of questions correct
print("You got " + str((score/4) * 100) + " %!") # the percentage fo questions correct
