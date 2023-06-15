import HomeCard from './HomeCard';
import hoteis from '../../hoteis.json';

function Home() {
    return (
        <>
            <h1>Hoteis disponíveis</h1>

            <div style={
                {
                    display: "flex",
                    flexWrap: "wrap",
                    justifyContent: "center",
                }
            }>
                {   
                    hoteis.map(hotel => {
                        return (
                            <HomeCard
                                key={hotel.id}
                                hotel={hotel}
                            />

                        )
                    })
                }
            </div>

        </>
    );
}

export default Home;