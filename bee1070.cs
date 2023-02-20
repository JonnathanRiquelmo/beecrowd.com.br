// 1070 - Seis Números Ímpares
// https://www.beecrowd.com.br/judge/pt/problems/view/1070

using System;

class bee1070
{

    public static void Main(string[] args)
    {
        int i = 0;
        int count = 0;
        bool sixOddReached = false;
        int input = int.Parse(Console.ReadLine());

        while (!sixOddReached)
        {
            if ((input % 2 != 0) && i == 0)
            {
                Console.WriteLine(input);
                ++count;
                ++i;
            }
            if ((input + i) % 2 != 0)
            {
                Console.WriteLine(input + i);
                ++count;
            }
            if (count == 6)
            {
                sixOddReached = true;
            }
            ++i;
        }
    }
}