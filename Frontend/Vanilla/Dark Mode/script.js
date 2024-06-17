const btn = document.getElementById('mode');
const cont = document.getElementById('cont');

btn.addEventListener('click', () => {
    document.body.classList.toggle('dark')
    btn.classList.toggle('dark')
})