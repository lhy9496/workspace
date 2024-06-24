<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Header</title>
</head>
<body>
    <a id="naverLoginLink">네이버로그인</a>
    <script>
        //네이버 로그인 설정
        window.onload=function(){
            const clientId = "(네이버 clientId)";
            //리다이렉트 URI를 utf-8로 인코딩해서 저장
            const redirectURI = encodeURIComponent("http://localhost:port/host/naver-login");

            const state = Math.random.toString(36).substring(2);
            //로그인 api url
            const apiURL = 'https:nid.naver.com/oauth2.0/authorize?response_type=code&'
                + 'client_id=' + clientId + '&redirect_uri=' + redirectURI + '&state=' + state;
            
            const loginBtn = document.getElementbyID('naverLoginLink');
            loginBtn.href = apiURL;
        }
    </script>
</body>
</html>