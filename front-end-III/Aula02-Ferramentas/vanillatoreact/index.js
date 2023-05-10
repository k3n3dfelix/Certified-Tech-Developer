const div = document.getElementById("div");

const divRoot = ReactDOM.createRoot(div);

const element = React.createElement("h1", {}, "Front-End III");

function elementJSX() {
    return (
        <h1>Front End III</h1>
    );
}
divRoot.render(<elementJSX />);