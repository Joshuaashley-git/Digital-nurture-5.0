import React from "react";
import ListofPlayers from "./ListofPlayers";
import Indianplayers from "./Indianplayers";
import "./App.css";

function App() {
  const flag=false;

  let content;
  if(flag){
    content=<ListofPlayers/>
  }else{
    content=<Indianplayers/>
  }

  return (
    <div className="App">
      <div className="App">
        <h1>Cricket App</h1>
        {content}
      </div>
    </div>
  );
}

export default App;