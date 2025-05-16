import React, { useEffect } from "react";

import "./textsphere.css";

import TagCloud from "TagCloud";

const Textsphere = () => {
  useEffect(() => {
    return () => {
      const container = ".tagcloud";
      const texts = [
        "HTML",
        "CSS",
        "JavaScript",
        "React js",
        "Java",
        "C++",
        "DSA",
        "Intellij",
        "AIML",
        "Python",
        "Three js",
        "GITHUB",
      ];

      const options = {
        radius: 300,
        maxSpeed: "normal",
        initSpeed: "normal",
        keep: true,
      };

      TagCloud(container, texts, options);
    };
  }, []);

  return (
    <>
      <div className="text-shpere">
        <span className="tagcloud"></span>
      </div>
    </>
  );
};

export default Textsphere;
