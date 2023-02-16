// 1002 - Área do Círculo
// https://www.beecrowd.com.br/judge/pt/problems/view/1002

using System;

class URI
{

    static void Main(string[] args)
    {
        double pi = 3.14159, r;

        r = Convert.ToDouble(Console.ReadLine());

        System.Console.WriteLine("A=" + (pi * (r * r)).ToString("0.0000"));
    }
}