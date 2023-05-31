import style from './CardComponent.module.css';
import Sombra from './../../assets/sombra.png';

function CardComponent(props) {
    
    return (
        <div className={style.div}>
            <h2 className={style.title}>{props.title ?? 'Indefinido'}</h2>
            <img className={style.img} src={props.imgUrl ?? Sombra} alt="" />
        </div>
    )
}

export default CardComponent