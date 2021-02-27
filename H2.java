public class H2 {
        private String name;
        private int score;
        public H2(String n, int s) {
            name = n;
            score = s;
        }
        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }
        @Override
        public String toString() {
            return "Alsoty1{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
        public class Scoreboard {
            private int numEntries = 0;
            private H2[] board;
            public Scoreboard(int capacity) {
                board = new H2[][capacity];
            }
            public void add(H2 e) {
                int newScore = e.getScore();
                if (numEntries < board.length)
                    numEntries++;
                int j = numEntries - 1;
                while (j > 0 && board[j - 1].getScore() < newScore) {
                    board[j] = board[j - 1];
                    j--;
                }
                board[j] = e;
            }
            public H2 remove(int i) throws IndexOutOfBoundsException {
                if (i < 0 || i >= numEntries)
                    throw new IndexOutOfBoundsException("Invalid undex:" + i);
                H2 temp = board[i];
                for (int j = i; j < numEntries - 1; j++)
                    board[j] = board[j + 1];
                board[numEntries - 1] = null;
                numEntries--;
                return temp;
            }}

        public static void main(String[] args) {
            H2 a=new H2("ali",2);
            System.out.println(a);
        }}
}
