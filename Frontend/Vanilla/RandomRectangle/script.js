const row = 3;
const column = 5;
const max_width = document.body.clientWidth / column;
const max_height = document.body.clientHeight / row;
const min_width = max_width * 0.3;
const min_height = max_height * 0.3;

function create_rectangles() {
  const rand_num = row * column;
  for (let i = 0; i < rand_num; i++) {
    let randomHex = "ffffff";
    do {
      randomHex = Math.floor(Math.random() * 16777215).toString(16);
    } while (randomHex === "ffffff");

    const container = document.createElement("div");
    container.style.position = "relative";
    container.style.width = max_width + "px";
    container.style.height = max_height + "px";
    document.body.appendChild(container);

    const rectangle = document.createElement("div");
    rectangle.classList.add("rectangle");
    rectangle.id = "rectangle" + i;
    rectangle.style.backgroundColor = "#" + randomHex;
    rectangle.style.borderRadius = "15px";
    rectangle.style.width =
      Math.floor(
        Math.random() * (max_width * 0.9 - min_width + 1) + min_width
      ) + "px";
    rectangle.style.height =
      Math.floor(
        Math.random() * (max_height * 0.9 - min_height + 1) + min_height
      ) + "px";

    const offset_amt_x = Math.floor(
      Math.random() * (min_width - min_height + 1)
    );
    const offset_amt_y = Math.floor(
      Math.random() * (min_width - min_height + 1)
    );
    console.log(offset_amt_x, offset_amt_y);
    rectangle.style.position = "absolute";
    rectangle.style.top = offset_amt_y + "px";
    rectangle.style.left = offset_amt_x + "px";

    rectangle.onmouseover = function () {
      this.style.transform = "scale(1.15)";
    };
    rectangle.onmouseleave = function () {
      this.style.transform = "scale(1)";
    };
    container.appendChild(rectangle);
  }
}
