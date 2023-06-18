// Smooth scrolling
const scrollLinks = document.querySelectorAll('a[href^="#"]');
for (const link of scrollLinks) {
  link.addEventListener('click', (e) => {
    e.preventDefault();
    const target = document.querySelector(link.getAttribute('href'));
    target.scrollIntoView({ behavior: 'smooth' });
  });
}
