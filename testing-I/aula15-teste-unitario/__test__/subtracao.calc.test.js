const { subtracao } = require('../calc.js');

describe('Testes de subtração', () =>{

    test('Subtração de dois numeros', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

    test('Subtração de dois zeros', () =>{
        expect(subtracao(0,0)).toBe(0);
    })

    test('Subtração de strings', () =>{
        expect(subtracao("a","b")).toBe(NaN);
    })

    test('Subtração de negativo com positivo', () =>{
        expect(subtracao(-5,-5)).toBe(0);
    })

    test('Subtração de negativo com positivo', () =>{
        expect(subtracao(-5,-5)).toBe(0);
    })

});
