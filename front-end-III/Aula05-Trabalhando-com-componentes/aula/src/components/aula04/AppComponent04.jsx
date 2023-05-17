
import HelloClassComponent from './HelloClassComponent';
import HelloFunctionComponent from './HelloFunctionComponent';
import { FormComponent } from './FormComponent';
import InputComponent from './InputComponent';

export function AppComponent04() {
    return (
        //Aula 4
        <>
            <HelloClassComponent></HelloClassComponent>

            <HelloFunctionComponent></HelloFunctionComponent>


            <FormComponent>
                <InputComponent label="Titulo" type="text"></InputComponent>
                <InputComponent label="Descrição" type="email"></InputComponent>
                <InputComponent label="Titulo" type="text"></InputComponent>
                <InputComponent label="Titulo" type="text"></InputComponent>
                <InputComponent label="Titulo" type="text"></InputComponent>
            </FormComponent>
        </>
    )
}