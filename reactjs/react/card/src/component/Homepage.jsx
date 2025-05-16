import React, { useState } from "react";
import Tabbutton from "./Tabbutton";
import { tabdata } from "./data";

const Homepage = () => {
  const [content, setcontent] = useState();

  const onselectclick = (value) => {
    setcontent(value);
  };

  return (
    <>
      <div className="container ">
        <Tabbutton isSelected={content==='arrow'} onselect={() => onselectclick("arrow")}>
          Arrow Function
        </Tabbutton>
        <Tabbutton isSelected={content==='func'} onselect={() => onselectclick("func")}>Function</Tabbutton>
        <Tabbutton isSelected={content==='object'} onselect={() => onselectclick("object")}>Object</Tabbutton>
        <Tabbutton isSelected={content==='classes'} onselect={() => onselectclick("classes")}>Classes</Tabbutton>
      </div>
      {!content ? (
        <p>Please click on any topic.</p>
      ) : (
        <section className="border-1 divide-violet-800 m-6 w-3/12 h-fit shadow-lg shadow-zinc-500 backdrop-blur-md bg-white/30 ">
          <h3 className="m-2">{tabdata[content].title}</h3>
          <p className="m-2 ">{tabdata[content].discription}</p>
          <code className="m-2">{tabdata[content].code}</code>
        </section>
      )}
    </>
  );
}

export default Homepage;
