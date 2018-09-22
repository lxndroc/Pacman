# Pacman
Creating a simple version of the Pacman arcade game in Java

                                                            Analysis
Functional Requirements

FR1.1 Display a maze (224x288pixels-28x36 tiles of 8x8pixels).[D]

FR2.1 Pac-man is placed[m] and can move[m] in the maze.

FR2.2 Pac-man stops[m] when a wall[s] is reached[cnd-GUI].[C]

FR2.3 +Keep pac-man lives[a]. If pac-man is eaten by a ghost[cnd-GUI] the number of lives decrease by one[m]. If the game reaches a certain score[a] [cnd] the number of lives increase by one[m=].[B]

FR2.4 Keep and display[m] game score. This score increases when pac-man eats a pill[m], ghost[m], or gift[?c] [cnd-GUI]. [C]

FR3.1 Pills are placed[m] in the maze.[C]

FR3.2 When all the pills are eaten[cnd-GUI], the game proceeds to the next level[m].[B]

FR3.3 Larger ‘power pills’[a] are placed in the maze.

FR3.3.1 Eating one of these ‘turns the tables’ for a limited time[cnd-GUI]: pac-man can eat a ghost. [A]

FR3.3.2 +In that case a ghost changes colour and direction and when eaten it returns to the base.

FR3.3.3 +Each successive ghost eaten is worth more than the last.

FR3.4+ A gift is placed in the centre of the maze.

FR4.1 Four ghosts are placed in the maze.

FR4.2 The ghosts move[m] independently, chase[?] pac-man and can eat pac-man[m].[B-A]

FR4.3 +The speed of the ghosts increases by level.

FR5.1 A human player can start[m] a game.

FR5.2 The player can move[m] pac-man.[D]

FR5.3 The player wins [m] the game after completion of a certain level[cnd] and loses [m] it when there are no more lives. [B-A]

FR6.1 The game keeps [m] and displays a high score table[a].[A]