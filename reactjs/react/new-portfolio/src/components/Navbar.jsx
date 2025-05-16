import React, { useState } from "react";
import './all.css'
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import close from "../assets/close.png";
import menu from "../assets/menu.png";

const Navbar = () => {
  const [active, setactive] = useState("");
  const [toggle, settoggle] = useState(false);
  return (
    <>
      {/* <p>navbar</p> */}
      <nav className="w-full flex items-center py-5 fixed top-0 bg-primary text-white z-20 paddingx">
        <div className="w-full flex justify-between items-center m-w-7x1 mx-auto">
          <Link
            to="./"
            className="flex items-center gap-2"
            onClick={() => {
              setactive('')
              window.scrollTo(0, 0);
            }}
          >
            <img src={logo} alt="logo" className="w-9 h-9 object-contain" />
            <p className="font-bold text-[18] text-white cursor-pointer flex">
              Himanshu &nbsp;<span className="sm:block">Jawla</span>
            </p>
          </Link>
          <ul className="list-none hidden sm:flex flex-row gap-10 text-white-500 pr-10 cursor-pointer hover:text-red">
            <li>About</li>
            <li>Work</li>
            <li>Contact</li>
          </ul>
          <div className="sm:hidden flex flex-1 justify-end items-center h">
            <img
              src={toggle ? close : menu}
              alt="img"
              className="w-[20] h-[20] object-contain cursor-pointer"
              onClick={() => {
                settoggle(!toggle);
              }}
            />
            <div className={`${!toggle ? 'hidden' :'flex' } p-1 black-gradient absolute top-20 right-0 mx-4 my-1 min-w[140px] z-5 rounded-x1 `}>
            <ul className="list-none flex justify-end items-start flex-col gap-4 text-red-500 pr-10 cursor-pointer hover:text-red" onClick={()=>{settoggle(!toggle)}} >
            <li className="font-poppins font-medium cursor-pointer text-[16px]" >About</li>
            <li className="font-poppins font-medium cursor-pointer text-[16px]" >Work</li>
            <li className="font-poppins font-medium cursor-pointer text-[16px]" >Contact</li>
          </ul>
            </div>
          </div>
        </div>
      </nav>
    </>
  );
};

export default Navbar;
