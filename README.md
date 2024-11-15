<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Md Mamun Ur Rashid - GitHub Profile</title>
  <style>
    /* General reset and font */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: Arial, sans-serif;
    }

    body {
      background-color: #121212;
      color: white;
      line-height: 1.6;
    }

    h1, h2, h3 {
      text-align: center;
      margin-bottom: 1rem;
    }

    p {
      margin: 1rem 0;
    }

    .fade-in {
      animation: fadeIn 2s ease-in-out;
    }

    /* Fade-in animation */
    @keyframes fadeIn {
      0% {
        opacity: 0;
      }
      100% {
        opacity: 1;
      }
    }

    /* Tech Stack Icons Bounce */
    @keyframes bounce {
      0%, 100% {
        transform: translateY(0);
      }
      50% {
        transform: translateY(-10px);
      }
    }

    .tech-icon {
      animation: bounce 1.5s infinite;
      margin: 0 10px;
    }

    .lottie-container {
      margin-top: 20px;
      max-width: 400px;
      margin: 0 auto;
      padding-bottom: 20px;
    }

    .tech-stack img {
      width: 50px;
      height: 50px;
      animation: bounce 1.5s infinite;
    }

    .links a {
      color: #61dafb;
      text-decoration: none;
      padding: 5px;
    }

    .links a:hover {
      text-decoration: underline;
    }

    .achievement-stats {
      text-align: center;
    }

    /* Styling for Email and Contact Links */
    .links {
      text-align: center;
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <h1>👋 Hi, I’m <strong>Md Mamun Ur Rashid</strong></h1>

  <p class="fade-in">🌟 <strong>Welcome to my GitHub!</strong> 🌟</p>
  <p class="fade-in">I’m a <strong>Full-Stack Developer</strong> from <strong>Bangladesh</strong> passionate about building dynamic, user-friendly web applications. Here's a little about me:</p>

  <hr>

  <h2 class="fade-in">🧑‍💻 About Me</h2>
  <p class="fade-in">- 🔭 I’m currently working on exciting <strong>React</strong> and <strong>Node.js</strong> projects.</p>
  <p class="fade-in">- 🌱 I’m expanding my skills by learning <strong>Python</strong>, <strong>MongoDB</strong>, and backend development.</p>
  <p class="fade-in">- 👀 I’m deeply interested in <strong>web development</strong>, creating intuitive user experiences, and exploring new technologies.</p>
  <p class="fade-in">- 📫 Reach me at: <a href="mailto:md.mamun.ur.rashid.cse@gmail.com">md.mamun.ur.rashid.cse@gmail.com</a></p>
  <p class="fade-in">- 🌐 Wanna know more about me? <a href="https://mamunurrashid.netlify.app" target="_blank">Visit my portfolio</a></p>

  <hr>

  <h2 class="fade-in">🏆 Achievements & Stats</h2>
  <div class="lottie-container">
    <div id="lottie-achievements"></div>
  </div>
  <div class="achievement-stats">
    <p class="fade-in">
      <a href="https://github.com/anuraghazra/github-readme-stats">
        [![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=MamunUrRashidAIUB&layout=compact&theme=radical)](https://github.com/anuraghazra/github-readme-stats)
      </a>
    </p>
    <p class="fade-in">
      <a href="https://github.com/ryo-ma/github-profile-trophy">
        [![trophy](https://github-profile-trophy.vercel.app/?username=MamunUrRashidAIUB&theme=dracula&margin-w=15)](https://github.com/ryo-ma/github-profile-trophy)
      </a>
    </p>
    <p class="fade-in">
      <a href="https://git.io/streak-stats">
        [![GitHub Streak](https://streak-stats.demolab.com?user=MamunUrRashidAIUB&theme=dark)](https://git.io/streak-stats)
      </a>
    </p>
  </div>

  <hr>

  <h2 class="fade-in">🚀 Tech Stack</h2>
  <div class="tech-stack fade-in">
    <img src="https://techstack-generator.vercel.app/js-icon.svg" alt="JavaScript" class="tech-icon">
    <img src="https://techstack-generator.vercel.app/csharp-icon.svg" alt="C#" class="tech-icon">
    <img src="https://techstack-generator.vercel.app/react-icon.svg" alt="React" class="tech-icon">
    <img src="https://techstack-generator.vercel.app/nginx-icon.svg" alt="Nginx" class="tech-icon">
    <img src="https://techstack-generator.vercel.app/mysql-icon.svg" alt="MySQL" class="tech-icon">
    <img src="https://techstack-generator.vercel.app/python-icon.svg" alt="Python" class="tech-icon">
  </div>

  <hr>

  <h2 class="fade-in">🌟 Highlights</h2>
  <ul class="fade-in">
    <li>🌐 Experienced in creating responsive websites using <strong>React</strong>, <strong>CSS</strong>, and <strong>JavaScript</strong>.</li>
    <li>🖥️ Skilled in backend technologies like <strong>Node.js</strong>, <strong>MySQL</strong>, and <strong>MongoDB</strong> for database management.</li>
    <li>📊 Passionate about problem-solving and continuously enhancing my coding skills.</li>
    <li>📘 Enjoy exploring and experimenting with <strong>new technologies</strong>.</li>
  </ul>

  <hr>

  <h2 class="fade-in">📫 Let's Connect!</h2>
  <div class="links fade-in">
    <p>Feel free to reach out or connect with me:</p>
    <a href="mailto:md.mamun.ur.rashid.cse@gmail.com">📧 Email</a> | 
    <a href="https://mamunurrashid.netlify.app" target="_blank">🌐 Portfolio</a> | 
    <a href="https://linkedin.com/in/mamunurrashid" target="_blank">💼 LinkedIn</a> | 
    <a href="https://twitter.com/Mamun_Dev" target="_blank">🐦 Twitter</a>
  </div>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/bodymovin/5.7.10/lottie.min.js"></script>
  <script>
    // Load the Lottie animation for achievements
    const animation = lottie.loadAnimation({
      container: document.getElementById('lottie-achievements'),
      renderer: 'svg',
      loop: true,
      autoplay: true,
      path: 'https://assets7.lottiefiles.com/packages/lf20_0rf7jlms.json' // Example Lottie animation
    });
  </script>
</body>
</html>
