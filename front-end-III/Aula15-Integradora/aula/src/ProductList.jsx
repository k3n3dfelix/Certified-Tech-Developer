import style from "./ProductList.module.css";
import { useEffect } from "react";

function ProductList({ productsList, productIsLoading}) {
    return (
    <>
        {
            !productIsLoading ? productsList.map(product => {
                return (
                    <div
                        key={product.id}
                    >
                        <div className={style.title}>{product.title}</div>
                    </div>
                )
            }): 'Esta carrgando'
        }

    </>
    )
}

export default ProductList;