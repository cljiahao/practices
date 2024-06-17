const btn = document.getElementById("btn");
const cont = document.getElementById("container");
const timeout = 3000;

btn.addEventListener("click", () => {
  const notif = document.createElement("div");

  notif.classList.add("toast");
  notif.innerText = "Boo!";
  notif.style.position = "fixed";
  notif.style.top = Math.floor(Math.random() * 90) + "%";
  notif.style.right = Math.floor(Math.random() * 90) + "%";
  notif.style.backgroundColor = "rgb(245, 245, 245)";
  notif.style.padding = "10px";

  console.log(Math.floor(Math.random() * 100) + "%");

  cont.appendChild(notif);

  setTimeout(() => {
    notif.remove();
  }, timeout);
});
