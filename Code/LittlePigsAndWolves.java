import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittlePigsAndWolves {
    public static void littlePigsAndWolves() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        char[][] pigAndWolves = new char[n][m];
        boolean row1, rowN, col1, colM, pigFound;
        int i, j;
        int numWolves = 0;
        for (i = 0; i < n; i++) {
            String arrangement = reader.readLine();
            for (j = 0; j < m; j++) {
                pigAndWolves[i][j] = arrangement.charAt(j);
            }
        }
        if (n == 1 && m == 1) {
            System.out.println(0);
            return;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                pigFound = false;
                row1 = false;
                rowN = false;
                col1 = false;
                colM = false;
                if (pigAndWolves[i][j] == 'W') {
                    if (i == 0) {
                        row1 = true;
                    }
                    if (i == n - 1) {
                        rowN = true;
                    }
                    if (j == 0) {
                        col1 = true;
                    }
                    if (j == m - 1) {
                        colM = true;
                    }
                    if (row1) {
                        if (!col1) {
                            if (pigAndWolves[i][j - 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (!colM) {
                            if (pigAndWolves[i][j + 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (!rowN) {
                            if (pigAndWolves[i + 1][j] == 'P') {
                                pigFound = true;
                            }
                        }
                    } else if (rowN) {
                        if (!col1) {
                            if (pigAndWolves[i][j - 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (!colM) {
                            if (pigAndWolves[i][j + 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (pigAndWolves[i - 1][j] == 'P') {
                            pigFound = true;
                        }
                    } else {
                        if (!col1) {
                            if (pigAndWolves[i][j - 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (!colM) {
                            if (pigAndWolves[i][j + 1] == 'P') {
                                pigFound = true;
                            }
                        }
                        if (pigAndWolves[i - 1][j] == 'P') {
                            pigFound = true;
                        }
                        if (pigAndWolves[i + 1][j] == 'P') {
                            pigFound = true;
                        }
                    }
                    if (pigFound) {
                        numWolves++;
                    }
                }
            }
        }
        System.out.println(numWolves);
    }
}