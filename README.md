# Horror_zoo


## Casual Use Case and Domain Model of Little Animal Horror Zoo
Groupe Pizza - Martin, Kasper og Mads

Title:	Play Game\
Primary Actor: Player  	
Main Success Scenario:
Player starts game  
Player gives input to Snake to move and game displays position info.\
Snake moves one square in given direction\
System moves Rabbit 1 square i random direction\
Repeat a and b until Snake is beside Rabbit, Game display rabbit talks\
Player moves Snake to same square as Rabbit\
Snake eats Rabbit\
Game display victory!\ 
Games ends and data gets sent to developers\     

Alternative Flow (Extensions)

At all times, if the system fails:
Show error message 
Reset game
Send crash data to developers

At all times, if incorrect input is recieved
show error message and go back to input screen.

3A. Rabbit/Snake is next to game area wall and tries to move past the wall:
Moves Rabbit/Snake to other side of board (Periodiske Randbetingelser)

3B. Snake doesn’t catch Rabbit in allowed moves:
Move counter exceeded 
Send Game Over message
Reset game



## Use-Case-Diagram

![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/Use%20Case%20Diagram.jpg)

## Class Model

![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/Class%20Model.jpg)

## Domain Model

Nouns - (navneord) - Class/attribut:

Player
Game
Snake
Direction	- attribut 
Square	- attribut 
Rabbit
Victory 	- action
Error		- action
Counter	- attribut 


Verbs - (Udsagnsord) - Methods: 

Starts
Display
Gives input
Talks
Moves
Eats


![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/domain%20model.jpg)
