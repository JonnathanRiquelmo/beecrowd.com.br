// 1157 - Divisores I
// https://www.beecrowd.com.br/judge/pt/problems/view/1157

using System;

class URI
{

    public static void Main(string[] args)
    {
        int input = int.Parse(Console.ReadLine());

        for (int i = 1; i <= input; i++)
        {
            if (input % i == 0)
            {
                Console.WriteLine(i);
            }
        }
    }
    
}