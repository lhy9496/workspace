<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type=text id=data1>

<input type=text id=data2>

<button id=asJson>asJson</button>

<script>

$("#asJson").on("click",function(){

$.ajax({

url:"asJson",

data:{data1:$("#data1").val(), data2:$("#data2").val()},

success:function(resp){

console.log(resp.data1 + " : " + resp.data2);

}

})

})
</body>
</html>