<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .outer{
        background-color: black;
        color: white;
        width: 1000px;
        margin: auto;
        margin-top: 50px;
        padding: 10px 0 50px 0;
    }
    table{
        margin: auto;
    }

</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>

    <div class="outer">
        <br>
        <h2 align="center">회원가입</h2>
        <form action="<%=contextPath%>/insert.me" id="enroll-form" method="POST">
            <table>
                <tr>
                    <td>* 아이디</td>
                    <td><input type="text" name="userId" maxlength="12" required></td>
                    <td><button type="button" onclick="idCheck()">중복확인</button></td>
                </tr>
                <tr>
                    <td>* 비밀번호</td>
                    <td><input type="password" name="userPwd" maxlength="15" required></td>
                    <td></td>
                </tr>
                <tr>
                    <td>* 비밀번호 확인</td>
                    <td><input type="password" name="userPwdCheck" maxlength="15" required></td>
                    <td></td>
                </tr>
                <tr>
                    <td>* 이름</td>
                    <td><input type="text" name="userName" maxlength="6" required></td>
                    <td></td>
                </tr>
                <tr>
                    <td>전화번호</td>
                    <td><input type="text" name="phone" placeholder="- 포함해서 입력"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>이메일</td>
                    <td><input type="text" name="email"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td><input type="text" name="address"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>관심분야</td>
                    <td colspan="2">
                        <input type="checkbox" name="interest" id="movie" value="영화">
                        <label for="movie">영화</label>
                        <input type="checkbox" name="interest" id="sports" value="운동">
                        <label for="sports">운동</label>
                        <input type="checkbox" name="interest" id="hiking" value="등산">
                        <label for="hiking">등산</label>
                        <br>
                        <input type="checkbox" name="interest" id="game" value="게임">
                        <label for="game">게임</label>
                        <input type="checkbox" name="interest" id="fishing" value="낚시">
                        <label for="fishing">낚시</label>
                        <input type="checkbox" name="interest" id="cooking" value="요리">
                        <label for="cooking">요리</label>
                        <input type="checkbox" name="interest" id="etc" value="기타">
                        <label for="etc">기타</label>
                    </td>
                </tr>
            </table>

            <br><br>

            <div align="center">
                <button type="submit" onclick="return checkPwd();" disabled>회원가입</button>
                <button type="reset">초기화</button>
            </div>
        </form>
    </div>

    <script>
        function checkPwd(){
            const pwd = document.querySelector("#enroll-form input[name=userPwd]").value;
            const pwdCheck = document.querySelector("#enroll-form input[name=userPwdCheck]").value;

            if (pwd !== pwdCheck){
                alert("비밀번호가 일치하지 않습니다.")
                return false;
            }
        }
        
        function idCheck(){
        	//중복 확인 버튼 클릭 시 사용자가 입력한 아이디값을 서버에 보내서 조회요청(존재하는 아이디 여부 확인)
        	//1) 사용불가 => alert 메시지 출력(사용할 수 없는 아이디), 다시 입력
        	//2) 사용 가능 => 진짜 사용할 것인지 여부 확인
        	//				O => 아이디 수정 못하도록 회원가입 버튼 활성화
        	//				X => 다시 입력 유도
        	
        	const idInput = document.querySelector("#enroll-form input[name=userID]");
            console.log(idInput.value)

            //idInput.value 값을 서버로 보낼 ajax 사용
            

            //$.ajax()
            /**
             * $.ajax({
             *      type : 전송타입 GET | POST,
             *      url : 어디로 요청을 보낼지
             *      data : {key : value} -> 어떤 데이터를 포함해서 보낼지
             *      success : function(){} -> 성공시 실행되는 함수
             *      error : function(){} ->실패시 실행되는 함수
             * })
             *      
             * */
            
            console.log("ajax 출발")
            $.ajax({
                type : "GET",
                url: "idCheck.me",
                data: {
                    checkId : idInput.value
                },
                success: function(result){
                    if(ressult = "NNNNY"){
                    	if(confirm("사용가능한 아이디입니다. 사용하시겠습니까?")){
                            //아이디 수정을 막고 회원가입 버튼 활성
                    		idInput.setAttribute("readOnly", true);
                    		const submitBtn = document.queryselector()
                            submitBtn.removeAttribute("disabled");
                    	} else {
                    		alert("사용불가능한 아이디입니다.")
                            idInput.focus();
                    	}
                    }
                },
                error: function(err){
                    console.log("실패 : ", err)
                }
            })

            console.log("ajax 이후 코드")

        //     let data = {
        //     type : "GET",
        //     url: "idCheck.me",
        //     data: {
        //         checkId : idInput.value
        //     },
        //     success: function(res){
        //         console.log("성공 : ", res)
        //     },
        //     error: function(err){
        //         console.log("실패 : ", err)
        //     }
        // }
        // $.ajax(data)
        // function ajax(data){
        //     XMLHttpRequest -> 통신
        //     성공
        //     result
        //     data.success(result);
        // }
        }
    </script>
</body>
</html>