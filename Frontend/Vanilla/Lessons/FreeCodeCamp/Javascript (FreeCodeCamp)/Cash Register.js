function checkCashRegister(price, cash, cid) {
  let leftover = cash - price;
  let change = leftover
  let changeType = []
  let bool = []
  let n = 0;
  let arr = []
  
  cid.reverse().map(([i,j]) => {
    let k = j;
    let m = 0;
    n += j

    while (change - cashType(i) >= 0 && j != 0 && k != 0) {
      change = change.toFixed(2) - cashType(i).toFixed(2) 
      k = k - cashType(i).toFixed(2) 
      m++
    } 
    if (m >= 1){ 
      changeType.push([i,Number((j-k).toFixed(2))]) 
      arr.push(1)
    } else if (j == 0){
      arr.push(0)
    }
    if (j == 0) {
      bool.push(true)
    } else {
      bool.push(false)
    } 
}); cid.reverse()
  for (let a = 0; a < arr.length; a++) {
    if (arr.reverse()[a] === 0) {
      changeType.push(cid[a])
    }
  }
  if (bool.every(Boolean) | leftover == n) {
    return {'status' : "CLOSED", 'change' : changeType}
  }
  return (change == 0) ? {'status' : "OPEN", 'change' : changeType} : {'status' : "INSUFFICIENT_FUNDS", 'change' : []};
}

console.log(checkCashRegister(19.5, 20, [["PENNY", 0.5], ["NICKEL", 0], ["DIME", 0], ["QUARTER", 0], ["ONE", 0], ["FIVE", 0], ["TEN", 0], ["TWENTY", 0], ["ONE HUNDRED", 0]]));

function cashType(x) {
  switch(x) {
    case("ONE HUNDRED"):
    return 100
    case("TWENTY"):
    return 20
    case("TEN"):
    return 10
    case("FIVE"):
    return 5
    case("ONE"):
    return 1
    case("QUARTER"):
    return 0.25
    case("DIME"):
    return 0.1
    case("NICKEL"):
    return 0.05
    case("PENNY"):
    return 0.01
  }
}