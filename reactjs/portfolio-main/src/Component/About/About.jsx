import AboutCss from "./About.css";
import Me from "../../assets/m1.jpg";
import { BsAward } from "react-icons/bs";
import { VscFolderLibrary } from "react-icons/vsc";
const About = () => {
  return (
    <section id="about">
      <h5>Get To Know</h5>
      <h2>About</h2>
      <div className="container about-container">
        <div className="about_me">
          <div className="about_me-image">
            <img src={Me} alt=" About-Image" />
          </div>
        </div>
        <div className="about_content">
          <div className="about_cards">
            <article className="about_card">
            <BsAward className="about-icon" />

              <h5>Experience</h5>
              <small>5+ Months </small>
            </article>

            <article className="about_card">
            <VscFolderLibrary className="about-icon" />

              <h5>Project</h5>
              <small>4</small>
            </article>
          </div>
          <p>
            Hey Everyone I'm Himanshu Jawla from 🇮🇳 India. I'm a open source enthusiast . Currently I'm learning Reactjs
            I'm a self taught developer and I love to learn new things on the go 
          </p>
          <a href="#contact" className="btn btn-primary">Let's Talk</a>
        </div>
      </div>
    </section>
  );
};
export default About;
