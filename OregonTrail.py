from cmath import e

print("Welcome to my Oregon Trail | Drinking Game!")
leader_name = input("What is the name of your Wagon Leader?")
age = int(input("what is your age?"))
print("Hey, There's no way you're", age, "years old!!")

if age >= 21:
    print("Okies", leader_name,", Let's get this party started! SHOTS SHOTS SHOTS! JK >_>")
    will_play = input("Ready? Hope you're thirsty! (yes/no)").lower() #automatically input user's answer all lowercase.
    if will_play == "yes":
        print("Aiight! Let's gooooo!")
        
        #set health points
        health_pt = 10
        print("You will start with",health_pt, "health points!")
        print("Each point lost is a Shot taken!")
        
        '''#weapon choice
        weapon = "gun" or "butterfly knife"
        self_defense  = "ghostpepper spray"
        weapon_answer = input("Secondly, choose yo weapon: gun, butterfly knife, or ghostpepper spray! (gun/butterfly knife/ghostpepper spray)")
        '''

        #add questions 
        first_answer = input("On the way home, there's an accident ahead.. do you want to stay or take backroads? (stay/backroads)")
        if first_answer == "backroads":
            ans = input("Noice, you take the next turn and drove pass a gas station... Do you pull into the gast station? (yes/no)")
            if ans  == "yes":
                print("You went into the gas station: got gas and got hella snacks for the road.")
            elif ans == "no":
                print("Oof! You realize later that you're getting the munchies, you've lost 1 health points. Take a SHOT!")
                health_pt -= 1 #lost 5 health points

            ans = input("10 miles out, you noticed you could stay on business route or take the hight way. Which way do you go? (business/highway)")
            if ans == "business":
                print("You get hit with every red light.. You've lost 1 health points, Take a SHOT!")
                health_pt -= 1 #lost 5 health points

                if health_pt <= 0:
                    print("You have no health points, Game over")
            else: 
                print("Huzzah! You made it home, everyone else takes a SHOT!")
        else:
            print("You got hijacked and lost - Take TWO Shots!")

    if will_play == "no":
        print("Aiight then, BBaiiiii~!")
elif age <=10:
    print("Well dang, okay", leader_name, "sorry, guess you'll be playing Roblox or something else.")
