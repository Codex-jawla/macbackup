import React from 'react'
import {motion} from 'framer-motion'

const Top = () => {
  return (
    <section className='relative w-full h-screen mx-auto paddingx '>
        <div className="absolute inset-0 top-[120px] m-w-7xl flex mx-auto flex-row items-start gap-5">
            <div className="flex flex-col justify-center items-center mt-5 ml-[6vw]">
                <div className='w-5 h-5 rounded-full bg-[#915eff]'/>
                <div className='w-1 sm:h-40 h-60 bg-[#915eff]'/>
            </div>
            <div className="relative mt-[2vh]">
                <h1 className='text-white text-4xl font-bold mt-[3vh]'>Hi, I'm <span className="text-[#915eff]">Himanshu jawla</span></h1>
                <p className='text-white-100 mt-2 text-2xs '>Hey Everyone.<br className='sm:block hidden'/> I'm a Computer Science Student.<br className='sm:block hidden'/> Currently I'm learning Reactjs </p>
            </div>
        </div>
        
        
    </section>
  )
}

export default Top