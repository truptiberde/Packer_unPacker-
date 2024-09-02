const form = document.getElementById('login-form');
const toast = document.getElementById('toast');
const showHideBtn = document.getElementById('show-hide-btn');

showHideBtn.addEventListener('click', () => {
    const passwordInput = document.getElementById('password');
    if (passwordInput.type == 'password') {
        passwordInput.type = 'text';
        showHideBtn.innerHTML = 'Hide';
    } else {
        passwordInput.type = 'password';
        showHideBtn.innerHTML = 'Show';
    }
});

form.addEventListener('submit', (e) => {
    e.preventDefault();
    const formData = new FormData(form);
    const username = formData.get('username');
    const password = formData.get('password');

    // TO DO: Implement login logic here
    // For demonstration purposes, assume login is successful
    toast.innerHTML = 'LOGIN SUCCESSFUL';
    toast.style.display = 'block';
    setTimeout(() => {
        toast.style.display = 'none';
    }, 3000);
});