import java.util.ArrayList;
import java.util.List;

class DesertIslandTravel {
    public static void main(String[] args) {
        DesertIslandTravel solver = new DesertIslandTravel();
        String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};
        solver.solution(maps);
    }

    public int[] solution(String[] maps) {
	    // grid로 관리
	    char[][] grid = new char[maps.length][maps[0].length()] ;
	    boolean[][] gridVisited = new boolean[maps.length][maps[0].length()];
		List<Integer> islandDays = new ArrayList<>();

	    // grid에 maps배열 복사
	    for (int i = 0; i < maps.length; i++) {
		    for (int j = 0; j < maps[0].length(); j++) {
			    grid[i][j] = maps[i].charAt(j);
		    }
	    }

	    // gird 복사 확인
	    for (int i = 0; i < maps.length; i++) {
		    for (int j = 0; j < maps[0].length(); j++) {
			    System.out.printf("%c ", grid[i][j]);
		    }
		    System.out.println();
	    }

	    // dfs 탐색
	    for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[0].length(); j++) {
				if (gridVisited[i][j] == false) {
					islandDays.add(dfs(grid, gridVisited, i, j));
				}
			}
		}


	    int[] answer = new int[islandDays.size()];
		for (int i = 0; i < islandDays.size(); i++) {
			answer[i] = islandDays.get(i);
		}

	    return answer;
    }

	// 방문체크 dfs
    private int dfs(char[][] grid, boolean[][] gridVisited, int row, int col) {

		System.out.printf("%d %d\n", row, col);
		return 0;
	}

}
