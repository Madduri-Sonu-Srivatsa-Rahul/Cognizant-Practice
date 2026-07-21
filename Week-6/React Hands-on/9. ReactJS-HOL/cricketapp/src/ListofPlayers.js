import React from "react";

const players = [
  { name: "Rohit Sharma", score: 50 },
  { name: "Shikar Dhawan", score: 70 },
  { name: "KL Rahul", score: 40 },
  { name: "Yuvraj Singh", score: 61 },
  { name: "Suresh Raina", score: 61 },
  { name: "Sachin Tendulkar", score: 95 },
  { name: "MS Dhoni", score: 100 },
  { name: "Virat Kohli", score: 84 },
  { name: "Ravindra Jadeja", score: 64 },
  { name: "Mohammed Siraj", score: 75 },
  { name: "Hardik Pandya", score: 80 }
];

function ListofPlayers() {

  const below70 = players.filter(player => player.score <= 70);

  return (
    <div>

      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>

      <hr />

      <h2>List of Players having Scores Less than 70</h2>

      <ul>
        {below70.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>

    </div>
  );
}

export default ListofPlayers;