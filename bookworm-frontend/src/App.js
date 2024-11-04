import logo from './logo.svg';
import './App.css';
import BookList from './BookList';



function AddMember(){
  return(
    <button>
    Add a member to the BookWorm Book club :)
    </button>
  );
}



function App() {
  return (
    <div className="App">
      <header className="App-header">
        Welcome to the Bookworm book club!
        <br/>
        <br/>
        <br/>
        The library currently holds the following books:
        <BookList/>
      </header>
      <br/>
      <br/>
      <button className = "member-button">
        Add a member to the BookWorm Book club
      </button>
      <br/>
      <br/>
      <button className = "book-button">
        Add a book to the BookWorm Book club library
      </button>
    </div>
  );
}



export default App;
