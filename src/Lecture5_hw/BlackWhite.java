package Lecture5_hw;

/*Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть
teachmeskills.by
следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W*/
public class BlackWhite {
    public static void main(String[] args) {
        int Num = 8;
        String[][] string = new String[Num][Num];

        for (int i = 0; i < Num; i++)
        {
            for (int j = 0; j < Num; j++)
            {
                int sum = i + j;
                if ((sum) % 2 == 0)
                {
                    string[i][j] = "W";
                } else
                {
                    string[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < Num; i++)
        {
            for (int j = 0; j < Num; j++)
            {
                System.out.print(string[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
