import style from './InputComponent.module.css';

function InputComponent({title, type,value,fnOnChange}) {
    return (
        <>  <div className={style.ContainerInputs}>
            <label className={style.label}>{title ?? "Indefinido"}</label>
            <input 
                type={type ?? "text"} 
                value={value}
                onChange={fnOnChange}
            />
            </div>
        </>
    )
}

export default InputComponent;