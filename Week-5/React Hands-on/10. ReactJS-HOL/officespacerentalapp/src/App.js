import React from "react";

function App(){
    const officeSpaces = [
        {
            Name: "Tech Park",
            Rent: 55000,
            Address: "Chennai",
            Image: "https://img.magnific.com/free-photo/modern-office-space-interior_158595-5206.jpg?semt=ais_hybrid&w=740&q=80"
        },
        {
            Name: "DLF Cyber City",
            Rent: 75000,
            Address: "Hyderabad",
            Image: "https://img.magnific.com/free-photo/modern-office-space-interior_158595-5206.jpg?semt=ais_hybrid&w=740&q=80"
        },
        {
            Name: "WeWork",
            Rent: 62000,
            Address: "Bangalore",
            Image: "https://via.placeholder.com/300x200"
        }
    ];

    return(
        <div style={{ margin: "20px" }}>
            <h1>Office Space Rental App</h1>
            {
                officeSpaces.map((office, index) => (
                    <div key={index} style={{ marginBottom: "30px" }}>
                        <img
                            src={office.Image}
                            alt={office.Name}
                            width="300"
                            height="200"
                        />
                        <h2>Name : {office.Name}</h2>
                        <h3 style={{color: office.Rent < 60000 ? "red" : "green"}}>
                            Rent : Rs. {office.Rent}
                        </h3>
                        <h3>Address : {office.Address}</h3>
                        <hr />
                    </div>
                ))
            }
        </div>
    );
}

export default App;