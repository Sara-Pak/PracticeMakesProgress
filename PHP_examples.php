<?php
// echo + print displays strings
// difference: Echo has no return value while Print has a return of 1.
// print_r display info of an array
echo 'php rox';
echo 9;
print '<br>';
print 'i am so' . ' so tired.';

// creating variables $variable_name
$username = 'spak';
$num = 3;

echo '<br>';

echo $username;
echo '<br>';
echo $num;

echo '<br>';
/* constants -> an identifier (name) for a value
*  creating constants
*/
    define('constant', 'This is a constant');    
    define('number', 99, true);

    echo number;
    echo '<br>';
    echo constant;
    echo '<br>';

# or // is used for commenting for a single lines.

/*
is used for commenting multiple lines.
*/

//integers, floats/decimals, booleans, strings, null

$integer = 3;
var_dump($integer);
echo gettype($integer);
echo '<br>';

$float = 2.3;
var_dump($float);
echo gettype($float);
echo '<br>';

$bool = true;
var_dump($bool);
echo '<br>';

$var = "string";
$var = null;
var_dump($var);

/* if elseif else:
*  if (condition)
*   {
*  action
*   }
*/

$age = 18;

if ($age===12){
    echo "you should not be here";
    } elseif ($age===18) {
    echo "you're 18 years old, your perfectly welcome";
    } else {
    echo "you are welcome here";
    }

    /* while and the for loops
    *  initialize first
    *  while (//condition) {}
    *  the increment or the decrement
    */
        $i = 0;
        while ($i <= 10) {
            echo $i++; //increment
            echo "<br>";
        }

        $i = 20;
        while ($i < 0) {
            echo $i--; //decrement
            echo "<br>";
        }
        
        $i = 20;
        while ($i > 0) {
            echo "number is $i <br>";
            $i--;
        }
        for ($i = 0; $i<=20; $i++) {
            echo " value is: $i <br>";
        }

    /*  arrays and indexed arrays 
        indexed | associative array | multide
    */
        //indexed
        $users = ["jane", "mohamed", "raj", "jocey"];
        echo $users[2]; //raj
        echo count($users);

        //associative array
        $age = ['ahmed' => 33, 'jane' => 22, 'raj' => 23];

        

?> 
