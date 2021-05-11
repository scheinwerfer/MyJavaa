public class Lottery {
    public static void main(String[] args) {
        int[] nums = new int[50];

        for (int i = 1; i < 50; i++) // Заполняем массив числами от 1 до 49
        {
            nums[i] = i;
        }
        for (int i = 1; i < 50; i++) { // Перемешиваем массив
            int r = (int) Math.ceil(Math.random() * 49);
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }
        for (int i = 1; i < 7; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
