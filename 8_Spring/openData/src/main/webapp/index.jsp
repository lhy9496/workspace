<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<script src ="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
    <h2>실시간 대기오염 정보</h2>

    지역 :
    <select id = "location">
        <option>서울</option>
        <option>부산</option>
        <option>대전</option>
    </select> <%-- 내용이 많아 3개만 option 지정 --%>
    <button id = "btn1">해당 지역 대기오염 정보</button>
    <br><br>
    <table id = "result1" border = "1">
        <thead>
            <tr>
                <th>측정소명</th>
                <th>측정일시</th>
                <th>통합대기환경수치</th>
                <th>미세먼지농도</th>
                <th>일산화탄소농도</th>
                <th>이산화질소농도</th>
                <th>아황산가스농도</th>
                <th>오존농도</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <script>
        $(function(){
            $("#btn1").click(function(){
                $.ajax({
                    url:"air.do",
                    data:{location:$("#location").val()},
                    success:function(data){
                        const itemArr = data.response.body.items;
                        let value = "";
                        for(let i in itemArr){
                            value = 
                            `<td>` + i.stationName + `</td>
                            <td>` + i.dataTime + `</td>
                            <td>` + i.khaiValue + `</td>
                            <td>` + i.pm10Value + `</td>
                            <td>` + i.coValue + `</td>
                            <td>` + i.no2Value + `</td>
                            <td>` + i.so2Value + `</td>
                            <td>` + i.o3Value + `</td>`;
                        }
                        $("#result1 tbody").html(value);
                    }
                })
            })
        })
    </script>
</body>
</html>