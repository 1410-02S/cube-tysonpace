package com.example.project;

import java.util.Scanner;
import java.util.ArrayList;

//Really good job here, I hthink it looks quite complete and seems to work well.

public class Cube {
	static String redFace[][] = {
			{ "r", "r", "r" },
			{ "r", "r", "r" },
			{ "r", "r", "r" },
	};
	static String blueFace[][] = {
			{ "b", "b", "b" },
			{ "b", "b", "b" },
			{ "b", "b", "b" },
	};
	static String orangeFace[][] = {
			{ "o", "o", "o" },
			{ "o", "o", "o" },
			{ "o", "o", "o" },
	};
	static String greenFace[][] = {
			{ "g", "g", "g" },
			{ "g", "g", "g" },
			{ "g", "g", "g" },
	};
	static String yellowFace[][] = {
			{ "y", "y", "y" },
			{ "y", "y", "y" },
			{ "y", "y", "y" },
	};
	static String whiteFace[][] = {
			{ "w", "w", "w" },
			{ "w", "w", "w" },
			{ "w", "w", "w" },
	};

	static void printCube() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(redFace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(blueFace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(orangeFace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(greenFace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(yellowFace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(whiteFace[i][j] + " ");
			}
			System.out.println();
		}
	}

	static String[][] tempRedFace(String[][] face) {
		String tempFace[][] = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tempFace[i][j] = face[i][j];
			}
		}
		return tempFace;
	}

