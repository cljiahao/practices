const openbtn = document.getElementById("Open")
const closebtn = document.getElementById("Close")
const popup = document.getElementById("cont")

openbtn.addEventListener("click", () => {
    popup.classList.add("active")    
})

closebtn.addEventListener("click", () => {
    popup.classList.remove("active")    
})