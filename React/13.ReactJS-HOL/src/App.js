import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import { books, blogs, courses } from './data';
import './App.css';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  let bookSection;
  if (showBooks) {
    bookSection = <BookDetails books={books} />;
  } else {
    bookSection = <p>Book section hidden.</p>;
  }

  return (
    <div>
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setShowBooks(!showBooks)}>
          {showBooks ? 'Hide' : 'Show'} Books
        </button>
        <button onClick={() => setShowBlogs(!showBlogs)}>
          {showBlogs ? 'Hide' : 'Show'} Blogs
        </button>
        <button onClick={() => setShowCourses(!showCourses)}>
          {showCourses ? 'Hide' : 'Show'} Courses
        </button>
      </div>

      <div className="st2">
        <h1>Book Details</h1>
        {bookSection}
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        {showBlogs ? <BlogDetails blogs={blogs} /> : <p>Blog section hidden.</p>}
      </div>

      <div className="mystyle1">
        <h1>Course Details</h1>
        {showCourses && <CourseDetails courses={courses} />}
      </div>
    </div>
  );
}

export default App;