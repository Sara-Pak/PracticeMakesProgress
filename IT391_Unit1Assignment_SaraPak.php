<?php 
// ------- Sara Pak | Unit 1 Assignment | Section 1 -------
// Fibonacci Series using recursion in PHP

echo '<br>'; // print blank line
echo "*********** Section 1 ***********"; // print section title
echo '<br>'.'<br>'; //print blank line


// Create a method called Fibonnacci which will recursively calculate the sequence for the number passed to it.
function Fibonacci($num){
      
    // if and else if to generate first two numbers
    if ($num == 0) // base case
        return 0;    
    else if ($num == 1) 
        return 1;    
      
    // Recursive Call to get the upcoming numbers
    else //general or recursive case
        return (Fibonacci($num-1) + Fibonacci($num-2));
}
  
// calling the Fibonacci($num) method and pass the value of 10
$num = 10;
for ($counter = 0; $counter < $num; $counter++){  
    echo Fibonacci($counter),' ';
}

echo '<br>'.'<br>';

// ------- Unit 1 Assignment | Section 2 -------

echo "*********** Section 2 ***********"; //print section title
echo '<br>'.'<br>'; // print blank line

// Create a method called factorial which will recursively calculate the number passed to it.
function factorial($num) 
{
    if ($num <= 1) 
    {
        return 1;
    } else {
        return $num * factorial($num - 1);
    }
}
$num = 4;
$factorial_value = factorial($num);
//echo "factorials $num = $factorial_value"; //remove after validating function

//create a loop to use factorial function to find and print factorials of every number from 1-4
function Factorial_loop($number)
{
$factorials = 1;
for ($i = 1; $i <= $number; $i++)
{
    $factorials = $factorials * $i;
}
return $factorials;
}
$number = 4;
$factorials = Factorial_loop($num);

echo "The number of 4 would be printed as $number! = $factorials";
?>