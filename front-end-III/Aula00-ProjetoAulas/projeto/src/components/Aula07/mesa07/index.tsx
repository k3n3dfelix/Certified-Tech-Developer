import React, { useState } from 'react';
import { ListProduct } from './ListProduct';

export function ListaProdutos() {

    return (
        <>
            <h1>Lista Dinâmica</h1>
            <ul>
               <ListProduct></ListProduct>
            </ul>

        </>
    )
}