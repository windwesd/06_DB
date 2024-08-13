// main.js
document.addEventListener('DOMContentLoaded', function() {
  const phoneInput = document.getElementById('phone');

  phoneInput.addEventListener('input', function() {
      const value = phoneInput.value.replace(/[^0-9]/g, '');
      phoneInput.value = value;
  });
});
