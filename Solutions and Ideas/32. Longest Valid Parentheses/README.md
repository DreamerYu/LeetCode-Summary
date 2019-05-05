Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.


### Idea:

use stack. only store the index of '(' and when encounter a ')', pop ,compute the difference to get the length and push current index.