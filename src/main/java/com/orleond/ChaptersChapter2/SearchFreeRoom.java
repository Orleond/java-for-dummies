package com.orleond.ChaptersChapter2;
/*
 * Код, находящийся в блоке public static void main является
 * примером из книги. Весь остальной код дописан для того,
 * чтобы программа действительно работала
 */
import static java.lang.System.exit;
import static java.lang.System.out;

public class SearchFreeRoom {
    private static int roomNum;
    private static int[] guests;

    static {
        guests = new int[100];
        for (int i = 0; i < 100; i++) {
            guests[i] = 1;
        }
    }
    public static void main(String[] args) {
        // Это фрагмент программы на Java,
        // а не готовая программа
        roomNum = 1;
        while (roomNum < 100) {
            if (guests[roomNum] == 0) {
                out.println("Комната " + roomNum + " свободна.");
                exit(0);
            } else {
                roomNum++;
            }
        }
        out.println("Свободные комнаты отсутствуют.");
    }
}
