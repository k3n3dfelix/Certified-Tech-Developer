function InputComponent(props) {
    return (
        <>
            <label htmlFor={props.label}>{props.label}</label>
            <input type={props.type}></input>
        </>
    )
}

export default InputComponent;