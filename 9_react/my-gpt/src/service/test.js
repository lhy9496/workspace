const testAPI = (data, callback) => {
    setTimeout(() => { //비동기통신에서 필요한 데이터 전달
        callback("안녕")
    }, 1000);
}


testAPI({id: 10}, (res) => (
    //결과 res를 사용
    testAPI({id: res}, (res2) => {
        testAPI({id: res2}, (res3) =>{

        })
    })
))

$.ajax({
    url: ~~,
    method: "get",
    dataType: "json",
    data: ~~,
    success: () => {

    },
    error: () => {

    }
})

function ajax(requestJson){
    let xhr = new XMLHttpRequest();

    requestJson.method = requestJson.method ? requestJson.method : "get";

    //요청
    xhr.open(requestJson.method, requestJson.url);

    xhr.onreadystatechange = function(){
        if(xhr.readyState === XMLHttpRequest.DONE){
            if(xhr.status === 200){
                let result = JSON.parse(xhr.responseText)
                requestJson.success();
            } else {
                requestJson.error(xhr.status);
            }
        }
    }
}

const testAPI2 = new Promise((resolve, reject) => {
    setTimeout(() => { //비동기통신에서 필요한 데이터 전달
        resolve("완료")
    }, 1000)
})

testAPI2().then((res) => {
    console.log(res)
}).error(() => {

});