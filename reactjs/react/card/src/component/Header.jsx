import React from 'react'
import pic from '../static/pic.jpg'

const Header = () => {
  return (
    <header className="flex flex-col items-center mt-8 mb-16">
        <img src={pic} alt="pic" className="mb-4 w-44 h-44 object-contain" />
        <h1 className="text-4xl text-amber-800 font-semibold tracking-widest text-center uppercase">React Art</h1>
        <p className="text-stone-500">React have vast community support</p>
    </header>
  )
}

export default Header