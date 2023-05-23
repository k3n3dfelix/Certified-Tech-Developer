import React, { useState } from 'react';

export function ListProduct() {
    const [listProduct, setProduct] = useState([]);

    const handleAddProduct = () => {
        const newProduct = `O item ${listProduct.length + 1} foi adicionado à lista!`;
        setProduct([...listProduct, newProduct]);
    }
    console.log(listProduct)
    return (
        <>  
            <button onClick={handleAddProduct}>Adicionar Produto</button>
            {listProduct.map((produto, index) => (
                <li key={index}>{produto}</li>
            ))}

            
        </>

    )
}