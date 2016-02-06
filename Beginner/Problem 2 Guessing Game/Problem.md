#The Guessing Game

Create a guessing game where a user inputs a number between 0 and x (x will be a final variable defined as your max number), if they guess the wrong number the program must tell them to guess higher or lower. The limit of guesses the user has is three, and if the user guesses correctly reset the guesses. If the user has not guessed within the limit, prompt the user if they want to play again, if they do have them type "y", and if they don't have them type "n". Make sure the input is case insensitive. If they guess the number correctly add the base point value (up to you) multiplied by the multiplier in the table below, to the users total score. Each time the user correctly guesses the number within the guess limit add on to how many times they guessed right, so you must track the times played. The table below includes the multiplier values.


|# Played|Multiplier|
|--------|----------|
|<10	 |1.25		|
|<20	 |1.5		|
|<30	 |1.75		|
|<40	 |2			|
|<50	 |2.25		|


Please use a separate method to handle the game.