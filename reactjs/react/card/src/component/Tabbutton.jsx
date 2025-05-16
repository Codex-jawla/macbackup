import React from "react";

const Tabbutton = ({ children, onselect, isSelected }) => {
  return (
    <button
      className={`transition ease-in-out delay-80 hover:-translate-y-1 hover:scale-110  duration-300 m-2 ${
        isSelected ? "text-amber-300" : undefined
      }`} onClick={onselect}
    >
      {children}
    </button>
  );
};

export default Tabbutton;
