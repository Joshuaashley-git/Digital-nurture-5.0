import react from "react";

const players = [
    {id: 1, name: "Karthikeyan", score: 69},
    {id: 2, name: "Ramesh", score: 70},
    {id: 3, name: "Suresh", score: 71},
    {id: 4, name: "Ganesh", score: 72},
    {id: 5, name: "Ravi", score: 73},
    {id: 6, name: "Vijay", score: 74},
    {id: 7, name: "Arun", score: 75},
    {id: 8, name: "Kumar", score: 76},
    {id: 9, name: "Mani", score: 77},
    {id: 10, name: "Raja", score: 78},
    {id: 11, name: "Karthik", score: 79},
];

const ListofPlayers = () => {
  const lowScorers = players.filter((item) => item.score <= 70);
 
  return (
    <div>
      <h1>List of Players</h1>
      <ul>
        {players.map((item) => (
          <li key={item.id}>
            Mr. {item.name} {item.score}
          </li>
        ))}
      </ul>
 
      <h1>List of Players having Scores Less than 70</h1>
      <ul>
        {lowScorers.map((item) => (
          <li key={item.id}>
            Mr. {item.name} {item.score}
          </li>
        ))}
      </ul>
    </div>
  );
};
 
export default ListofPlayers;