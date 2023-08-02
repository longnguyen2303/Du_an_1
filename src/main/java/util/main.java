/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author thangncph26123
 */
public class main {
    public static int calculateTotalCandies(int n, int c, int m) {
        int totalCandies = n / c;
        int wrappers = n / c;

        while (wrappers >= m) {
            System.out.println(wrappers + " : 1");
            int exchangedCandies = wrappers / m;
            totalCandies += exchangedCandies;
            wrappers = wrappers - exchangedCandies * m + exchangedCandies;
            System.out.println(wrappers + " : 2");
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        int n = 10;  // Số tiền Bob có
        int c = 2;   // Giá của một viên kẹo
        int m = 5;   // Số tờ giấy gói kẹo để đổi 1 viên kẹo mới

        int totalCandies = calculateTotalCandies(n, c, m);
        System.out.println("Tổng số kẹo Bob có thể mua được: " + totalCandies);
    }
}
