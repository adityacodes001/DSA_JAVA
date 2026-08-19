package TwoDArrays;

import java.util.*;

public class CinemaSeatAllocation {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Set<Integer> rowsWithReservation = new HashSet<>();

        // Store rows having reservations
        for (int[] seat : reservedSeats) {
            rowsWithReservation.add(seat[0]);
        }

        // Empty rows can fit 2 families
        int answer = (n - rowsWithReservation.size()) * 2;

        // Check only rows having reservations
        for (int row : rowsWithReservation) {

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for (int[] seat : reservedSeats) {

                if (seat[0] == row) {

                    int s = seat[1];

                    // Seats 2,3,4,5
                    if (s >= 2 && s <= 5) {
                        left = false;
                    }

                    // Seats 4,5,6,7
                    if (s >= 4 && s <= 7) {
                        middle = false;
                    }

                    // Seats 6,7,8,9
                    if (s >= 6 && s <= 9) {
                        right = false;
                    }
                }
            }

            // Both left and right are available
            if (left && right) {
                answer += 2;
            }

            // At least one group is available
            else if (left || middle || right) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        CinemaSeatAllocation obj = new CinemaSeatAllocation();

        int n = 3;

        int[][] reservedSeats = {
                {1, 2},
                {1, 3},
                {1, 8},
                {2, 6},
                {3, 1},
                {3, 10}
        };

        int result = obj.maxNumberOfFamilies(n, reservedSeats);

        System.out.println("Maximum families: " + result);
    }
}