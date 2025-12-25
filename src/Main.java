import java.util.Scanner;

import static sources.Class_Sources_Block2D.*;
import static sources.Class_Sources_Block3D.*;
import static sources.Class_Sources_ThinASCII.*;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=== ASCII Icon Styles ===");
            System.out.println("1) Block Style");
            System.out.println("2) Star Style");
            System.out.println("3) Outline Style");
            System.out.println("4) Thin ASCII");
            System.out.println("5) Matrix Pattern");
            System.out.println("6) Bubble Style");
            System.out.println("7) Letter Fill");
            System.out.println("8) All Style");
            System.out.println("9) Show examples of all styles");

            System.out.print("\nChoose a style: ");
            int style = getInt();

            boolean is3D = false;
            if (style == 1) {
                System.out.print("Choose type [1 = 2D , 2 = 3D]: ");
                int t = getInt();
                is3D = (t == 2);
            }

            boolean isCapital = false;
            if (style == 7) {
                System.out.print("Choose type [1 = Uppercase , 2 = Lowercase]: ");
                int t = getInt();
                isCapital = (t == 2);
            }

            String text = "";
            if (style != 9) {
                System.out.print("\nEnter the text to convert: ");
                text = input.nextLine();
            }else {
                text = "abc";
            }

            System.out.println("\n=== RESULT ===");
            String result = generateAscii(style, is3D, isCapital, text);
            System.out.println(result);


            System.out.print("\nRun again? (y/n): ");
            String again = input.nextLine().trim().toLowerCase();

            if (!again.equals("y") && !again.equals("yes")) {
                System.out.println("\nExiting program...");
                break;
            }

            System.out.println("\nRestarting...\n");
        }
    }


    // ================================================================
    //                         ASCII GENERATOR
    // ================================================================
    private static String generateAscii(int style, boolean is3D, boolean isCapital, String text) {
        if (style != 1 || style != 2) {
            IO.println("It will be developed in the future.");
        }

        return switch (style) {
            case 1 -> is3D ? block3D(text) : block2D(text);
            case 2 -> star(text);
            case 3 -> outline(text);
            case 4 -> thin(text);
            case 5 -> matrix(text);
            case 6 -> bubble(text);
            case 7 -> isCapital ? letterUpper(text) : letterLower(text);
            case 8, 9 -> allStyle(text);
            default -> "Invalid style!";
        };
    }

    private static String allStyle(String text) {
        IO.println("\n=== Block Style (2D) ===");
        block2D(text);

        IO.println("\n=== Block Style (3D) ===");
        block3D(text);

        IO.println("\n=== Star Style) ===");
        star(text);

        IO.println("\n=== Outline Style ===");
        outline(text);

        IO.println("\n=== Thin ASCII ===");
        thin(text);

        IO.println("\n=== Matrix Pattern ===");
        matrix(text);

        IO.println("\n=== Bubble Style ===");
        bubble(text);

        IO.println("\n=== Letter Fill (Uppercase) ===");
        letterUpper(text);

        IO.println("\n=== Letter Fill (Lowercase) ===");
        letterLower(text);

        return "/// %s \\\\\\".formatted(text);
    }

    // ----------------------- STYLE METHODS ------------------------
    private static String block2D(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "*** %s ***".formatted(text);
    }

    private static String block3D(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        int[] index = new int[text.length()];
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL3_A.charAt(k) != '\n') {
                            IO.print(BL3_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'B':
                        k = index[j];
                        while (BL3_B.charAt(k) != '\n') {
                            IO.print(BL3_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'C':
                        k = index[j];
                        while (BL3_C.charAt(k) != '\n') {
                            IO.print(BL3_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'D':
                        k = index[j];
                        while (BL3_D.charAt(k) != '\n') {
                            IO.print(BL3_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'E':
                        k = index[j];
                        while (BL3_E.charAt(k) != '\n') {
                            IO.print(BL3_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'F':
                        k = index[j];
                        while (BL3_F.charAt(k) != '\n') {
                            IO.print(BL3_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'G':
                        k = index[j];
                        while (BL3_G.charAt(k) != '\n') {
                            IO.print(BL3_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'H':
                        k = index[j];
                        while (BL3_H.charAt(k) != '\n') {
                            IO.print(BL3_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'I':
                        k = index[j];
                        while (BL3_I.charAt(k) != '\n') {
                            IO.print(BL3_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'J':
                        k = index[j];
                        while (BL3_J.charAt(k) != '\n') {
                            IO.print(BL3_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'K':
                        k = index[j];
                        while (BL3_K.charAt(k) != '\n') {
                            IO.print(BL3_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'L':
                        k = index[j];
                        while (BL3_L.charAt(k) != '\n') {
                            IO.print(BL3_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'M':
                        k = index[j];
                        while (BL3_M.charAt(k) != '\n') {
                            IO.print(BL3_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'N':
                        k = index[j];
                        while (BL3_N.charAt(k) != '\n') {
                            IO.print(BL3_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'O':
                        k = index[j];
                        while (BL3_O.charAt(k) != '\n') {
                            IO.print(BL3_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'P':
                        k = index[j];
                        while (BL3_P.charAt(k) != '\n') {
                            IO.print(BL3_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Q':
                        k = index[j];
                        while (BL3_Q.charAt(k) != '\n') {
                            IO.print(BL3_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'R':
                        k = index[j];
                        while (BL3_R.charAt(k) != '\n') {
                            IO.print(BL3_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'S':
                        k = index[j];
                        while (BL3_S.charAt(k) != '\n') {
                            IO.print(BL3_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'T':
                        k = index[j];
                        while (BL3_T.charAt(k) != '\n') {
                            IO.print(BL3_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'U':
                        k = index[j];
                        while (BL3_U.charAt(k) != '\n') {
                            IO.print(BL3_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'V':
                        k = index[j];
                        while (BL3_V.charAt(k) != '\n') {
                            IO.print(BL3_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'W':
                        k = index[j];
                        while (BL3_W.charAt(k) != '\n') {
                            IO.print(BL3_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'X':
                        k = index[j];
                        while (BL3_X.charAt(k) != '\n') {
                            IO.print(BL3_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Y':
                        k = index[j];
                        while (BL3_Y.charAt(k) != '\n') {
                            IO.print(BL3_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Z':
                        k = index[j];
                        while (BL3_Z.charAt(k) != '\n') {
                            IO.print(BL3_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case '-':
                    case '_':
                        k = index[j];
                        while (BL3_Dash.charAt(k) != '\n') {
                            IO.print(BL3_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case ' ':
                        k = index[j];
                        while (BL3_Space.charAt(k) != '\n') {
                            IO.print(BL3_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "*** %s ***".formatted(text);
    }

    private static String star(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        char Ch = '*';

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    private static String outline(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        char Ch = '#';

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    private static String thin(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (Thin_A.charAt(k) != '\n') {
                            IO.print(Thin_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'B':
                        k = index[j];
                        while (Thin_B.charAt(k) != '\n') {
                            IO.print(Thin_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'C':
                        k = index[j];
                        while (Thin_C.charAt(k) != '\n') {
                            IO.print(Thin_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'D':
                        k = index[j];
                        while (Thin_D.charAt(k) != '\n') {
                            IO.print(Thin_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'E':
                        k = index[j];
                        while (Thin_E.charAt(k) != '\n') {
                            IO.print(Thin_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'F':
                        k = index[j];
                        while (Thin_F.charAt(k) != '\n') {
                            IO.print(Thin_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'G':
                        k = index[j];
                        while (Thin_G.charAt(k) != '\n') {
                            IO.print(Thin_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'H':
                        k = index[j];
                        while (Thin_H.charAt(k) != '\n') {
                            IO.print(Thin_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'I':
                        k = index[j];
                        while (Thin_I.charAt(k) != '\n') {
                            IO.print(Thin_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'J':
                        k = index[j];
                        while (Thin_J.charAt(k) != '\n') {
                            IO.print(Thin_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'K':
                        k = index[j];
                        while (Thin_K.charAt(k) != '\n') {
                            IO.print(Thin_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'L':
                        k = index[j];
                        while (Thin_L.charAt(k) != '\n') {
                            IO.print(Thin_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'M':
                        k = index[j];
                        while (Thin_M.charAt(k) != '\n') {
                            IO.print(Thin_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'N':
                        k = index[j];
                        while (Thin_N.charAt(k) != '\n') {
                            IO.print(Thin_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'O':
                        k = index[j];
                        while (Thin_O.charAt(k) != '\n') {
                            IO.print(Thin_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'P':
                        k = index[j];
                        while (Thin_P.charAt(k) != '\n') {
                            IO.print(Thin_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Q':
                        k = index[j];
                        while (Thin_Q.charAt(k) != '\n') {
                            IO.print(Thin_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'R':
                        k = index[j];
                        while (Thin_R.charAt(k) != '\n') {
                            IO.print(Thin_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'S':
                        k = index[j];
                        while (Thin_S.charAt(k) != '\n') {
                            IO.print(Thin_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'T':
                        k = index[j];
                        while (Thin_T.charAt(k) != '\n') {
                            IO.print(Thin_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'U':
                        k = index[j];
                        while (Thin_U.charAt(k) != '\n') {
                            IO.print(Thin_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'V':
                        k = index[j];
                        while (Thin_V.charAt(k) != '\n') {
                            IO.print(Thin_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'W':
                        k = index[j];
                        while (Thin_W.charAt(k) != '\n') {
                            IO.print(Thin_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'X':
                        k = index[j];
                        while (Thin_X.charAt(k) != '\n') {
                            IO.print(Thin_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Y':
                        k = index[j];
                        while (Thin_Y.charAt(k) != '\n') {
                            IO.print(Thin_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case 'Z':
                        k = index[j];
                        while (Thin_Z.charAt(k) != '\n') {
                            IO.print(Thin_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case '-':
                    case '_':
                        k = index[j];
                        while (Thin_Dash.charAt(k) != '\n') {
                            IO.print(Thin_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;
                    case ' ':
                        k = index[j];
                        while (Thin_Space.charAt(k) != '\n') {
                            IO.print(Thin_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "*** %s ***".formatted(text);
    }

    private static String matrix(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        char Ch = 'X';

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    private static String bubble(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();

        char Ch = 'O';

        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    private static String letterUpper(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();


        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                char Ch = String.valueOf(ch).toUpperCase().charAt(0);

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    private static String letterLower(String text) {
        text = text.replace("_", "-");
        text = text.toUpperCase();


        int[] index = new int[text.length()];
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                int k;

                char Ch = String.valueOf(ch).toLowerCase().charAt(0);

                switch (ch) {
                    case 'A':
                        k = index[j];
                        while (BL2_A.charAt(k) != '\n') {
                            if (BL2_A.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_A.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'B':
                        k = index[j];
                        while (BL2_B.charAt(k) != '\n') {
                            if (BL2_B.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_B.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'C':
                        k = index[j];
                        while (BL2_C.charAt(k) != '\n') {
                            if (BL2_C.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_C.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'D':
                        k = index[j];
                        while (BL2_D.charAt(k) != '\n') {
                            if (BL2_D.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_D.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'E':
                        k = index[j];
                        while (BL2_E.charAt(k) != '\n') {
                            if (BL2_E.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_E.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'F':
                        k = index[j];
                        while (BL2_F.charAt(k) != '\n') {
                            if (BL2_F.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_F.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'G':
                        k = index[j];
                        while (BL2_G.charAt(k) != '\n') {
                            if (BL2_G.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_G.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'H':
                        k = index[j];
                        while (BL2_H.charAt(k) != '\n') {
                            if (BL2_H.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_H.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'I':
                        k = index[j];
                        while (BL2_I.charAt(k) != '\n') {
                            if (BL2_I.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_I.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'J':
                        k = index[j];
                        while (BL2_J.charAt(k) != '\n') {
                            if (BL2_J.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_J.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'K':
                        k = index[j];
                        while (BL2_K.charAt(k) != '\n') {
                            if (BL2_K.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_K.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'L':
                        k = index[j];
                        while (BL2_L.charAt(k) != '\n') {
                            if (BL2_L.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_L.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'M':
                        k = index[j];
                        while (BL2_M.charAt(k) != '\n') {
                            if (BL2_M.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_M.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'N':
                        k = index[j];
                        while (BL2_N.charAt(k) != '\n') {
                            if (BL2_N.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_N.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'O':
                        k = index[j];
                        while (BL2_O.charAt(k) != '\n') {
                            if (BL2_O.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_O.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'P':
                        k = index[j];
                        while (BL2_P.charAt(k) != '\n') {
                            if (BL2_P.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_P.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Q':
                        k = index[j];
                        while (BL2_Q.charAt(k) != '\n') {
                            if (BL2_Q.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Q.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'R':
                        k = index[j];
                        while (BL2_R.charAt(k) != '\n') {
                            if (BL2_R.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_R.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'S':
                        k = index[j];
                        while (BL2_S.charAt(k) != '\n') {
                            if (BL2_S.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_S.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'T':
                        k = index[j];
                        while (BL2_T.charAt(k) != '\n') {
                            if (BL2_T.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_T.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'U':
                        k = index[j];
                        while (BL2_U.charAt(k) != '\n') {
                            if (BL2_U.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_U.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'V':
                        k = index[j];
                        while (BL2_V.charAt(k) != '\n') {
                            if (BL2_V.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_V.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'W':
                        k = index[j];
                        while (BL2_W.charAt(k) != '\n') {
                            if (BL2_W.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_W.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'X':
                        k = index[j];
                        while (BL2_X.charAt(k) != '\n') {
                            if (BL2_X.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_X.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Y':
                        k = index[j];
                        while (BL2_Y.charAt(k) != '\n') {
                            if (BL2_Y.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Y.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case 'Z':
                        k = index[j];
                        while (BL2_Z.charAt(k) != '\n') {
                            if (BL2_Z.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Z.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case '-':
                    case '_':
                        k = index[j];
                        while (BL2_Dash.charAt(k) != '\n') {
                            if (BL2_Dash.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Dash.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    case ' ':
                        k = index[j];
                        while (BL2_Space.charAt(k) != '\n') {
                            if (BL2_Space.charAt(k) == '█') IO.print(Ch);
                            else IO.print(BL2_Space.charAt(k));
                            k++;
                        }
                        index[j] = k + 1;
                        break;

                    default:
                        IO.print("");
                        break;
                }
                IO.print(" ");
            }
            IO.print("\n");
        }

        return "=== %s ===".formatted(text);
    }

    // ----------------------- HELPER INPUT -------------------------
    private static int getInt() {
        while (true) {
            try {
                String s = input.nextLine();
                return Integer.parseInt(s.trim());
            } catch (Exception e) {
                System.out.print("Invalid number, try again: ");
            }
        }
    }
}

