import { useState, useEffect } from 'react'
import axios from 'axios';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';

// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
//import './App.css'

function App() {

  const [comments, setComments] = useState([]);

  const buscarComments = async () => {
    const response = await axios.get('https://jsonplaceholder.typicode.com/comments');
    setComments(response.data);
    console.log('response.data', response.data);
  }
  useEffect(() => {
    buscarComments();

  }, [])

  const bull = (
    <Box
      component="span"
      sx={{ display: 'inline-block', mx: '2px', transform: 'scale(0.8)' }}
    >
      •
    </Box>
  );
  return (

    <>
      {comments.map(coment => {
        return (
          <>
            <Box
              sx={{
                width: 300,
                height: 300,
                backgroundColor: 'primary.dark',
                '&:hover': {
                  backgroundColor: 'primary.main',
                  opacity: [0.9, 0.8, 0.7],
                },
              }}
            >

              <Card sx={{ minWidth: 275 }} key={coment.id}>
                <CardContent>
                  <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                    {coment.name}
                  </Typography>
                  <Typography variant="body2">
                    {coment.body}
                    <br />
                    {'"a benevolent smile"'}
                  </Typography>
                </CardContent>
                <CardActions>
                  <Button size="small">Ler mais</Button>
                </CardActions>
              </Card>
            </Box>

          </>
        )
      })}
    </>

  )
}

export default App
