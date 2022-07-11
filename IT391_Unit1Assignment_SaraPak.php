<?php 
// ------- Sara Pak | Unit 1 Assignment -------
// Fibonacci Series using recursion in PHP

echo '<br>';
echo "*********** Section 1 ***********", '<br>';
echo '<br>';

// Create a method called Fibonnaccii which will recursively calculate the sequence for the number passed to it.
function Fibonacci($num){
      
    // if and else if to generate first two numbers
    if ($num == 0)
        return 0;    
    else if ($num == 1)
        return 1;    
      
    // Recursive Call to get the upcoming numbers
    else
        return (Fibonacci($num-1) + Fibonacci($num-2));
}
  
// set to the number passed to Fibonacci($num) and return 15 elements
$num = 10;
for ($counter = 0; $counter < $num; $counter++){  
    echo Fibonacci($counter),' ';
}

?>