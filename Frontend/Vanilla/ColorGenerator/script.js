function fontColor(bgColor) {
  var color = bgColor.charAt(0) === "#" ? bgColor.substring(1, 7) : bgColor;
  var r = parseInt(color.substring(0, 2), 16); // hexToR
  var g = parseInt(color.substring(2, 4), 16); // hexToG
  var b = parseInt(color.substring(4, 6), 16); // hexToB
  var uicolors = [r / 255, g / 255, b / 255];
  var c = uicolors.map((col) => {
    if (col <= 0.03928) {
      return col / 12.92;
    }
    return Math.pow((col + 0.055) / 1.055, 2.4);
  });
  var L = 0.2126 * c[0] + 0.7152 * c[1] + 0.0722 * c[2];
  return L > 0.179 ? "#000000" : "#FFFFFF";
}

function randomColor() {
  const colorCont = document.getElementById("colour");
  const randomHex = Math.floor(Math.random() * 16777215).toString(16);
  colorCont.style.background = "#" + randomHex;
  colorCont.innerHTML = "#" + randomHex;
  colorCont.style.color = fontColor(randomHex);
}
