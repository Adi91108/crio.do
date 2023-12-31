// str is input
function isPalindrome(str) {
    // write code here
    // do not console.log
    // return the 1 or 0
    let start = 0;
    let end = str.length - 1;

    while (start < end) {
        if (str[start] !== str[end]) {
            return 0; // Not a palindrome
        }
        start++;
        end--;
    }

    return 1; // Palindrome
}


var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    // if (lineNumber == 0) {
    //   size = parseInt(inputArr[0]);
    // }
    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const str = inputArr[0].trim();
    console.log(isPalindrome(str));
}
