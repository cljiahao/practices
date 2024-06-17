function rot13(str) {
  let newarr = []
  for (let i = 0; i < str.length; i++) {
    if ( 65 <= str.charCodeAt(i) && str.charCodeAt(i) <= 122) {
      if ((str.charCodeAt(i) - 13) < 65) {
      newarr.push(String.fromCharCode(45 + str.charCodeAt(i)))
    } else {
      newarr.push(String.fromCharCode(str.charCodeAt(i) - 13))
    }
  } else {
    newarr.push(String.fromCharCode(str.charCodeAt(i)))
  }
}
  return newarr.join("").toUpperCase();
}

rot13("SERR PBQR PNZC");