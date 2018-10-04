# Horror_zoo
Groupe Pizza - Martin, Kasper og Mads

## Casual Use Case of Little Animal Horror Zoo

### Title:	Play Game<br/>

### Primary Actor: Player <br/> 	

### Main Success Scenario:<br/>
1. Player starts the game  <br/>
2. Player gives input to the Snake to move. The game displays current position info.<br/>
    1. Snake moves one square in given direction<br/>
    2. System moves Rabbit 1 square i random direction<br/>
3. Repeat a and b until the Snake is besides the Rabbit, Game displays the Rabbit begging for mercy<br/>
4. Player moves the Snake to the same square as the Rabbit<br/>
5. Snake eats the Rabbit<br/>
6. Game display a victory screen<br/> 
7. Games ends and data gets sent to developers<br/>     

### Alternative Flows (Extensions)

* At all times, if the system fails:<br/> 
        * Show error message <br/> 
        * Reset game<br/> 
        * Send crash data to developers<br/> 

* At all times, if incorrect input is recieved:<br/> 
        * Show error message and go back to input screen.<br/> 

3a. If the rabbit or the snake is next to a game area wall and tries to move past the wall:<br/> 
        1. the game will move the snake or rabbit to the other side of the board (Floating edges)


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
