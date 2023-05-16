import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Scanner scanner = new Scanner(System.in);

        boolean existElement = true;
        int indexDel = 0;
        do{
            existElement = true;
            System.out.println("Nhap phan tu can xoa");
            int x = scanner.nextInt();
            for (int i = 0; i < array.length; i++){
                existElement = true;
                if (array[i] == x){
                    indexDel = i;
                    break;
                }else {
                    existElement = false;
                }
            }
            if (existElement == false){
                System.out.println("k co phan tu - nhap lai");
            } else {
                System.out.println(indexDel);
            }
        }while (existElement == false);
        show(array);
        removeElement(indexDel,array);

    }
    public static void removeElement(int index, int[] arr) {
        for (int j = index; j < arr.length -1 ; j++) {
            arr[j] = arr[j+1];
            if (j == arr.length - 2){
                arr[j+1] = 0;
            }
        }
        show(arr);
        }
    public static void show(int[] arr){

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    }

