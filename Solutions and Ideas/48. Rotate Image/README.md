You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

### Idea:

for:
    1 2 3
    4 5 6
    7 8 9
we can first reverse from left to right to become this:
    3 2 1
    6 5 4
    9 8 7
at last, we transpose it:
    7 4 1
    8 5 2
    9 6 3
    
    0 0 - 2 2
    0 1 - 1 2
    1 0 - 2 1
    0 2 - 0 2