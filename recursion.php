<? <php>
// quick php program to find factorial by a given number
// --------------- using recursion ---------------

//recursion method to find the factorial by a given number
function factorial_using_recursion($n)
    {
        if ($n == 0)
        return 1;
        // the base case is triggered

        return $n * factorial_using_recursion($n - 1);
        // recursion calling the function
    }

    //--------------- using iteration ------------------------
    
    //iteration method to find the factorial by a given number
    function factorial_using_recursion($n)
        {
            $res = 1;
    
            //iteration method
            for ($i = 2; $i <= $n; $i++)
                $res *= $i;
    
            return $res;
    
        }
    
        //driver method
        $num = 5;
        print("Factorial of ".$num." using Recursion is: ". factorial_using_recursion(5). "\n");
        print("Factorial of ".$num." using Iteration is: ". factorial_using_recursion(5). "\n");
?>
