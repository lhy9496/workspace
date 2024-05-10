import React, {useState} from 'react'
import Toolbar from './Toolbar'

const LandingPage = () => {
    const [isLogin, setIsLogin] = useState(false);

    const onClickLogin = () => {
        setIsLogin(true)
    }

    const onClickLogout = () => {
        setIsLogin(false)
    }

    return(
        <div>
            <Toolbar 
                isLogin = {isLogin}
                onClickLogin = {onClickLogin}
                onClickLogout = {onClickLogout}
            />
            <div style={{padding: 24}}>KH 정보교육원</div>
        </div>
    )
}

export default LandingPage