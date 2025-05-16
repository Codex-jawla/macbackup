import project1 from "../../assets/portfolio11.jpeg";
import project2 from "../../assets/portfolio2.jpg";
import project3 from "../../assets/portfolio3.jpg";


import ProjectCss from "../Project/Project.css";

const Service=()=>
{
    return (
        <section id="Project">
            <h5>My Recent Work</h5>
            <h2>Project</h2>
            <section className="container project_container">
                <article className="project_item">
                    <div className="project_item_image">
                        <img src={project1} alt="" />
                    </div>
                    <h3>Portfolio</h3>
                    <div className="project_item_cta">
                    <a href="https://github.com/Codex-jawla/portfolio" className="btn" target="_blank">Github</a>
                    {/* <a href="https://github.com/Codex-jawla/portfolio" className="btn btn-primary" target="_blank">Live</a> */}
                    </div>
                   

                </article>
                <article className="project_item">
                    <div className="project_item_image">
                        <img src={project2} alt="" />
                    </div>
                    <h3>Library Management System</h3>
                    <div className="project_item_cta">
                    <a href="https://github.com/Codex-jawla/Library_management_System" className="btn" target="_blank">Github</a>
                    {/* <a href="https://github.com/Codex-jawla/Library_management_System" className="btn btn-primary" target="_blank">Live</a> */}
                    </div>
                   

                </article>
                <article className="project_item">
                    <div className="project_item_image">
                        <img src={project3} alt="" />
                    </div>
                    <h3>Real Time Chat Application</h3>
                    <div className="project_item_cta">
                    <a href="https://github.com/Codex-jawla/collage-project" className="btn" target="_blank">Github</a>
                    {/* <a href="https://github.com/Codex-jawla/collage-project" className="btn btn-primary" target="_blank">Live</a> */}
                    </div>
                   

                </article>
            </section>
        </section>

    )
}
export default Service;