// arr is the array of numbers, n is the number fo elements
function sortString(strArray) {
    return strArray.sort();
  
  }
  /*Do not change the code below */
  
  var readline = require("readline").createInterface(process.stdin);
  
  let inputArr = [];
  var lineNumber = -1;
  var inputSize;
  
  //multipleline input from User
  readline.on("line", readInputs);
  
  function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
  
    //Exit Condition
    if (lineNumber == 0) {
      logic("s");
      readline.close();
    }
  }
  
  function logic(input) {
    let str=JSON.parse(inputArr[0].trim());
    console.log(sortString(str).join(" ").trim())
  }