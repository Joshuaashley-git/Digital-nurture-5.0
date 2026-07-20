import React, {useState}from 'react';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
import Greeting from './components/Greeting';

function App(){
  const[isLoggedIn, setIsLoggedIn]=useState(false);

  function handleLoginClick(){
    setIsLoggedIn(true);
  }

  function handleLogoutClick(){
    setIsLoggedIn(false);
  }

  let button;
  if(isLoggedIn){
    button=<LogoutButton onClick={handleLogoutClick}/>;
  }else{
    button=<LoginButton onClick={handleLoginClick}/>;
  }

  return(
  <div style={{padding:'40px'}}>
    <Greeting isLoggedIn={isLoggedIn}/>
    {button}
  </div>
  );
}

export default App;