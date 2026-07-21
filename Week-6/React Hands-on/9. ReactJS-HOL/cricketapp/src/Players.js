import React from "react";

function Players(props) {

    return (
        <div>
            <ul>
                {
                    props.players.map((item, index) => (
                        <li key={index}>
                            {item.name} - {item.score}
                        </li>
                    ))
                }
            </ul>
        </div>
    );
}

export default Players;