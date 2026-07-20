import React from 'react';

function BookDetails(props){
    if(!props.books||props.books.length===0){
        return<p>No books available at the moment.</p>;
    }

    const bookdet=(
        <ul>
            {props.books.map((book)=>(
                <div key={book.id}>
                    <h3>{book.bname}</h3>
                    <h4>₹Rs. {book.price}</h4>
                </div>

            ))}
        </ul>
    );

    return bookdet;

}


export default BookDetails;