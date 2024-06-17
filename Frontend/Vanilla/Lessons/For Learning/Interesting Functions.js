
// ${...} : Place this in a string to return variables in this. 
// Example : 
let name = Clarence;
alert("Hi ${name}") // >> Returns "Hi Clarence"

// alert() : Returns an alert with ok button
// prompt() : Returns input box
// confirm() : Returns confirm with ok & cancel

// ++counter : Add first
// counter++: Returns counter first
// Example :
let counter = 0;
++counter // add 1 then returns 1
counter++ // Returns 1 then add 1

// Number("123") is the same as +"123"
// It returns 123 as an integer/number

// == equality check
// === strict equality check
// Example :  
"" == false; // >> Returns True 
"" === false; // >> Returns False

// If the conditional operator returns this or that, can use "?" instead [** More than 2 options, use if-else statements **]
// Example :
let results;
    if (price<100) {
        results = "Cheap"
    } else { 
        results = "Expensive"
    }

// Instead use:
    let results = (price<100) ? "Cheap" : "Expensive";


// "??" operator returns default if first variable is undefined.
// Example :
alert(user ?? "Anonymous"); // returns "Anonymous" because user is not defined.

/* Having a labelname for for loop allow you break outer loop. 
 Example : 
 labelName: for (...) {
     inner: for(...){
     break labelName // break outerloop
    }
 }
*/

// Understanding How functions works is extremely important!!!

function sayHi(Name); //>> is Global Function [Will be declared before anything else]
let sayhi() = function(Name); // >> is not Global