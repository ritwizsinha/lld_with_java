# Tic Tac Toe

## Requirements
- We have n players
- We have a S x S grid
- Each player will have a symbol
- Winner is who gets this grid filled with his/her symbol in a row, column, diagonal or anti-diagonal
- Chances are one by one
- Invalid moves:
  - Putting on a cell already occupied
  - Cell with insane coordinates

## Classes

- GameBoard
  - FillCell()
  - CheckSomeoneWon()
- Player
  - Name
  - Symbol

## Improvements
- Use the command patterns to clean the code for the different inputs expected from the user, the actions I am thinking of supporting
  are:
  - Add player name with their symbol
    ```
      [ADD] player_name character_symbol
    ```
  - Make a move in position x and y
    ```
     Move x y
    ```
  - Quit game the other player wins
    ```
      Quit
    ```
  - New game, start a new game
    ```
      New board_size
    ```
    
First create a command to abstract away the string command and arguments, then create a command
executor class which takes a command and executes it, the command executor can be passed with the
instances of important classes like board and players