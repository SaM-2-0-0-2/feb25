import React from 'react';

function ContactPage() {
    const backgroundStyle = {
        backgroundImage: "url('./assets/images/instaabout.png')",
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
        minHeight: "100vh",
        padding: "2rem",
    };

    return (
        <div className="page-container" style={backgroundStyle}>
            <div className="contact-box">
                <h2>Contact Us</h2>
                <p>If you have any questions or need assistance, feel free to reach out to us!</p>

                <div className="contact-info">
                    <p><strong>Email:</strong> support@instastay.com</p>
                    <p><strong>Phone:</strong> +91-9876543210</p>
                    <p><strong>Address:</strong> 123 InstaStay Lane, Mumbai, India</p>
                </div>

                <p>Our support team is available from <strong>9 AM to 6 PM</strong>, <strong>Monday to Saturday</strong>.</p>

                <div className="map-section">
                    <h4>Find Us on Map</h4>
                    <iframe
                        title="InstaStay Location"
                        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d241317.11609802312!2d72.74110118127067!3d19.082522320172886!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b63ce8f1e8a7%3A0x51c1cf92c47b1aa3!2sMumbai%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1621084607641!5m2!1sen!2sin"
                        width="100%"
                        height="300"
                        style={{ border: 0 }}
                        allowFullScreen=""
                        loading="lazy"
                    ></iframe>
                </div>
            </div>
        </div>
    );
}

export default ContactPage;

