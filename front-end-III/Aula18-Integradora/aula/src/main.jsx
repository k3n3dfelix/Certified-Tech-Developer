import './index.css';
import ReactDOM from 'react-dom/client';

import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import Home from './components/Home/Home';
import Details from './components/Details';

ReactDOM.createRoot(document.getElementById('root')).render(

  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Navigate to={"/home"} />} />
      <Route path="/home" element={<Home />} />
      <Route path="/details/:id" element={<Details />} />
      

     
    </Routes>
  </BrowserRouter>
);