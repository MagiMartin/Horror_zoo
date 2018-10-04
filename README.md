# Horror_zoo
Groupe Pizza - Martin, Kasper og Mads

## Casual Use Case of Little Animal Horror Zoo

### Title:	Play Game<br/>

### Primary Actor: Player <br/> 	

### Main Success Scenario:<br/>
1. Player starts game  <br/>
2. Player gives input to Snake to move, and game displays position info.<br/>
    1. Snake moves one square in given direction<br/>
    2. System moves Rabbit 1 square i random direction<br/>
3. Repeat a and b until Snake is beside Rabbit, Game display rabbit talks<br/>
4. Player moves Snake to same square as Rabbit<br/>
5. Snake eats Rabbit<br/>
6. Game display victory!<br/> 
7. Games ends and data gets sent to developers<br/>     

### Alternative Flow (Extensions)

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

### Nouns - (navneord) - Class/attribut:<br/>

Player<br/>
Game<br/>
Snake<br/>
Direction	- attribut<br/> 
Square	- attribut <br/>
Rabbit<br/>
Victory 	- action<br/>
Error		- action<br/>
Counter	- attribut <br/>


### Verbs - (Udsagnsord) - Methods: <br/>

Starts<br/>
Display<br/>
Gives input<br/>
Talks<br/>
Moves<br/>
Eats<br/>


![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/domain%20model.jpg)
