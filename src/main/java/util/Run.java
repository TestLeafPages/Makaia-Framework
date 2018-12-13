package util;

public class Run {
	public static void main(String[] args) {
		String[][] sheet = DataInputProvider.getSheet("a");
		for (int i = 0; i < sheet.length-1; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(sheet[i][j]);
			}
		}
	}
}
