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

* (3a flow) If the rabbit or the snake is next to a game area wall and tries to move past the wall:<br/> 
    * the game will move the snake or rabbit to the other side of the board (Floating edges)


## Use-Case-Diagram

The use-case diagram displays the single use-case shown above.
The primary actor, the player interacts with the system, and goes throught the play game scenario.<br/>
<br/>
The supporting actor provdies a service to the system, which would be the developers. They maintain and fix errors if there should be any, they also monitor the usage of their system.<br/>
<br/>
The offstage actor would have an interest in the system. In this case it could be the teachers as they wish to see the project.<br/>
In terms of a product it could be the publisher of the system as they wish for it to have success but they have no direct say in what is being developed.

![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/Use%20Case%20Diagram.jpg)

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

## Class Model

![alt text](https://raw.githubusercontent.com/MagiMartin/Horror_Zoo/master/Class%20Model.jpg)