	static String[][] tempYellowFace(String[][] face) {
		String tempFace[][] = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tempFace[i][j] = face[i][j];
			}
		}
		return tempFace;
	}

	static String[][] moveFace(String[][] face) {
		String[][] tempTopFace = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tempTopFace[i][j] = face[i][j];
			}
		}
		face[0][0] = tempTopFace[2][0];
		face[1][0] = tempTopFace[2][1];
		face[2][0] = tempTopFace[2][2];
		face[0][1] = tempTopFace[1][0];
		face[2][1] = tempTopFace[1][2];
		face[0][2] = tempTopFace[0][0];
		face[1][2] = tempTopFace[0][1];
		face[2][2] = tempTopFace[0][2];
		return face;
	}

	static String[][] moveUFrontFace(String[][] face) {
		face[0][0] = greenFace[0][0];
		face[0][1] = greenFace[0][1];
		face[0][2] = greenFace[0][2];
		return face;
	}

	static String[][] moveULeftFace(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[0][0];
		face[0][1] = tempFace[0][1];
		face[0][2] = tempFace[0][2];
		return face;
	}

	static String[][] moveUBackFace(String[][] face) {
		face[0][0] = blueFace[0][0];
		face[0][1] = blueFace[0][1];
		face[0][2] = blueFace[0][2];
		return face;
	}

	static String[][] moveURightFace(String[][] face) {
		face[0][0] = orangeFace[0][0];
		face[0][1] = orangeFace[0][1];
		face[0][2] = orangeFace[0][2];
		return face;
	}

	static String[][] moveDFrontFace(String[][] face) {
		face[2][0] = blueFace[2][0];
		face[2][1] = blueFace[2][1];
		face[2][2] = blueFace[2][2];
		return face;
	}

	static String[][] moveDLeftFace(String[][] face) {
		face[2][0] = orangeFace[2][0];
		face[2][1] = orangeFace[2][1];
		face[2][2] = orangeFace[2][2];
		return face;
	}

	static String[][] moveDBackFace(String[][] face) {
		face[2][0] = greenFace[2][0];
		face[2][1] = greenFace[2][1];
		face[2][2] = greenFace[2][2];
		return face;
	}

	static String[][] moveDrightFace(String[][] face, String[][] tempFace) {
		face[2][0] = tempFace[2][0];
		face[2][1] = tempFace[2][1];
		face[2][2] = tempFace[2][2];
		return face;
	}

	static String[][] moveRFrontFace(String[][] face) {
		face[0][2] = whiteFace[0][2];
		face[1][2] = whiteFace[1][2];
		face[2][2] = whiteFace[2][2];
		return face;
	}

	static String[][] moveRBottomFace(String[][] face) {
		face[0][2] = orangeFace[2][0];
		face[1][2] = orangeFace[1][0];
		face[2][2] = orangeFace[0][0];
		return face;
	}

	static String[][] moveRBackFace(String[][] face) {
		face[0][0] = yellowFace[2][2];
		face[1][0] = yellowFace[1][2];
		face[2][0] = yellowFace[0][2];
		return face;
	}

	static String[][] moveRTopFace(String[][] face, String[][] tempFace) {
		face[0][2] = tempFace[0][2];
		face[1][2] = tempFace[1][2];
		face[2][2] = tempFace[2][2];
		return face;
	}

	static String[][] moveLFrontFace(String[][] face) {
		face[0][0] = yellowFace[0][0];
		face[1][0] = yellowFace[1][0];
		face[2][0] = yellowFace[2][0];
		return face;
	}

	static String[][] moveLTopFace(String[][] face) {
		face[0][0] = orangeFace[2][2];
		face[1][0] = orangeFace[1][2];
		face[2][0] = orangeFace[0][2];
		return face;
	}

	static String[][] moveLBackFace(String[][] face) {
		face[0][2] = whiteFace[2][0];
		face[1][2] = whiteFace[1][0];
		face[2][2] = whiteFace[0][0];
		return face;
	}

	static String[][] moveLBottomFace(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[0][0];
		face[1][0] = tempFace[1][0];
		face[2][0] = tempFace[2][0];
		return face;
	}

	static String[][] moveFTopFace(String[][] face) {
		face[2][2] = blueFace[0][2];
		face[2][1] = blueFace[1][2];
		face[2][0] = blueFace[2][2];
		return face;
	}

	static String[][] moveFLeftFace(String[][] face) {
		face[0][2] = whiteFace[0][0];
		face[1][2] = whiteFace[0][1];
		face[2][2] = whiteFace[0][2];
		return face;
	}

	static String[][] moveFBottomFace(String[][] face) {
		face[0][0] = greenFace[2][0];
		face[0][1] = greenFace[1][0];
		face[0][2] = greenFace[0][0];
		return face;
	}

	static String[][] moveFRightFace(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[2][0];
		face[1][0] = tempFace[2][1];
		face[2][0] = tempFace[2][2];
		return face;
	}

	static String[][] moveBTopFace(String[][] face) {
		face[0][0] = greenFace[0][2];
		face[0][1] = greenFace[1][2];
		face[0][2] = greenFace[2][2];
		return face;
	}

	static String[][] moveBRightFace(String[][] face) {
		face[0][2] = whiteFace[2][2];
		face[1][2] = whiteFace[2][1];
		face[2][2] = whiteFace[2][0];
		return face;
	}

	static String[][] moveBBottomFace(String[][] face) {
		face[2][0] = blueFace[0][0];
		face[2][1] = blueFace[1][0];
		face[2][2] = blueFace[2][0];
		return face;
	}

	static String[][] moveBLeftFace(String[][] face, String[][] tempFace) {
		face[0][0] = tempFace[0][2];
		face[1][0] = tempFace[0][1];
		face[2][0] = tempFace[0][0];
		return face;
	}

	public static void main(final String[] args) {
		String userQuit = "";
		Scanner userMove = new Scanner(System.in);
		String[][] temporaryRedFace = new String[3][3];
		String[][] temporaryYellowFace = new String[3][3];
		ArrayList<String> reverseInputs = new ArrayList<String>();
		System.out.println(
				"Welcome to the Rubik's cube. Have fun scrambling the cube. Once you quit, the commands to solve the cube will display.");
		System.out.println(
				"Please enter a move (U, D, R, L, F, B, U', D', R', L', F', B'), press C to see the cube, and Q to quit.");
		System.out.println("Remember: The red face is facing towards you and the yellow face is up.");
		while (userQuit != "Q") {
			userQuit = userMove.next();
			switch (userQuit) {
				case "U":
					temporaryRedFace = tempRedFace(redFace);
					moveFace(yellowFace);
					moveUFrontFace(redFace);
					moveURightFace(greenFace);
					moveUBackFace(orangeFace);
					moveULeftFace(blueFace, temporaryRedFace);
					reverseInputs.add("U'");
					break;
				case "D":
					temporaryRedFace = tempRedFace(redFace);
					moveFace(whiteFace);
					moveDFrontFace(redFace);
					moveDLeftFace(blueFace);
					moveDBackFace(orangeFace);
					moveDrightFace(greenFace, temporaryRedFace);
					reverseInputs.add("D'");
					break;
				case "R":
					temporaryRedFace = tempRedFace(redFace);
					moveFace(greenFace);
					moveRFrontFace(redFace);
					moveRBottomFace(whiteFace);
					moveRBackFace(orangeFace);
					moveRTopFace(yellowFace, temporaryRedFace);
					reverseInputs.add("R'");
					break;
				case "L":
					temporaryRedFace = tempRedFace(redFace);
					moveFace(blueFace);
					moveLFrontFace(redFace);
					moveLTopFace(yellowFace);
					moveLBackFace(orangeFace);
					moveLBottomFace(whiteFace, temporaryRedFace);
					reverseInputs.add("L'");
					break;
				case "F":
					temporaryYellowFace = tempYellowFace(yellowFace);
					moveFace(redFace);
					moveFTopFace(yellowFace);
					moveFLeftFace(blueFace);
					moveFBottomFace(whiteFace);
					moveFRightFace(greenFace, temporaryYellowFace);
					reverseInputs.add("F'");
					break;
				case "B":
					temporaryYellowFace = tempYellowFace(yellowFace);
					moveFace(orangeFace);
					moveBTopFace(yellowFace);
					moveBRightFace(greenFace);
					moveBBottomFace(whiteFace);
					moveBLeftFace(blueFace, temporaryYellowFace);
					reverseInputs.add("B'");
					break;
				case "U'":
					for (int i = 0; i < 3; i++) {
						temporaryRedFace = tempRedFace(redFace);
						moveFace(yellowFace);
						moveUFrontFace(redFace);
						moveURightFace(greenFace);
						moveUBackFace(orangeFace);
						moveULeftFace(blueFace, temporaryRedFace);
					}
					reverseInputs.add("U");
					break;
				case "D'":
					for (int i = 0; i < 3; i++) {
						temporaryRedFace = tempRedFace(redFace);
						moveFace(whiteFace);
						moveDFrontFace(redFace);
						moveDLeftFace(blueFace);
						moveDBackFace(orangeFace);
						moveDrightFace(greenFace, temporaryRedFace);
					}
					reverseInputs.add("D");
					break;
				case "R'":
					for (int i = 0; i < 3; i++) {
						temporaryRedFace = tempRedFace(redFace);
						moveFace(greenFace);
						moveRFrontFace(redFace);
						moveRBottomFace(whiteFace);
						moveRBackFace(orangeFace);
						moveRTopFace(yellowFace, temporaryRedFace);
					}
					reverseInputs.add("R");
					break;
				case "L'":
					for (int i = 0; i < 3; i++) {
						temporaryRedFace = tempRedFace(redFace);
						moveFace(blueFace);
						moveLFrontFace(redFace);
						moveLTopFace(yellowFace);
						moveLBackFace(orangeFace);
						moveLBottomFace(whiteFace, temporaryRedFace);
					}
					reverseInputs.add("L");
					break;
				case "F'":
					for (int i = 0; i < 3; i++) {
						temporaryYellowFace = tempYellowFace(yellowFace);
						moveFace(redFace);
						moveFTopFace(yellowFace);
						moveFLeftFace(blueFace);
						moveFBottomFace(whiteFace);
						moveFRightFace(greenFace, temporaryYellowFace);
					}
					reverseInputs.add("F");
					break;
				case "B'":
					for (int i = 0; i < 3; i++) {
						temporaryYellowFace = tempYellowFace(yellowFace);
						moveFace(orangeFace);
						moveBTopFace(yellowFace);
						moveBRightFace(greenFace);
						moveBBottomFace(whiteFace);
						moveBLeftFace(blueFace, temporaryYellowFace);
					}
					reverseInputs.add("B");
					break;
				case "C":
					printCube();
					break;
				case "Q":
					System.out.println("Thanks for using the Rubik's cube.");
					System.out.println("Here are the moves that would solve the cube:");
					for (int i = reverseInputs.size(); i > 0; i--) {
						System.out.print(reverseInputs.get(i-1) + " ");
					}
					System.out.println();
					break;
				default:
					System.out.println("That is not a valid move. Please enter a new move.");
					break;
			}
		}
		userMove.close();
	}
}
