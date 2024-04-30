let todoList = localStorage.getItem("todoList") ?
                JSON.parse(localStorage.getItem("todoList")) : [];

// JSON.stringify(todoList) => todoList변수에 담긴 배열요소를 String(문자열)로 변환
// JSON.parse(localStorage.getItem("todoList")) => localStorage.getItem("todoList")에 저장된 

//localStorage.setItem("todoList".JSON.stringify(todoList)); => localStorage 영역에 key, value 형태로 데이터 저장
//localStorage.ㅎetItem("todoList") => localStorage영역에 데이터를 key로 불러들이는 것

window.onload = function(){
    drawTodoList();
}

//할 일을 todoList에 넣어주기
function addTodo(){
    //input요소 가져오기
    const searchInput = document.querySelector("#search-bar input")
    todoList.puhs({
        title : searchInput.value,
        date : new Date().getTime(),
        isDone: false
    });

    searchInput.value = ""
    drawTodoList();
}

//할일 목록을 ui에 그려주기
function drawTodoList(){
    const removeTodo = function(removeTodo){
        //todoList에서 removeTodo와 같은 데이터를 삭제
        todoList = todoList.filter(t => (removeTodo.date !== t.date && removeTodo.title !== t.title));
        //반환값이 true인 데이터만 남기고 전부 삭제된 배열을 반환
        //todoList에서 todo와 같은 데이터를 삭제
        drawTodoList();
    }

    const toggleStatus = function(targetTodo){
        todoList.map(t => {
            if (t.date === targetTodo.date){
                t.isDone = !t.isDone;
            }
            return t;
        })
        drawTodoList();
    }
    //ul요소 가져오기
    const todoUl = document.querySelector(".todo-list");
    todoUl.innerHTML = "";
    
    for(let todo of todoList){
        //todoUl.innerHTML += `<li>${todo.title}
        //  <div class="todo-remove-button"><i class="fa-solid fa-xmark"></i></div>

        const todoLi = document.createElement('li'); //<li></li>
        todoLi.innerHTML = todo.title; //   <li>${todo.title}</li>;
        todoUl.appendChild(todoLi);//   todoUl.innnerHTML = <li>${todo.title}</li>;

        const remove
    }
}