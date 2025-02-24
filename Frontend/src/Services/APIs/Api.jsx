import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:5120',
  timeout: 10000,
  headers: {
    'Content-Type': 'application/json',
  },
});

// Funciones para interactuar con la api

export const compileCode = async (code) => {
  const {data} = await api.post('/compile', { code });
  return data;
}