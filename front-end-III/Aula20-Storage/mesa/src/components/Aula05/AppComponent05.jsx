import ctdEstrutura from '../../ctd_estrutura';
import ItemComponent from './ItemComponent';

export function AppComponent05() {
    return (
        <>
            {
                ctdEstrutura.map(item => {
                    return (
                        <ItemComponent
                            key={item.bimestre}
                            bimestre={item.bimestre}
                            ano={item.ano}
                            disciplinas={item.disciplinas}
                        />
                    )
                })
            }
        </>
    )
}