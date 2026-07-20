import React from "react";
import "./App.css";

const element = "Office Space";

const sr =
  "https://images.unsplash.com/photo-1524758631624-e2822e304c36?auto=format&fit=crop&w=400&q=80";
const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

const officeList = [
  { Name: "DBS", Rent: 50000, Address: "Chennai" },
  { Name: "HSBC", Rent: 75000, Address: "Mumbai" },
  { Name: "TCS", Rent: 45000, Address: "Bangalore" },
  { Name: "Infosys", Rent: 68000, Address: "Hyderabad" },
];

let colors = [];
officeList.forEach((ItemName) => {
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }
});

const OfficeSpace = () => {
  return (
    <div>
      <h1>{element} , at Affordable Range </h1>
      {jsxatt}

      {officeList.map((ItemName, index) => (
        <div key={index}>
          <h1>Name: {ItemName.Name}</h1>
          <h3 className={colors[index]}> Rent: Rs. {ItemName.Rent}</h3>
          <h3> Address: {ItemName.Address}</h3>
        </div>
      ))}
    </div>
  );
};

export default OfficeSpace;