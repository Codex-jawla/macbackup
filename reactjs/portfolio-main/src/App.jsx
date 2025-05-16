import About from "./Component/About/About.jsx";
import Contact from "./Component/Contact/Contact.jsx";
import Experience from "./Component/Experience/Experience.jsx";
import Footer  from "./Component/Footer/footer.jsx";
import Header from "./Component/Header/Header.jsx";
import Nav from "./Component/Nav/Nav.jsx";
import Portfolio from "./Component/Project/Project.jsx";
const App=()=>{
    return (
        <>
        <Nav/>
        <Header/>

        <About/>
        <Experience/>

        <Portfolio/>
        <Contact/>
        <Footer/>

        </>
    )
}
export default App;