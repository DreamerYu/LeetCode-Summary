## Intuition
The connected two points in polygon shares one common edge,
these two points must be one and only one triangles.


## Explanation

dp[i][j] means the minimum score to triangulate A[i] ~ A[j],
while there is edge connect A[i] and A[j].

We enumerate all points A[k] with i < k < j to form a triangle.

The score of this triangulation is dp[i][j], dp[i][k] + dp[k][j] + A[i] * A[j] * A[k]