import React from "react";
 
const teamPlayers = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvaraj5", "Raina6"];
const [first, second, third, fourth, fifth, sixth] = teamPlayers;
 
const oddPlayers = [first, third, fifth];
const evenPlayers = [second, fourth, sixth];
 
const T20players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];
 
const IndianPlayers = () => {
  return (
    <div>
      <h1>Odd Players</h1>
      <ul>
        <li>First : {oddPlayers[0]}</li>
        <li>Third : {oddPlayers[1]}</li>
        <li>Fifth : {oddPlayers[2]}</li>
      </ul>
 
      <h1>Even Players</h1>
      <ul>
        <li>Second : {evenPlayers[0]}</li>
        <li>Fourth : {evenPlayers[1]}</li>
        <li>Sixth : {evenPlayers[2]}</li>
      </ul>
 
      <h1>List of Indian Players Merged:</h1>
      <ul>
        {mergedPlayers.map((name, index) => (
          <li key={index}>Mr. {name}</li>
        ))}
      </ul>
    </div>
  );
};
 
export default IndianPlayers;