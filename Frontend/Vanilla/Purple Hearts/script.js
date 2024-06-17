function createHeart() {
    const timeout = 3000;
    const heart = document.createElement('div');
    heart.classList.add('heart')
    heart.style.left = Math.random() * 100 + 'vw'
    heart.style.animationDuration = Math.random() * 2 + 3 + 's'
    heart.innerText = '💜';
    document.body.appendChild(heart)
    
    setTimeout(() => {
        heart.remove()
    }, timeout);

}

const interval = 100;

setInterval(createHeart,interval);