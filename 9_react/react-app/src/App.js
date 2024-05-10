import logo from './logo.svg';
import './App.css';
import Menu from './components/Menu';
import Comment from './components/Comment';
import CommnetList from './components/CommentList';
import UserStateTest from './reactHook/UseStateTest';
import SignUp from './sample/SignUp';
import LandingPage from './sample/LandingPage';
import UseMemoTest from './reactHook/useMemo/UseMemoTest';
import UseCallbackTest from './reactHook/useCallback/UseCallbackTest';
import UseRefTest from './reactHook/UseRefTest';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import FoodMenu from './pages/FoodMenu';
import Home from './pages/Home';

/*
  react-router-dom
  react로 생성된 SPA 내부에서 페이지 이동이 가능하도록 만들어주는 라이브러리

  Router(BrowserRouter)
  history API를 이용해서 history 객체를 생성한다.
  라우팅을 진행할 컴포넌트 상위에 Router컴포넌트를 생성하고 감싸주어야 한다.

  Routes
  모든 Route의 상위경로. location 변경시 하위에 있는 모든 Route 중에서 현재 location과 맞는 Route 중에서
  현재 loaction과 맞는 Route를 찾아준다.
  
  Route
  현재 브라우저의 location(window.href.location)정보를 가져온다.
  => 상태에 따라서 다른 element를 렌더링한다.
*/

function App() {
  return (
    <Router>
      <div className="App">
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to = "/food">Food List</Link>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path='/' element={<Home />}/>
          <Route path='/food' element={<FoodMenu />}/>
        </Routes>
      </div>
    </Router>
  );
}

export default App;
