import React from 'react'

const Toolbar = (props) => {
    const {isLogin, onClickLogin, onClickLogout } = props;

    return(
        <div>
            {isLogin && <div style={{padding: 24}}>안녕하세요 ○○○님</div>}
            {isLogin ?
                <button onClick={onClickLogout}>로그아웃</button> :
                <button onClick={onClickLogin}>로그인</button>
            }
        </div>
    )
}

export default Toolbar