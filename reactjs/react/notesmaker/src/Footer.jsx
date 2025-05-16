import React from 'react'

const Footer = () => {
    const year=new Date().getFullYear();
  return (
    <>
        <div className="mainfoot">
            <p>© {year}, All Rights Reserved. Designed by: Himanshu Jawla</p>
        </div>
    </>
  )
}

export default Footer