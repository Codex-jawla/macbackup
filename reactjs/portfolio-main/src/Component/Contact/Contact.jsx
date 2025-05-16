import ContactCss from "./Contact.css";
import { MdOutlineMail } from "react-icons/md";
import { ImTwitter } from "react-icons/im";
import { AiFillLinkedin } from "react-icons/ai";
import { AiFillGithub } from "react-icons/ai";
import { useRef } from "react";
import emailjs from "emailjs-com";
const Contact = () => {
  const form = useRef();
  const sendEmail = (e) => {
    e.preventDefault();

    emailjs.sendForm('service_gmynd9b', 'template_osx1rc8', form.current, 'vHrmtt4lyshGiinxv');
    e.target.reset();
  };
  return (
    <section id="contact">
      <h5>Get In Touch</h5>
      <h2>Contact Me</h2>
      <div className="container contact-container">
        <div className="contact_options">
          <article className="contact_option">
            <MdOutlineMail className="contact_option_icon" />
            <h4>Email</h4>
            <h5>himanshujawla028@gmail.com</h5>
            <a href="mailto:himanshujawla028@gmail.com">Send a Message</a>
          </article>
          <article className="contact_option">
            <ImTwitter className="contact_option_icon" />
            <h4>Twitter</h4>
            <h5>@HimanshuJawla2</h5>
            <a href="https://twitter.com/HimanshuJawla2?t=XYqo1Zr31xHmWSNhZLKbZA&s=09">Send a Message</a>
          </article>
          <article className="contact_option">
            <AiFillLinkedin className="contact_option_icon" />
            <h4>Linkedin</h4>
            <a href="https://www.linkedin.com/in/himanshu-jawla-4b8b54236">
              Send a Message
            </a>
          </article>
          <article className="contact_option">
            <AiFillGithub className="contact_option_icon" />
            <h4>GitHub</h4>
            <a href="https://github.com/Codex-jawla">
              Check Profile
            </a>
          </article>
        </div>
        <form ref={form} onSubmit={sendEmail} >
          <input type="text" name="name" placeholder="your name" />
          <input type="text" name="email" placeholder="your email" />
          <textarea
            name="message"
            placeholder="your message"
            id=""
            cols="30"
            rows="10"
            required
          ></textarea>
          <button type="submit" className="btn btn-primary">
            send message
          </button>
        </form>
      </div>
    </section>
  );
};
export default Contact;
