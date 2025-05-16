import ExperienceCss from "./Experience.css";
import { BsPatchCheckFill } from "react-icons/bs";
const Experience = () => {
  return (
    <section id="experience">
      <h5>What skill I Have</h5>
      <h2>My Experience</h2>
      <div className="container experience_container">
        <div className="experience_frontend">
          <h3>Frontend & Backend Development</h3>
          <div className="experience_content">
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>HTML</h4>
              <small className="text-light">Experienced</small>
              </div>
          
            </article>
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>CSS</h4>
              <small className="text-light">Experienced</small>
              </div>
  
            </article>
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>JavaScript</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>

            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>Mysql</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
           
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>React</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
          </div>
        </div>
        <div className="experience_backend">
          <h3>Programming Skills</h3>
          <div className="experience_content">
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>Java</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>C++</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>DSA</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
            {/* <article className="experience_details">

              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>C</h4>
              <small className="text-light">Basic</small>
              </div>
            </article> */}
            <article className="experience_details">
              <BsPatchCheckFill className="experience_icon" />
              <div>
              <h4>Javascript</h4>
              <small className="text-light">Experienced</small>
              </div>
            </article>
          </div>
        </div>
      </div>
    </section>
  );
};
export default Experience;
