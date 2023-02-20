// 1059 - Números Pares
// https://www.beecrowd.com.br/judge/pt/problems/view/1059

using System;

class bee1059
{
    static void Main(string[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
                Console.WriteLine(i);
        }
    }
}