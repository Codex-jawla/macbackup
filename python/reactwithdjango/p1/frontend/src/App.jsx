import { useState,useEffect } from 'react'
import './App.css'

function App() {

    const [data,setdata] = useState([])
    useEffect(()=>{
    async function fetchdata(){
    console.log(import.meta.env.VITE_API_URL);
    try{
    const response = await fetch(`${import.meta.env.VITE_API_URL}`);
    if (!response.ok){
    throw new Error('network issue');
    }
    const result = await response.json();
    console.log(result);
    setdata(result);
    } catch (error){
    console.log('error data fetching',error);
    }
    }
    fetchdata();
    },[])

  return (
    <>
    <h1>hello</h1>
    </>
  )
}

export default App
