import style from "./CardListComponent.module.css";

function CardsListComponent(props) {
    return (
        <div >
            {props.children}
        </div>
    );
}

export default CardsListComponent;