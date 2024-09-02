const form = document.getElementById('registration-form');
const toast = document.getElementById('toast');

form.addEventListener('submit', (e) => {
    e.preventDefault();
    const formData = new FormData(form);
    const password = formData.get('setPassword');
    const confirmPassword = formData.get('confirmPassword');

    if (password !== confirmPassword) {
        toast.innerHTML = 'PASSWORD SHOULD BE SAME !';
        toast.style.display = 'block';
        setTimeout(() => {
            toast.style.display = 'none';
        }, 3000);
        return;
    }

    const fields = ['firstName', 'middleName', 'surname', 'dateOfBirth', 'gender', 'department', 'phoneNumber', 'emailAddress', 'username', 'setPassword', 'confirmPassword'];
    let isValid = true;

    fields.forEach((field) => {
        if (!formData.get(field)) {
            isValid = false;
        }
    });

    if (!isValid) {
        toast.innerHTML = 'PLEASE FILL ALL THE FIELDS';
        toast.style.display = 'block';
        setTimeout(() => {
            toast.style.display = 'none';
        }, 3000);
        return;
    }

    toast.innerHTML = 'REGISTRATION SUCCESSFUL';
    toast.style.display = 'block';
    setTimeout(() => {
        toast.style.display = 'none';
        window.location.href = 'login.html';
    }, 3000);
});