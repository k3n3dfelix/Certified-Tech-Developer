const { generateText, createElement } = require('../../util.js');

describe('Validação de texto de saída', () =>{

    // test('Saída de criação de elemento', () =>{
    //     const text = createElement('li', 'texto', 'user-item');
    //     expect(text).toBe('li', 'outputText', 'user-item');
    // })

    test('Saída de nome e idade', () =>{
        const text = generateText('Tiago Gomes', 28);
        expect(text).toBe('Tiago Gomes (28 years old)');
    })

    describe('Validate Create element',() => {
        test('Create new element with data', () => {
            const element = createElement('li', "exampleElement", 'user-item');
            expect(element.textContent).toMatch(/exampleElement/);
        });
       /*  test('Create new element without data', () => {
            const element = createElement(null);
            expect(element.textContent).toBe("");
        }); */
    })
    
})
