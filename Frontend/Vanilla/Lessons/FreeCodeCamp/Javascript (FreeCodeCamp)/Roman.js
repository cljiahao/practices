// Converts until 3999
function convertToRoman(num) {
    let newarr = []
    let arr = num.toString().split("").reverse()
    for (let i = arr.length-1; i >= 0; i--) {
      let numerals = count(i)
      newarr.push(roman(arr[i],numerals))
    }
    return newarr.join("")
}

function count(x) {
  switch(x) {
    case(0):
    return ["I","V","X"]
    case(1):
    return ["X","L","C"]
    case(2):
    return ["C","D","M"]
    case(3):
    return ["M","",""]
  }
}

function roman(a,[b,c,d]) {
  switch(a) {
    case("1"):
    return b
    case("2"):
    return b+b
    case("3"):
    return b+b+b
    case("4"):
    return b+c
    case("5"):
    return c
    case("6"):
    return c+b
    case("7"):
    return c+b+b
    case("8"):
    return c+b+b+b
    case("9"):
    return b+d
  }
}
console.log(convertToRoman(97));