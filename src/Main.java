import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo biến + kiểm tra kích thước mảng
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size doesnt exceed 20");
            }
        } while (size > 20); // Điều kiện dừng loop là size > 20. Để khi người dùng nhập vào số lớn hơn 20 thì vòng lặp
        // sẽ loop lại "do" bắt ng dùng nhập đúng số >= 20 thì thôi

        // Nhập giá trị cho phần tử mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // In ra mảng đã nhập
        System.out.printf("%-20s%s", "Element in aray: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Đảo ngược thứ tự trong mảng
        for (int x = 0; x < array.length / 2; x++) {
            int temp = array[x];
            array[x] = array[size - 1 - x];
            // Tại sao phải size-1 ? Vì x ban đầu = 0 nên nếu k trừ 1 thì sẽ thành size - 0 = độ dài của mảng = sai
            array[size - 1 - x] = temp;
        }

        // In ra mảng sau khi đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int z = 0; z < array.length; z++) {
            System.out.print(array[z] + "\t");
        }
    }
}
