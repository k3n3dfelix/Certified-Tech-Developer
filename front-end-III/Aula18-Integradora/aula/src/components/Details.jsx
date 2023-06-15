import React from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import hoteis from '../hoteis.json';

function Details() {

    const navigate = useNavigate();
    const params = useParams();
    const hotel = hoteis.filter((hotel) => String(hotel.id) === params.id);

    const handleRedirectToHomePage = () => {
        navigate(`/home`);
    }

    return (
        <div
        style={
            {
                border: "6px solid #644F7A",
                borderRadius: "5%",
                alignItems: "center",
                flexDirection: "column",
                width: "350px",
                height: "700px",
                transition: "all ease 0.3s",
                cursor: "pointer",
                padding: "0.5rem",
                marginRight: "15px",
                marginLeft: "15px",
                marginTop: "15px",
                marginBottom: "15px",
            }
        }
    >
        <img
            src={hotel[0].img}
            alt={hotel[0].name}
            style={
                {
                    width: "90%",
                    height: "30%",
                    borderRadius: "5%",
                }
            }
        />
        <div className="title">{hotel[0].name}</div>
        <div className="description">{hotel[0].city}</div>
        <div className="description">Diária {hotel[0].daily_price}</div>
        <div className="description">Descrição: {hotel[0].description}</div>
        <div className="wifi">Wi-FI: {hotel[0].wifi ? "SIM": "NÃO"}</div>
        <div className="air_conditioned">Ar-Condicionado: {hotel[0].air_conditioned ? "SIM": "NÃO"}</div>
        <div className="phone">Fone: {hotel[0].phone}</div>
        <div className="email">Email: {hotel[0].email}</div>
        <div className="description-stars">{hotel[0].stars} estrelas</div>
        <button
            onClick={() => { handleRedirectToHomePage()}}
            style={{ margin: "2%" }}>Voltar
        </button>
    </div>
    )
}

export default Details;