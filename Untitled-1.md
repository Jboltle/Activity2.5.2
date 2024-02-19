Current layout: 1 Panel without tree
Instructions
Instructions
Unit 2.5
Phrase Solver Game
Activity 2.5.2
To program your Phrase Solver Game, you will convert your UML diagram to code, focusing first on the attributes.
Compare the provided Board class definition with your UML. Match up any attributes to the provided code at this point.
Transfer each attribute in your UML diagram to the Player and PhraseSolver classes. After defining all of the data for the program, you will write the constructors and methods.
All instances of an object have their own set of instance attributes. This creates a “has-a” relationship between the object and its instance variables. In short, each instance of an object has its own copies of the variables. For example, a player has-a name and a board has-a phrase.
When no constructor is written, Java provides a no-argument constructor, and the instance variables are set to their default values.
Primitive instance variables get a default value of 0 at object creation time.
Also, any object reference that is an instance variable that is not explicitly initialized will have a value of null. Class methods must be written to account for this default null value.
In each of the three classes, add a no-argument constructor using the name of the class for the name of the constructor.
In Board and PhraseSolver classes, add code to each constructor to set the initial instance state of all variables.
Initialize numbers to 0, booleans to False, Strings to the empty string, and all other objects to null.
In the Player class, add code to the constructor to prompt the user to input the player’s name and save that to the instance variable. In the constructor, print a message welcoming the player by name to the game.
code
In the Player class, after the public Player() constructor, add a new constructor that takes a String parameter called inputName.
alt text
Add code to this new constructor to initialize name to inputName and points to 0. Print a message welcoming the player by name to the game.
Initialize the instance variable points to 0 in both constructors.
You should now have two ways to set the player name.
Modify the constructor for the Board class.
a. The solvedPhrase attribute stays as the empty string.
b. Use the provided loadPhrase method to initialize the attribute phrase (See note below).
c. Replace your initialization of currentLetterValue with a call to setLetterValue. Notice this method does not return a value.
d. For testing purposes, add the following line of code at the end for testing. (You will remove this line in your final program.)
System.out.println("Phrase: " + phrase); //temp test code
Note: The method loadPhrase returns the phrase directly from the phrase.txt file. Then, it initializes solvedPhrase with underscores for letters and spaces in between the letters. (i.e. “This Phrase” becomes:
“_ _ _ _    _ _ _ _ _”
Modify the constructor for the PhraseSolver class:
a. Create two players, calling the correct constructor so they can supply their own names.
b. Initialize the board.
c. Confirm the Boolean instance variable that stores the state of the game (solved or unsolved) is initialized to false.
Note
This code will be used in future activities.
Future activities will be listed below here
Mark as CompletedBack to dashboard