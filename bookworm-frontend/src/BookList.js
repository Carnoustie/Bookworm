import React, { useEffect, useState } from 'react';
import axios from 'axios';

const BookList = () => {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    // Make GET request to the Spring Boot backend
    axios.get('http://localhost:8080/api/bookworm')
      .then((response) => {
        setBooks(response.data); // Update state with response data
      })
      .catch((error) => {
        console.error("There was an error fetching the books!", error);
      });
  }, []);

  return (
    <div>
      <ul>
        {books.map((book, index) => (
          <li key={index}>{book.title} by {book.author}</li>
        ))}
      </ul>
    </div>
  );
};

export default BookList;
