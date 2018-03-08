Kata: Climbing the Leaderboard

URL: https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she beats each level? The game uses Dense Ranking, so its leaderboard works like this:

    The player with the highest score is ranked number on the leaderboard.
    Players who have equal scores receive the same ranking number, 
    and the next player(s) receive the immediately following ranking number.

For example, four players have the scores 100, 90, 90, and 80. Those players will have ranks 1, 2, 2, and 3, respectively.

When Alice starts playing, there are already n people on the leaderboard. The score of each player i is denoted by s_i. Alice plays for m levels, and we denote her total score after passing each level j as alice_j. After completing each level, Alice wants to know her current rank.

You are given an array, scores, of monotonically decreasing leaderboard scores, and another array, alice, of Alice's cumulative scores for each level of the game. You must print m integers. The jth integer should indicate the current rank of Alice after passing the jth level.

Input Format

    The first line contains an integer, n, denoting the number of players already on the leaderboard.
    The next line contains n space-separated integers describing the respective values of scores_0, scores_1, ..., scores_n-1.
    The next line contains an integer, m, denoting the number of levels Alice beats.
    The last line contains m space-separated integers describing the respective values of alice_0, alice_1, ..., alice_m-1.

Constraints

    1 <= n <= 2 * 10^5
    1 <= m <= 2 * 10^5
    0 <= scores_i <= 10^9 for 0 <= i < n
    0 <= alice_j <= 10^9 for 0 <= j < m
    The existing leaderboard, , is in descending order.
    Alice's scores are cumulative, so is in ascending order.
    

Subtask

For 60% of the maximum score:

    1 <= n <= 200
    1 <= m <= 200

Output Format

Print m integers. The jth integer should indicate the rank of Alice after passing the jth level.

Sample Input 0

    7
    100 100 50 40 40 20 10
    4
    5 25 50 120
    
Sample Output 0
    
    6
    4
    2
    1

Explanation 0

Alice starts playing with 7 players already on the leaderboard, which looks like this:

    ╔═══════╦══════════╦═══════╗
    ║ Name  ║   Rank   ║ Score ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   Emma   ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   David  ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║ Calorine ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║  Ritika  ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║    Tom   ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║  Heraldo ║   20  ║
    ╠═══════╬══════════╬═══════╣
    ║   5   ║   Riley  ║   10  ║
    ╚═══════╩══════════╩═══════╝


After Alice finishes level 0, her score is 5 and her ranking is 6:

    ╔═══════╦══════════╦═══════╗
    ║ Name  ║   Rank   ║ Score ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   Emma   ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   David  ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║ Calorine ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║  Ritika  ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║    Tom   ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║  Heraldo ║   20  ║
    ╠═══════╬══════════╬═══════╣
    ║   5   ║   Riley  ║   10  ║
    ╠═══════╬══════════╬═══════╣
    ║   6   ║   Alice  ║    5  ║
    ╚═══════╩══════════╩═══════╝

After Alice finishes level 1, her score is 25 and her ranking is 4:

    ╔═══════╦══════════╦═══════╗
    ║ Name  ║   Rank   ║ Score ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   Emma   ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   David  ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║ Calorine ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║  Ritika  ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║    Tom   ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║   Alice  ║    5  ║
    ╠═══════╬══════════╬═══════╣
    ║   5   ║  Heraldo ║   20  ║
    ╠═══════╬══════════╬═══════╣
    ║   6   ║   Riley  ║   10  ║
    ╚═══════╩══════════╩═══════╝

After Alice finishes level 2, her score is 50 and her ranking is tied with Caroline at 2:

    ╔═══════╦══════════╦═══════╗
    ║ Name  ║   Rank   ║ Score ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   Emma   ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   David  ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║ Calorine ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║   Alice  ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║  Ritika  ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║    Tom   ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║  Heraldo ║   20  ║
    ╠═══════╬══════════╬═══════╣
    ║   5   ║   Riley  ║   10  ║
    ╚═══════╩══════════╩═══════╝

After Alice finishes level 3, her score 120 is and her ranking is 1:

    ╔═══════╦══════════╦═══════╗
    ║ Name  ║   Rank   ║ Score ║
    ╠═══════╬══════════╬═══════╣
    ║   1   ║   Alice  ║  120  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║   Emma   ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   2   ║   David  ║  100  ║
    ╠═══════╬══════════╬═══════╣
    ║   3   ║ Calorine ║   50  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║  Ritika  ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   4   ║    Tom   ║   40  ║
    ╠═══════╬══════════╬═══════╣
    ║   5   ║  Heraldo ║   20  ║
    ╠═══════╬══════════╬═══════╣
    ║   6   ║   Riley  ║   10  ║
    ╚═══════╩══════════╩═══════╝


