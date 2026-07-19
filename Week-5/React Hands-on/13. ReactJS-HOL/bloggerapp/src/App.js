import React, { Component } from "react";
import "./App.css";
import { books, blogs, courses } from "./Data";

class App extends Component {
  constructor() {
    super();

    this.state = {
      show: true,
    };
  }

  render() {
    const bookdet = (
      <ul>
        {books.map((book) => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}
      </ul>
    );

    const blogdet = (
      <div>
        {blogs.map((blog) => (
          <div key={blog.id}>
            <h2>{blog.title}</h2>
            <h4>{blog.author}</h4>
            <p>{blog.content}</p>
          </div>
        ))}
      </div>
    );

    const coursedet = (
      <div>
        {courses.map((course) => (
          <div key={course.id}>
            <h2>{course.cname}</h2>
            <h4>{course.date}</h4>
          </div>
        ))}
      </div>
    );

    return (
      <div className="container">
        {this.state.show && (
          <div className="course">
            <h1>Course Details</h1>
            {coursedet}
          </div>
        )}

        {this.state.show ? (
          <div className="book">
            <h1>Book Details</h1>
            {bookdet}
          </div>
        ) : null}

        {this.state.show ? (
          <div className="blog">
            <h1>Blog Details</h1>
            {blogdet}
          </div>
        ) : null}
      </div>
    );
  }
}

export default App;