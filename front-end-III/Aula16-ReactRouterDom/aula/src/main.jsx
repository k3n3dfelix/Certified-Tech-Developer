import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import './index.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Episodes from './pages/Episodes';
import Characters from './pages/Characters';
import Character from './pages/Character';
import NotFound from './pages/NotFound';
import Locations from './pages/Locations';

ReactDOM.createRoot(document.getElementById('root')).render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />}/>
      <Route path="episodes" element={<Episodes />}/>
      <Route path="locations" element={<Locations />}/>
      <Route path="Characters" element={<Characters />}/>
      <Route path="character" element={<Character />}/>
      <Route path="*" element={<NotFound />}/>
        
     
    </Routes>
  </BrowserRouter>
);