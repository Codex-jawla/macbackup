import './App.css'
import { BrowserRouter } from 'react-router-dom'
import Navbar from './components/Navbar'
import Top from './components/Top'
import About from './components/About'
import Contact from './components/Contact'
import Experience from './components/Experience'
import Project from './components/Project'

function App() {

  return (
    <>
    <BrowserRouter>
    <div className='relative z-0 bg-primary text-white '>
      <div className='bg-hero-pattern bg-cover bg-no-repeat bg-center bp '>
        <Navbar/>
        <Top/>
      </div>
      <About />
      <Experience />
      <Project />
      <div className='relative z-0'>
        <Contact />
      </div>
    </div>
    </BrowserRouter>
    </>
  )
}

export default App
