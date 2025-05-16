import { BsTwitter } from 'react-icons/bs';
import { BsGithub } from 'react-icons/bs';
import { BsLinkedin } from 'react-icons/bs';
import { AiOutlineMail } from 'react-icons/ai';
import { AiFillInstagram } from 'react-icons/ai';



const Social=()=>
{
    return (
        <div className="Social">
            <a href="https://twitter.com/HimanshuJawla2?t=XYqo1Zr31xHmWSNhZLKbZA&s=09"> <BsTwitter/></a>
            <a href="https://github.com/Codex-jawla"><BsGithub/></a>
            <a href="https://www.linkedin.com/in/himanshu-jawla-4b8b54236"><BsLinkedin/></a>
            <a href=""><AiOutlineMail/></a>
            <a href="https://instagram.com/_jawla_5911?igshid=YmMyMTA2M2Y="><AiFillInstagram/></a>
        </div>
 
    )
}
export default Social;