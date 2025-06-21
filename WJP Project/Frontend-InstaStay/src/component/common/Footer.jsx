

import { FaInstagram, FaEnvelope, FaFacebookF, FaLinkedinIn, FaTwitter } from "react-icons/fa";

const FooterComponent = () => {
    return (
        <footer className="my-footer">
            <div className="footer-content">
                <span>
                    © {new Date().getFullYear()} <strong>InstaStay</strong> | All Rights Reserved
                </span>
                <div className="footer-icons">
                    <a
                        href="https://www.instagram.com/instastay"
                        target="_blank"
                        rel="noopener noreferrer"
                        className="instagram"
                        title="Instagram"
                    >
                        <FaInstagram className="footer-icon" /> 
                    </a>
                    <a
                        href="https://www.facebook.com"
                        target="_blank"
                        rel="noopener noreferrer"
                        className="facebook"
                        title="Facebook"
                    >
                        <FaFacebookF className="footer-icon" /> 
                    </a>
                    <a
                        href="https://www.linkedin.com"
                        target="_blank"
                        rel="noopener noreferrer"
                        className="linkedin"
                        title="LinkedIn"
                    >
                        <FaLinkedinIn className="footer-icon" /> 
                    </a>
                    <a
                        href="https://www.twitter.com"
                        target="_blank"
                        rel="noopener noreferrer"
                        className="twitter"
                        title="Twitter"
                    >
                        <FaTwitter className="footer-icon" /> 
                    </a>
                </div>
            </div>
        </footer>
    );
};

export default FooterComponent;





