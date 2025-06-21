import React, { useState } from 'react';
import { NavLink, useNavigate } from 'react-router-dom';
import ApiService from '../../service/ApiService';

function Navbar() {
    const [isMenuOpen, setIsMenuOpen] = useState(false);

    const isAuthenticated = ApiService.isAuthenticated();
    const isAdmin = ApiService.isAdmin();
    const isUser = ApiService.isUser();
    const navigate = useNavigate();

    const handleLogout = () => {
        const isLogout = window.confirm('Are you sure you want to logout this user?');
        if (isLogout) {
            ApiService.logout();
            navigate('/home');
        }
    };

    const getActiveClass = ({ isActive }) => (isActive ? 'active' : '');

    return (
        <nav className="navbar">
            <div className="navbar-header">
                <div className="navbar-brand">
                    <NavLink to="/home" className={getActiveClass}>InstaStay</NavLink>
                </div>
                <button className="menu-toggle" onClick={() => setIsMenuOpen(!isMenuOpen)}>☰</button>
            </div>

            <ul className={`navbar-ul ${isMenuOpen ? 'open' : ''}`}>
                {/* If admin, show only Admin and Logout */}
                {isAdmin ? (
                    <>
                        
                        <li><NavLink to="/admin/manage-rooms" className={getActiveClass}>Manage Rooms</NavLink></li>
                        <li><NavLink to="/admin/manage-bookings"  className={getActiveClass}>Manage Bookings</NavLink></li>
                        <li><NavLink to="/admin" className={getActiveClass}>Dashboard</NavLink></li>
                        <li><button onClick={handleLogout} className="logout-btn">Logout</button></li>
                    </>
                ) : (
                    <>
                        <li><NavLink to="/home" className={getActiveClass}>Home</NavLink></li>
                        <li><NavLink to="/rooms" className={getActiveClass}>Rooms</NavLink></li>
                        {isUser && <li><NavLink to="/find-booking" className={getActiveClass}>Find Booking</NavLink></li>}
                        

                        <li><NavLink to="/about" className={getActiveClass}>About Us</NavLink></li>
                        <li><NavLink to="/contact" className={getActiveClass}>Contact Us</NavLink></li>
                        
                        {!isAuthenticated && (
                            <>
                                <li><NavLink to="/login" className={getActiveClass}>Login</NavLink></li>
                            </>
                        )}

                        {isUser && <li><NavLink to="/profile" className={getActiveClass}>Profile</NavLink></li>}

                        {isAuthenticated && <li><button onClick={handleLogout} className="logout-btn">Logout</button></li>}
                    </>
                )}
            </ul>
        </nav>
    );
}

export default Navbar;
