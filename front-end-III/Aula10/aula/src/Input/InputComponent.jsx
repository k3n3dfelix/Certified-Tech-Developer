import style from './InputComponent.module.css';

function InputComponent({title, type,value,fnOnChange}) {
    return (
        <>
            <label>{title ?? "Indefinido"}</label>
            <input 
                type={type ?? "text"} 
                value={value}
                onChange={fnOnChange}
            />
        </>
    )
}

export default InputComponent;