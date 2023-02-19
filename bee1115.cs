// 1115 - Quadrante
// https://www.beecrowd.com.br/judge/pt/problems/view/1115 

using System;

class URI
{

    public static void Main(string[] args)
    {
        int x,
            y;
        while (true)
        {
            string input = Console.ReadLine();
            string[] values = input.Split(
                new char[] { ' ' },
                StringSplitOptions.RemoveEmptyEntries
            );

            x = int.Parse(values[0]);
            y = int.Parse(values[1]);

            if (x == 0 || y == 0)
            {
                break;
            }
            if (x > 0 && y > 0)
            {
                Console.WriteLine("primeiro", x, y);
            }
            else if (x < 0 && y > 0)
            {
                Console.WriteLine("segundo", x, y);
            }
            else if (x < 0 && y < 0)
            {
                Console.WriteLine("terceiro", x, y);
            }
            else
            {
                Console.WriteLine("quarto", x, y);
            }
        }
    }
    
}