// 1004 - Produto Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1004

using System;

class bee1004
{

    static void Main(string[] args)
    {
        int A = Convert.ToInt32(Console.ReadLine());
        int B = Convert.ToInt32(Console.ReadLine());

        int PROD = A * B;

        Console.WriteLine("PROD = " + PROD);
    }
}