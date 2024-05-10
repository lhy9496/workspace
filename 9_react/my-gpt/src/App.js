import logo from './logo.svg';
import './App.css';
import styled from 'styled-components';
import { DescriptText, Title } from './components/CommonStyles';

function App() {
  return (
    <AppContainer>
      <Header>
        <Title>나만의 GPT</Title>
      </Header>
      <Contents>

      </Contents>
      <Footer>
        
      </Footer>
    </AppContainer>
  );
}

export default App;

const AppContainer = styled.div`
  display: flex;
  flex-direction: column;
  height : 100vh;
  width: 100%;
  position: absolute;
  left: 0px;
  top: 0px;
  background: white;
  opacity: 0.6;
`
const Header = styled.div`
  padding: 60px 0 0 0;
  flex: 1;
`

const Footer = styled.div`
  height: 86px;

`

const Contents = styled.div`
  padding: 60px 0 0 0;
  flex: 1;
  overflow-y: scroll

`