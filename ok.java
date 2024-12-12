window.onload = function() {
    const video = document.querySelector("video");
    video.play();
};
<script>
    document.getElementById('themeToggle').addEventListener('click', () => {
        document.body.classList.toggle('dark-mode');
    });
</script>
