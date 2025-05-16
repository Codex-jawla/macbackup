import React from 'react'
import './App.css'
import logo from './logo.png'

const Header = () => {
  return (
    <>
        <div className="mainhead">
        <div className="imgs">
            <img src={logo} width={50} height={50} alt='logo' />
        </div>
        <div className="title">
            <h2>Notes</h2>
        </div>
        </div>
    </>
  )
}

export default Header