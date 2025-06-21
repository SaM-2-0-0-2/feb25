import React from 'react';

function AboutPage() {
    // Inline style for background image
    const backgroundStyle = {
        backgroundImage: "url('./assets/images/instaabout.png')", // Place image in /public/assets/
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
        backgroundAttachment: "fixed",
        minHeight: "100vh",
        padding: "2rem",
    };

    return (
        <div className="page-container" style={backgroundStyle}>
            {/* About Section */}
            <div className="about-section-container">
                <div className="about-info-box">
                    <h2>About InstaStay</h2>
                    <p>
                        Welcome to <strong>InstaStay</strong> – your trusted platform for booking comfortable and affordable hotel rooms across India.
                    </p>
                    <p>
                        Our goal is to simplify room booking with a user-friendly system, secure payment, and seamless management for both users and admins.
                    </p>
                    <ul>
                        <li>Wide range of hotel listings</li>
                        <li>Easy booking and cancellation</li>
                        <li>Admin panel for hotel managers</li>
                        <li>Secure user authentication</li>
                    </ul>
                    <p>Thank you for choosing InstaStay. Your comfort is our priority.</p>
                </div>
            </div>

            {/* Developer Section */}
            <div className="developer-section-wrapper">
                <div className="developer-info-container">
                    <h2>Meet the Developers</h2>
                    <div className="developer-cards">
                        <div className="developer-card">
                            <img src="./assets/images/sanket.png" alt="Sanket Kavanekar" className="student-pic" />
                            <h4>Sanket Kavanekar</h4>
                            <p>Developed frontend UI using React with Vite, styled with TailwindCSS, and integrated form validation and navigation.</p>
                        </div>
                        <div className="developer-card">
                            <img src="./assets/images/shriram.png" alt="Shriram Sabade" className="student-pic" />
                            <h4>Shriram Sabade</h4>
                            <p>Handled complete backend system including role-based APIs, routing, and database connectivity using Java and Spring Boot.</p>
                        </div>
                        <div className="developer-card">
                            <img src="./assets/images/amansharma.png" alt="Aman Sharma" className="student-pic" />
                            <h4>Aman Sharma</h4>
                            <p>Designed and optimized MySQL schema, performed testing with Postman, and managed deployment and debugging.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default AboutPage;

