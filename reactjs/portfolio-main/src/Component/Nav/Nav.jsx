import NavCss from './Nav.css';
import { AiOutlineHome } from 'react-icons/ai';
import {AiOutlineUser} from 'react-icons/ai'
import {BiBook} from 'react-icons/bi'
import {BiMessageSquareDetail} from 'react-icons/bi'

import {RiServiceLine} from 'react-icons/ri'
import { useState } from 'react';
const Nav=()=>{
    const [activeNav,setActiveNav]=useState('#');
    console.log(activeNav);
    return (
       <nav>
        <a href="#" onClick={()=>setActiveNav('#')} className={activeNav==='#' ? 'active' : ''}><AiOutlineHome/></a>
        <a href="#about" onClick={()=>setActiveNav('#about')} className={activeNav==='#about' ? 'active' : ''}><AiOutlineUser/></a>
        <a href="#Project" onClick={()=>setActiveNav('#service')} className={activeNav==='#service' ? 'active' : ''}><RiServiceLine/></a>
        <a href="#contact" onClick={()=>setActiveNav('#contact')} className={activeNav==='#contact' ? 'active' : ''}><BiMessageSquareDetail/></a>




       </nav>
    )
}
export default Nav;